package com.dlice.hello.CodeTest;

import com.dlice.hello.aop.annotation.AOP;
import com.dlice.hello.model.entity.HelloUser;
import com.dlice.hello.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CodeTest {

    @Autowired
    UserServiceImpl userServiceImpl;

    @Test
    public void testDataTime() throws InterruptedException {
        HelloUser user = new HelloUser();

        user.setIsActive(true);
        user.setUsername("dlice2");
        user.setNickname("Lucas2");
        user.setPassword("158156");
        user.setCreateTime(LocalDateTime.now());
        Thread.sleep(10000);

        List<HelloUser> list = userServiceImpl.list();
        System.out.println(list);
//      System.out.println(list);
        boolean save = userServiceImpl.save(user);
        System.out.println(save);
    }

    @Test
    public void test(){
        HelloUser user = userServiceImpl.getById(10);

        user.setEmail("25167@21.com");
        userServiceImpl.updateById(user);
    }

    @Test
    public void testReplace(){
        String mobilPhone = "17795793350";
        System.out.println(mobilPhone.replaceAll("(\\d{3})(\\d{4})(\\d{4})","$1****$2"));

    }

    @Test
    public void testAOP(){
        String test = this.test("123");
        System.out.println(test);

    }

    @AOP
    public String test(String args){
        return "11111";
    }
}
