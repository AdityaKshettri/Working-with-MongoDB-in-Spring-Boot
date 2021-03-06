package com.aditya.mongodb.application.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Document(value = "post")
public class Post 
{
	@Id
	private String id;
	
	@NonNull
	private String name;
	
	@NonNull
	private String description;
	
	@NonNull
	private String username;
	
	@JsonIgnore
	@DBRef
	private User user;
}
