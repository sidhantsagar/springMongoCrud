package com.sidhant.mongo.mongocrud.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "book")
public class Book {
	private String name;
	private String price;
	private Author authorDetails;
	private Integer count;
}
