package com.m2.springboot;

import com.m2.springboot.exceptionhandler.ProductNotfoundException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;

@RestController
public class HomeController {

    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/hello")
    public String invoke() {
        return "HELLO: " + appName;
    }

    @RequestMapping(value = "/products")
    public ResponseEntity<Object> listProduct() {
        HashMap products = new HashMap();
        products.put(1, "Honey");
        products.put(2, "Almond");
        return new ResponseEntity<>(products.values(), HttpStatus.OK);
    }

    @RequestMapping(value = "/products/{productName}")
    public ResponseEntity<Object> getProduct(@PathVariable String productName) {
        HashMap<Integer, String> products = new HashMap<Integer, String>();
        products.put(1, "Honey");
        products.put(2, "Almond");
        System.out.println(productName + " " + products.containsValue(productName));
        if (!products.containsValue(productName))
            throw new ProductNotfoundException();
        else
            return new ResponseEntity<>(products.values(), HttpStatus.OK);
    }

}
