package com.entity;

public class Vote {
	
	private long voteId;

	private String userId;
	
	private String date;
	
	private long activitiId;

	

	public long getActivitiId() {
		return activitiId;
	}

	public void setActivitiId(long activitiId) {
		this.activitiId = activitiId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public long getVoteId() {
		return voteId;
	}

	public void setVoteId(long voteId) {
		this.voteId = voteId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
}
