package com.thiago.foodlovers.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thiago.foodlovers.dto.FoodDTO;
import com.thiago.foodlovers.dto.ScoreDTO;
import com.thiago.foodlovers.entities.Food;
import com.thiago.foodlovers.entities.Score;
import com.thiago.foodlovers.entities.User;
import com.thiago.foodlovers.repositories.FoodRepository;
import com.thiago.foodlovers.repositories.ScoreRepository;
import com.thiago.foodlovers.repositories.UserRepository;

@Service
public class ScoreService {
	
	@Autowired
	private FoodRepository foodRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ScoreRepository scoreRepository;
	
	@Transactional
	public FoodDTO saveScore(ScoreDTO dto) {
		
		User user = userRepository.findByEmail(dto.getEmail());
		
		if(user == null) {
			user = new User();
			user.setEmail(dto.getEmail());
			user = userRepository.saveAndFlush(user);
		}
		
		Food food = foodRepository.findById(dto.getFoodId()).get();
		
		Score score = new Score();
		score.setFood(food);
		score.setUser(user);
		score.setValue(dto.getScore());
		
		score = scoreRepository.saveAndFlush(score);
		
		double sum = 0.0;
		for(Score s : food.getScores()) {
			sum += s.getValue();
		}
		
		double avg = sum / food.getScores().size();
		
		food.setScore(avg);
		food.setCount(food.getScores().size());
		
		food = foodRepository.save(food);
		
		return new FoodDTO(food);
		
	}
	
	

}
