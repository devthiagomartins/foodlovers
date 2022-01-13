package com.thiago.foodlovers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiago.foodlovers.entities.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long>{

	User findByEmail(String email);
}
