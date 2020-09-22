package com.m2.springboot.handlerinterceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Interceptor in Spring Boot perform operations under the following situations −
 * Before sending the request to the controller
 * Before sending the response to the client
 *
 * For example, you can use an interceptor to add the request header before sending the request to the controller and add the response header before sending the response to the client.
 * NOTE - you need to register the interceptor to make it active
 */

@Component
public class HandlerInterceptorDemo implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        System.out.println("Pre Handle method is Calling");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response,
                           Object handler, ModelAndView modelAndView) throws Exception {

        System.out.println("Post Handle method is Calling");
    }

    @Override
    public void afterCompletion
            (HttpServletRequest request, HttpServletResponse response, Object
                    handler, Exception exception) throws Exception {

        System.out.println("Request and Response is completed");
    }
}
/** Output:
 * Pre Handle method is Calling
 * Honey true (business logic)
 * Post Handle method is Calling
 * Request and Response is completed
 */
