package com.dlice.hello.repostitory;

import com.dlice.hello.model.user.entity.HelloUser;
import com.dlice.hello.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Date: 2020/9/3 22:20
 * @Author: dlice
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestUser {

    @Resource
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
