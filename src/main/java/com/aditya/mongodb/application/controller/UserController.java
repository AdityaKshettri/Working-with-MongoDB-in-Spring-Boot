package com.aditya.mongodb.application.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aditya.mongodb.application.entity.User;
import com.aditya.mongodb.application.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController 
{
	@Autowired
	private UserService userService;
	
	@GetMapping("")
	public List<User> findAll() {
		return userService.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<User> findById(@PathVariable String id) {
		return userService.findById(id);
	}
	
	@PostMapping("")
	public void save(@RequestBody User user) {
		userService.save(user);
	}
	
	@PutMapping("")
	public void update(@RequestBody User user) {
		userService.update(user);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable String id) {
		userService.deleteById(id);
	}
}
