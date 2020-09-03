package com.hello.app.controller.app;

import com.hello.app.api.app.UCenterControllerApi;
import com.hello.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date: 2020/9/3 21:45
 * @Author: dlice
 */
@RestController
@RequestMapping("/ucenter")
public class UCenterController implements UCenterControllerApi {

    @Autowired
    UserRepository userRepository;

    @GetMapping
    @Override
    public String getUserInfoByName(@RequestParam @NonNull String username) {
        return userRepository.getByUsername("dlice").toString();
    }

}
