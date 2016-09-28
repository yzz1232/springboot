package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.IHelloService;

@RestController  
public class HelloController {
	
	@Autowired
	private IHelloService service;	
	
	@RequestMapping("/")
	public String hello(){
		service.hello();
		return "hello";
	}
	
}
