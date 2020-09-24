package com.dlice.hello.aop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * desc
 *
 * @Auth mubai
 * @Date 2020/9/24 6:38 下午
 **/
@Aspect
public class TestAOP {
    @After(value = "@annotation(com.dlice.hello.aop.AOP)")
    public void testBeforeAOP(Joinpoint point){
        System.out.println("开始执行前置通知");
    }
}
