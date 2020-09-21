package com.dlice.hello.service;

import com.dlice.hello.repository.UserRepository;
import org.springframework.stereotype.Service;

/**
 * @Date: 2020/9/21 22:30
 * @Author: dlice
 */
@Service
public class UserService {

    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//    public QueryResponseResult getUserList(UserQueryRequest userRequest, Pageable pageable){
//
//        QueryResult queryResult = new QueryResult();
//
//        queryResult.setList();
//
//        Iterable<HelloUser> all = userRepository.findAll();
//        all.
//
//        QueryResponseResult result = new QueryResponseResult(CommonCode.SUCCESS, );
//
//    }
}
