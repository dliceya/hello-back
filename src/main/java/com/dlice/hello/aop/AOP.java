package com.dlice.hello.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * desc
 *
 * @Auth mubai
 * @Date 2020/9/24 6:48 下午
 **/

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.TYPE})
public @interface AOP {
    String value() default "";
}
