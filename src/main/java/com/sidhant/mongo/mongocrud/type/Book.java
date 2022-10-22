package com.sidhant.mongo.mongocrud.type;

import com.fasterxml.jackson.annotation.JsonProperty;

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
public class Book {

	@JsonProperty("name")
	private String name;

	@JsonProperty("price")
	private String price;

	@JsonProperty("author")
	private Author author;

	@JsonProperty("count")
	private Integer count;
}
