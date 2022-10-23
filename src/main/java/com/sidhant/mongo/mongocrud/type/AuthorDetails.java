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
public class AuthorDetails {
	
	@JsonProperty("authorId")
	private Long authorId = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("email")
	private String email = null;
}
