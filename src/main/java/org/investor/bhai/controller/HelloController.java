package org.investor.bhai.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	
	@RequestMapping( "/hello")
	public String hello() {
		
		return "hello world";
		
	}
	
//	@RequestMapping("/hello")
//    public String helloWorld() {
//        return "Hello World RESTful with Spring Boot";
//    } 
//	

}
