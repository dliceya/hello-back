package com.dlice.hello.aop;

import com.alibaba.fastjson.JSON;
import com.dlice.hello.aop.annotation.AutoLogger;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * desc 记录方法返回值和执行时间
 *
 * @Auth dlice
 * @Date 2020/9/24
 **/
@Slf4j
@Aspect
@Component
public class AutoLoggerAOP {
//    @AfterReturning(value = "@annotation(logger)")
//    public void testAfterReturningAOP(JoinPoint point, AutoLogger logger){
//    }
//
//    @Before("@annotation(logger)")
//    public void testBeforeAOP(JoinPoint point, AutoLogger logger){
//    }

    @Around(value = "@within(logger)")
    public Object recordLog(ProceedingJoinPoint point, AutoLogger logger) {

        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("Method: " + point.toShortString());

        if (!AutoLogger.LoggerType.Response.equals(logger.value())){
            sb.append(", Args: ").append(JSON.toJSONString(point.getArgs()));
        }

        Object result = null;
        try {
            result = point.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        if (!AutoLogger.LoggerType.Request.equals(logger.value())){
            sb.append(", Result: ").append(JSON.toJSON(result));
        }
        long end = System.currentTimeMillis();
        long time = end - start;

        String timeMessage =  "ExecuteTime：" + time + "ms" + ", Desc: " + logger.description() + ", ";
        sb.insert(0, timeMessage);

        if (time > 1000) {
            log.error(sb.toString());
        } else if(time > 500){
            log.warn(sb.toString());
        } else
            log.info(sb.toString());
        return result;
    }

}
