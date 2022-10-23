package com.sidhant.mongo.mongocrud.helper;

import org.springframework.beans.factory.annotation.Autowired;

import com.sidhant.mongo.mongocrud.entity.Book;
import com.sidhant.mongo.mongocrud.mapper.BookMapper;
import com.sidhant.mongo.mongocrud.repository.BookRepository;
import com.sidhant.mongo.mongocrud.type.BookObject;

public class BookHelper {

	@Autowired
	private BookMapper bookMapper;

	@Autowired
	private BookRepository bookRepository;

	public BookObject saveBook(BookObject bookBo) {
		Book bookEntiy = bookRepository.save(bookMapper.mapBookToSave(bookBo));
		return BookObject.builder().bookId(bookEntiy.getBookId()).name(bookEntiy.getName()).price(bookEntiy.getPrice())
				.count(bookEntiy.getCount())
				.authorDetails(bookMapper.authorToAuthorDetailsMapper(bookEntiy.getAuthor())).build();
	}
}
