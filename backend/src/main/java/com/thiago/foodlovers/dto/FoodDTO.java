package com.thiago.foodlovers.dto;

import com.thiago.foodlovers.entities.Food;

public class FoodDTO {
	
	private Long id;
	private String title;
	private Double score;
	private Integer count;
	private String image;
	
	public FoodDTO() {
		
	}
	
	

	public FoodDTO(Long id, String title, Double score, Integer count, String image) {
		this.id = id;
		this.title = title;
		this.score = score;
		this.count = count;
		this.image = image;
	}
	
	public FoodDTO(Food food) {
		id = food.getId();
		title = food.getTitle();
		score = food.getScore();
		count = food.getCount();
		image = food.getImage();
	}


	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
	

}
