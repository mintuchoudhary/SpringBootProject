package com.m2.springboot;

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HomeController {

	
	@GetMapping("hello")
	public String invoke()
	{ 
		return "HELLO";
	}
	
}
