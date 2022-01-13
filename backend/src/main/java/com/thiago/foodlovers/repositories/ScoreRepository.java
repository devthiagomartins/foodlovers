package com.thiago.foodlovers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiago.foodlovers.entities.Score;
import com.thiago.foodlovers.entities.ScorePK;

@Repository
public interface ScoreRepository  extends JpaRepository<Score, ScorePK>{

}
