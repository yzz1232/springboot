package com.service.impl;

import org.springframework.stereotype.Service;

import com.service.IHelloService;

@Service
public class HelloServiceImpl implements IHelloService{

	public void hello() {
		System.out.println("hello");
	}
	
}
