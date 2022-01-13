package com.thiago.foodlovers.dto;


public class ScoreDTO {
	
	private Long foodId;
	private String email;
	private Double score;
	
	public ScoreDTO() {
		
	}

	public Long getFoodId() {
		return foodId;
	}

	public void setFoodId(Long foodId) {
		this.foodId = foodId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}
	
	
	
	
	

}
