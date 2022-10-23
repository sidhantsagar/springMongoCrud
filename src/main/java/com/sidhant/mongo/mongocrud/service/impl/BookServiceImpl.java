package com.sidhant.mongo.mongocrud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.sidhant.mongo.mongocrud.helper.BookHelper;
import com.sidhant.mongo.mongocrud.mapper.BookMapper;
import com.sidhant.mongo.mongocrud.repository.BookRepository;
import com.sidhant.mongo.mongocrud.service.BookService;
import com.sidhant.mongo.mongocrud.type.BookObject;

public class BookServiceImpl implements BookService {

	@Autowired
	private BookHelper bookHelper;

	@Autowired
	private BookMapper bookMapper;

	@Autowired
	private BookRepository bookRepository;

	@Override
	public BookObject findAllBook() {

		return null;
	}

	@Override
	public BookObject findBookByBookId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookObject saveBook(BookObject bookBo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookObject updateBook(BookObject bookBo) {
		return bookHelper.saveBook(bookBo);
	}

	@Override
	public String deleteBook() {
		// TODO Auto-generated method stub
		return null;
	}

}
