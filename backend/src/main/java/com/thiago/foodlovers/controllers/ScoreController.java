package com.thiago.foodlovers.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thiago.foodlovers.dto.FoodDTO;
import com.thiago.foodlovers.dto.ScoreDTO;
import com.thiago.foodlovers.services.ScoreService;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {
	
	@Autowired
	private ScoreService scoreService;
	

	

	@PutMapping
	public FoodDTO saveScore(@RequestBody ScoreDTO dto){
		
		FoodDTO foodDTO = scoreService.saveScore(dto);
		return foodDTO;
		
	}
}
