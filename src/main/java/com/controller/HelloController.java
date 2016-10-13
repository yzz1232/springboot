package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Vote;
import com.mapper.VoteMapper;
import com.server.MulipDataSource;
import com.service.IHelloService;

@RestController  
@RequestMapping("hello")
public class HelloController {
	
	
	
	@Autowired
	private VoteMapper voteMapper;
	
	@RequestMapping("/")
	@ResponseBody
	public int hello(){
		MulipDataSource.setDataSourceKey("two");
		int i = voteMapper.getAllVote();
		MulipDataSource.setDataSourceKey("one");
		int j = voteMapper.getActivity();
		return i+j;
	}
	
}
