package com.dlice.hello.config;

import com.dlice.hello.common.filter.TraceIdInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Date: 2020/9/24 23:33
 * @Author: dlice
 */
@Configuration
public class test implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 可添加多个
        registry.addInterceptor(new TraceIdInterceptor()).addPathPatterns("/**");
    }

}
