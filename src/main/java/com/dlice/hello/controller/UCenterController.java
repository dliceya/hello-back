package com.dlice.hello.controller;

import com.dlice.hello.api.app.UCenterControllerApi;
import com.dlice.hello.common.model.response.CommonCode;
import com.dlice.hello.common.model.response.QueryResponseResult;
import com.dlice.hello.common.model.response.QueryResult;
import com.dlice.hello.dao.UserDao;
import com.dlice.hello.model.entity.HelloUser;
import com.dlice.hello.model.request.UserQueryRequest;
import com.dlice.hello.service.AOPTest;
import com.dlice.hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Date: 2020/9/3 21:45
 * @Author: dlice
 */
@RestController
@RequestMapping("/ucenter")
public class UCenterController implements UCenterControllerApi {


    @Resource
    UserDao userDao;

    @Autowired
    AOPTest test;

    final
    UserService userService;

    public UCenterController(UserService userService) {
        this.userService = userService;
    }

    @Override
    @GetMapping("get")
    public List<HelloUser> getUserInfoByName(@RequestParam @NonNull String username) {

        return userService.list();
    }

    @GetMapping("test")
    public void test(){
        test.run();
    }

    @PostMapping("list/page")
    public QueryResponseResult<HelloUser> userPage(UserQueryRequest request){

        List<HelloUser> userList = userDao.listUserPage(request);

        QueryResult<HelloUser> result = new QueryResult<>();
        result.setList(userList);
        result.setTotal(userList.size());

        return new QueryResponseResult<>(CommonCode.SUCCESS,result);
    }
}
