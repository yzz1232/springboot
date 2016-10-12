package com.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import org.springframework.transaction.annotation.Transactional;

import com.entity.Vote;

public interface VoteMapper {
	
	public int getAllVote();
	
}
