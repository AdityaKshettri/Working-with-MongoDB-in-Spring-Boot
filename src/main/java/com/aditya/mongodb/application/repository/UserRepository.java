package com.aditya.mongodb.application.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.aditya.mongodb.application.entity.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> 
{
	public User findByUsername(String username);
}
