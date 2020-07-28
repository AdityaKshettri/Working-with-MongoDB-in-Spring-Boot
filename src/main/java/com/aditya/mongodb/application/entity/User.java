package com.aditya.mongodb.application.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class User 
{
	@Id
	private String id;
	
	private String username;
	private String email;
	private String password;
	
	@DBRef
	private List<Post> posts = new ArrayList<Post>();
}
