package com.dlice.hello.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dlice.hello.aop.annotation.AutoLogger;
import com.dlice.hello.dao.UserDao;
import com.dlice.hello.model.entity.HelloUser;
import com.dlice.hello.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@AutoLogger(AutoLogger.LoggerType.All)
public class UserServiceImpl extends ServiceImpl<UserDao, HelloUser> implements UserService {

    @Resource
    UserDao userDao;

}
