package com.thiago.foodlovers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiago.foodlovers.entities.Food;

@Repository
public interface FoodRepository  extends JpaRepository<Food, Long>{

}
