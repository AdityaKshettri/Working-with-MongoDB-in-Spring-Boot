package com.aditya.mongodb.application.service;

import java.util.List;
import java.util.Optional;

import com.aditya.mongodb.application.entity.User;

public interface UserService 
{
	public void save(User user);
	public List<User> findAll();
	public Optional<User> findById(String id);
	public void deleteById(String id);
	public void update(User user);
}
