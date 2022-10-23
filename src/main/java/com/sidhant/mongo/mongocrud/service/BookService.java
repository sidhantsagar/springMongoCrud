package com.sidhant.mongo.mongocrud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sidhant.mongo.mongocrud.exception.NotFoundException;
import com.sidhant.mongo.mongocrud.type.BookObject;

@Service
public interface BookService {

	public List<BookObject> findAllBook();

	public BookObject findBookByBookId() throws NotFoundException;

	public BookObject saveBook(BookObject bookBo);

	public BookObject updateBook(BookObject bookBo);

	String deleteBookById(Integer bookId);
}
