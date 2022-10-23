package com.sidhant.mongo.mongocrud.mapper;

import com.sidhant.mongo.mongocrud.entity.Author;
import com.sidhant.mongo.mongocrud.entity.Book;
import com.sidhant.mongo.mongocrud.type.AuthorDetails;
import com.sidhant.mongo.mongocrud.type.BookObject;

public class BookMapper {

	public Book mapBookToSave(BookObject bookBo) {
		return Book.builder().name(bookBo.getName()).count(bookBo.getCount()).price(bookBo.getPrice())
				.author(authotDetailsToAuthorMapper(bookBo.getAuthorDetails())).build();
	}

	public AuthorDetails authorToAuthorDetailsMapper(Author author) {
		return AuthorDetails.builder().name(author.getName()).email(author.getEmailId()).build();
	}

	public Author authotDetailsToAuthorMapper(AuthorDetails authorDetails) {
		return Author.builder().authorId(authorDetails.getAuthorId()).name(authorDetails.getName())
				.emailId(authorDetails.getEmail()).build();
	}

	public Book mapBookToUpdate(BookObject bookBo) {
		return Book.builder().bookId(bookBo.getBookId()).name(bookBo.getName()).count(bookBo.getCount())
				.price(bookBo.getPrice()).author(authotDetailsToAuthorMapper(bookBo.getAuthorDetails())).build();
	}
}
