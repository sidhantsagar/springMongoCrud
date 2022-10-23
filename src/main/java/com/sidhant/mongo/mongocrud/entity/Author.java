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

@Document(collection = "author")
public class Author {
	private Long authorId;
	private String name;
	private String emailId;
}
