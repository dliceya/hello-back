package com.dlice.hello.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * desc
 *
 * @Auth mubai
 * @Date 2020/9/24 6:38 下午
 **/
@Component
@Aspect
public class TestAOP {

    @AfterReturning(value = "@annotation(com.dlice.hello.aop.AOP)", returning = "result")
    public void testAfterReturningAOP(JoinPoint point, Object result){

        System.out.println("执行后置通知，方法返回值为：" + result  + "方法返回值被修改为：\"AfterReturning\"");

        result = "AfterReturning";
    }

    @Before("@annotation(com.dlice.hello.aop.AOP)")
    public void testBeforeAOP(JoinPoint point){

        Object[] args = point.getArgs();
        String arg0 = (String) args[0];
        System.out.println("执行前置通知，方法参数为：");

    }


}
