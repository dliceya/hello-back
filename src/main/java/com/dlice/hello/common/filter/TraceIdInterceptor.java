package com.dlice.hello.common.filter;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Random;
import java.util.UUID;

import static com.dlice.hello.common.constant.CommonConstant.TRACE_ID;

/**
 * @author 纸菌
 * 2020-09-03 14:33
 */
@Slf4j
public class TraceIdInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        // generate traceId
        String traceId = generateTraceId();

        // put traceId
        MDC.put(TRACE_ID, traceId);

        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
        MDC.remove(TRACE_ID);
    }

    /**
     * 生成链路跟踪ID
     * @return 链路跟踪ID
     */
    private String generateTraceId() {

        //随机8位

        String uid = UUID.randomUUID().toString().replace("-", "");

        int start = new Random().nextInt(24);

        return uid.substring(start, start + 8);
    }
}
