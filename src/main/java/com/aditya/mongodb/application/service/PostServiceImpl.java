package com.aditya.mongodb.application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aditya.mongodb.application.entity.Post;
import com.aditya.mongodb.application.entity.User;
import com.aditya.mongodb.application.repository.PostRepository;
import com.aditya.mongodb.application.repository.UserRepository;

@Service
public class PostServiceImpl implements PostService
{
	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void save(Post post) {
		User user = userRepository.findByUsername(post.getUsername());
		post.setUser(user);
		postRepository.save(post);
		user.getPosts().add(post);
		userRepository.save(user);
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
