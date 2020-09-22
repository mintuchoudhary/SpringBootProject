package com.m2.springboot.servletinitializer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Spring Boot Servlet Initializer class file allows you to
 * configure the application when it is launched by using Servlet Container.
 */
@SpringBootApplication
public class SpringBootServletInitializerDemo extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootServletInitializerDemo.class,args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return super.configure(builder);
      // return builder.sources(SpringApplicationBuilder.class);
    }
}
