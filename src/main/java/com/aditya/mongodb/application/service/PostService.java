package com.aditya.mongodb.application.service;

import java.util.List;
import java.util.Optional;

import com.aditya.mongodb.application.entity.Post;

public interface PostService 
{
	public void save(Post post);
	public List<Post> findAll();
	public Optional<Post> findById(String id);
	public void deleteById(String id);
	public void update(Post post);
}
