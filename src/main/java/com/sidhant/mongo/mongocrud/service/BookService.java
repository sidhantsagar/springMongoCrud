package com.sidhant.mongo.mongocrud.service;

import org.springframework.stereotype.Service;

import com.sidhant.mongo.mongocrud.type.BookObject;

@Service
public interface BookService {

	public BookObject findAllBook();

	public BookObject findBookByBookId();

	public BookObject saveBook(BookObject bookBo);

	public BookObject updateBook(BookObject bookBo);

	public String deleteBook();
}
