package com.m2.springboot.handlerinterceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Component
public class HandlerInterceptorConfig extends WebMvcConfigurerAdapter {
    @Autowired
    HandlerInterceptorDemo handlerInterceptorDemo;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(handlerInterceptorDemo);
    }
}
