package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mapper.VoteMapper;
import com.service.IHelloService;

@RestController  
@RequestMapping("hello")
public class HelloController {
	
	@Autowired
	private VoteMapper voteMapper;
	
	@RequestMapping("/")
	@ResponseBody
	public String hello(){
		return voteMapper.getAllVote().toString();
	}
	
}
