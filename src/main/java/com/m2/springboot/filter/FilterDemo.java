package com.m2.springboot.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * A filter is an object used to intercept the HTTP requests and responses of your application. By using filter, we can perform two operations at two instances −
 *
 * Before sending the request to the controller
 * Before sending a response to the client.
 * Note - When filter is enabled HandlerInterceptor does not work
 */
/*


@Component
public class FilterDemo implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("FilterDemo : init method");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("FilterDemo : doFilter method");
    }

    @Override
    public void destroy() {
        System.out.println("FilterDemo : destroy method");
    }
}

*/
