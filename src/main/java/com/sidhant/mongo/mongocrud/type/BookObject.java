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
public class BookObject {

	@JsonProperty("bookId")
	private Integer bookId = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("price")
	private Integer price = null;

	@JsonProperty("authorDetails")
	private AuthorDetails authorDetails = null;

	@JsonProperty("count")
	private Integer count = null;
}
