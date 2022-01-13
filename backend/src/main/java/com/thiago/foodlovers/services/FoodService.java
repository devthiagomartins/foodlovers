package com.thiago.foodlovers.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.thiago.foodlovers.dto.FoodDTO;
import com.thiago.foodlovers.entities.Food;
import com.thiago.foodlovers.repositories.FoodRepository;

@Service
public class FoodService {
	
	@Autowired
	private FoodRepository foodRepository;
	
	@Transactional(readOnly = true)
	public Page<FoodDTO> findAll(Pageable pageable){
		
		Page<Food> result = foodRepository.findAll(pageable);
		
		Page<FoodDTO> page = result.map(x -> new FoodDTO(x));
		
		return page;
	}
	

	@Transactional(readOnly = true)
	public FoodDTO findById(Long id){
		
		Food result = foodRepository.findById(id).get();
		
		FoodDTO dto = new FoodDTO(result);
		
		return dto;
	}

}
