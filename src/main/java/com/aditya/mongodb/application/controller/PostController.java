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

import com.aditya.mongodb.application.entity.Post;
import com.aditya.mongodb.application.service.PostService;

@RestController
@RequestMapping("/posts")
public class PostController 
{
	@Autowired
	private PostService postService;
	
	@GetMapping("")
	public List<Post> findAll() {
		return postService.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Post> findById(@PathVariable Long id) {
		return postService.findById(id);
	}
	
	@PostMapping("")
	public void save(@RequestBody Post post) {
		postService.save(post);
	}
	
	@PutMapping("")
	public void update(@RequestBody Post post) {
		postService.update(post);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		postService.deleteById(id);
	}
}
