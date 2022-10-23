package com.sidhant.mongo.mongocrud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sidhant.mongo.mongocrud.entity.Book;

@Repository
public interface BookRepository extends MongoRepository<Book, Integer> {

}
