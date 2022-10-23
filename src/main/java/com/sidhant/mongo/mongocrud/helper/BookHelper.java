package com.sidhant.mongo.mongocrud.helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import com.sidhant.mongo.mongocrud.entity.Book;
import com.sidhant.mongo.mongocrud.exception.NotFoundException;
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

	public BookObject fetchBookById() throws NotFoundException {
		Optional<Book> bookEntity = bookRepository.findById(12345);
		if (bookEntity.isPresent()) {
			return BookObject.builder().bookId(bookEntity.get().getBookId()).name(bookEntity.get().getName())
					.price(bookEntity.get().getPrice()).count(bookEntity.get().getCount())
					.authorDetails(bookMapper.authorToAuthorDetailsMapper(bookEntity.get().getAuthor())).build();
		} else {
			throw new NotFoundException(404, "Book matching to this id not found!!");
		}
	}

	public List<BookObject> fetchAllBooks() {
		List<BookObject> bookListResponse = new ArrayList<>();
		List<Book> bookListFromDb = bookRepository.findAll();
		if (!CollectionUtils.isEmpty(bookListFromDb)) {
			bookListFromDb.forEach(book -> {
				BookObject bookObject = BookObject.builder().bookId(book.getBookId()).name(book.getName())
						.price(book.getPrice()).count(book.getCount())
						.authorDetails(bookMapper.authorToAuthorDetailsMapper(book.getAuthor())).build();
				bookListResponse.add(bookObject);
			});
		}
		return bookListResponse;
	}

	public BookObject updateBook(BookObject bookBo) {
		Book bookEntiy = bookRepository.save(bookMapper.mapBookToSave(bookBo));
		return BookObject.builder().bookId(bookEntiy.getBookId()).name(bookEntiy.getName()).price(bookEntiy.getPrice())
				.count(bookEntiy.getCount())
				.authorDetails(bookMapper.authorToAuthorDetailsMapper(bookEntiy.getAuthor())).build();
	} 
	
	public BookObject deleteBookById() throws NotFoundException {
		try {
			bookRepository.deleteById(12345);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;

	}
}
