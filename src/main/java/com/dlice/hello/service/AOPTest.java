package com.dlice.hello.service;

import com.dlice.hello.aop.AOP;
import org.springframework.stereotype.Service;

/**
 * @Date: 2020/9/24 20:01
 * @Author: dlice
 */
@Service
public class AOPTest {

    @AOP("werwer")
    public String test(String arg){
        System.out.println("方法真正入参为：" + arg);
        return "123";
    }

    public void run(){
        String qed = this.test("qed");

        System.out.println("方法最终返回值：" + qed);
    }


}
