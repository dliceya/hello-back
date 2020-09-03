package com.hello.app.repostitory;

import com.hello.app.model.entity.HelloUser;
import com.hello.app.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Date: 2020/9/3 22:20
 * @Author: dlice
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestUser {

    @Autowired
    UserRepository userRepository;

    @Test
    public void testAddUser(){
        HelloUser user = new HelloUser();
        user.setUsername("dlice");
        user.setEmail("158156325@qq.com");
        user.setNickname("Lucas");
        user.setPassword("158156");
        user.setPhone("17795793350");

        userRepository.save(user);
    }
}
