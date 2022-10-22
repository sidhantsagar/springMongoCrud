package com.sidhant.mongo.mongocrud.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "author")
public class Author {
	private String name;
	private String emailId;
}
