package com.m2.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin(origins = "http://localhost:8080")
/**
 * Cross-Origin Resource Sharing (CORS) is a security concept that allows restricting the resources
 * For example, your web application is running on 8080 port and by using
 * JavaScript you are trying to consuming RESTful web services from 9090 port
 */
public class ThymeLeafController {

    @RequestMapping(value = "/welcome")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/")
    public String welcome() {
        return "index";
    }
}
