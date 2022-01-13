package com.thiago.foodlovers.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thiago.foodlovers.dto.FoodDTO;
import com.thiago.foodlovers.services.FoodService;

@RestController
@RequestMapping(value = "/foods")
public class FoodController {
	
	@Autowired
	private FoodService foodService;
	
	@GetMapping
	public Page<FoodDTO> findAll(Pageable pageable){
		
		return foodService.findAll(pageable);
		
	}
	
	

	@GetMapping(value = "/{id}")
	public FoodDTO findById(@PathVariable Long id){
		
		return foodService.findById(id);
		
	}
}
