package com.m2.springboot.resttemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestTemplateConsumer {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/products/api")
    public String getProductList() {
        return restTemplate.getForObject("http://localhost:8080/products", String.class);

    }

}
