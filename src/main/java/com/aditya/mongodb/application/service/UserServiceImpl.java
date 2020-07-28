package com.aditya.mongodb.application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aditya.mongodb.application.entity.User;
import com.aditya.mongodb.application.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	private UserRepository userRepository;

	@Override
	public void save(User user) {
		userRepository.save(user);
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public Optional<User> findById(String id) {
		return userRepository.findById(id);
	}

	@Override
	public void deleteById(String id) {
		userRepository.deleteById(id);
	}

	@Override
	public void update(User user) {
		userRepository.save(user);
	}

}
