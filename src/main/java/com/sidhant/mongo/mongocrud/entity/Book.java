package com.sidhant.mongo.mongocrud.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Builder

@Document(collection = "book")
public class Book {
	private Integer bookId;
	private String name;
	private Integer price;
	private Author author;
	private Integer count;
}
