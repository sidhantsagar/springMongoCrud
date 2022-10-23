package com.sidhant.mongo.mongocrud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sidhant.mongo.mongocrud.exception.NotFoundException;
import com.sidhant.mongo.mongocrud.helper.BookHelper;
import com.sidhant.mongo.mongocrud.service.BookService;
import com.sidhant.mongo.mongocrud.type.BookObject;

public class BookServiceImpl implements BookService {

	@Autowired
	private BookHelper bookHelper;

	@Override
	public List<BookObject> findAllBook() {
		return bookHelper.fetchAllBooks();
	}

	@Override
	public BookObject findBookByBookId() throws NotFoundException {
		return bookHelper.fetchBookById();
	}

	@Override
	public BookObject saveBook(BookObject bookBo) {
		return bookHelper.saveBook(bookBo);
	}

	@Override
	public BookObject updateBook(BookObject bookBo) {
		return bookHelper.updateBook(bookBo);
	}

	@Override
	public String deleteBookById(Integer bookId) {
		// TODO Auto-generated method stub
		return null;
	}

}
