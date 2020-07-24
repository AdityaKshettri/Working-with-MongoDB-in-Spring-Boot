package com.aditya.mongodb.application.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.aditya.mongodb.application.entity.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, Long>
{
	
}
