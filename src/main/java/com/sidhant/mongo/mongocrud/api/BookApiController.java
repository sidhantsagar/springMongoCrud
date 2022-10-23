package com.sidhant.mongo.mongocrud.api;

import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sidhant.mongo.mongocrud.api.BookApi;
import com.sidhant.mongo.mongocrud.type.BookObject;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-10-23T01:52:35.045Z[GMT]")
@RestController
public class BookApiController implements BookApi {

	private static final Logger log = LoggerFactory.getLogger(BookApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@org.springframework.beans.factory.annotation.Autowired
	public BookApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	public ResponseEntity<BookObject> addBook(
			@Parameter(in = ParameterIn.DEFAULT, description = "Create a new Book in the store", required = true, schema = @Schema()) @Valid @RequestBody BookObject body) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<BookObject>(objectMapper.readValue(
						"{\n  \"author\" : {\n    \"name\" : \"fehguy\",\n    \"email\" : \"email\"\n  },\n  \"name\" : \"198772\",\n  \"count\" : 0.8008281904610115,\n  \"id\" : 10\n}",
						BookObject.class), HttpStatus.NOT_IMPLEMENTED);
			} catch (IOException e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<BookObject>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<BookObject>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<Void> deleteBook(
			@Parameter(in = ParameterIn.PATH, description = "Book id to delete", required = true, schema = @Schema()) @PathVariable("BookId") BigDecimal bookId) {
		String accept = request.getHeader("Accept");
		return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<BookObject> getBookById(
			@Parameter(in = ParameterIn.PATH, description = "ID of Book to return", required = true, schema = @Schema()) @PathVariable("BookId") BigDecimal bookId) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<BookObject>(objectMapper.readValue(
						"{\n  \"author\" : {\n    \"name\" : \"fehguy\",\n    \"email\" : \"email\"\n  },\n  \"name\" : \"198772\",\n  \"count\" : 0.8008281904610115,\n  \"id\" : 10\n}",
						BookObject.class), HttpStatus.NOT_IMPLEMENTED);
			} catch (IOException e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<BookObject>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<BookObject>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<BookObject> getBooks() {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<BookObject>(objectMapper.readValue(
						"{\n  \"author\" : {\n    \"name\" : \"fehguy\",\n    \"email\" : \"email\"\n  },\n  \"name\" : \"198772\",\n  \"count\" : 0.8008281904610115,\n  \"id\" : 10\n}",
						BookObject.class), HttpStatus.NOT_IMPLEMENTED);
			} catch (IOException e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<BookObject>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<BookObject>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<BookObject> updateBook(
			@Parameter(in = ParameterIn.DEFAULT, description = "Update an existent Book in the store", required = true, schema = @Schema()) @Valid @RequestBody BookObject body) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<BookObject>(objectMapper.readValue(
						"{\n  \"author\" : {\n    \"name\" : \"fehguy\",\n    \"email\" : \"email\"\n  },\n  \"name\" : \"198772\",\n  \"count\" : 0.8008281904610115,\n  \"id\" : 10\n}",
						BookObject.class), HttpStatus.NOT_IMPLEMENTED);
			} catch (IOException e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<BookObject>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<BookObject>(HttpStatus.NOT_IMPLEMENTED);
	}

}
