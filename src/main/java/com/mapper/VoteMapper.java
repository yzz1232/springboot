package com.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import org.springframework.transaction.annotation.Transactional;

import com.entity.Vote;

public interface VoteMapper {
	
	@Select("select voteId,userId from vote")
	public List<Vote> getAllVote();
	
	@Transactional("")
	public int insert();
}
