package com.aditya.mongodb.application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aditya.mongodb.application.entity.Post;
import com.aditya.mongodb.application.repository.PostRepository;

@Service
public class PostServiceImpl implements PostService
{
	@Autowired
	private PostRepository postRepository;
	
	@Override
	public void save(Post post) {
		postRepository.save(post);
	}

	@Override
	public List<Post> findAll() {
		return postRepository.findAll();
	}

	@Override
	public Optional<Post> findById(String id) {
		return postRepository.findById(id);
	}

	@Override
	public void deleteById(String id) {
		postRepository.deleteById(id);
	}

	@Override
	public void update(Post post) {
		postRepository.save(post);
	}

}
