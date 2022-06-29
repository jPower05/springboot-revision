package com.james.springbootrevision.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.james.springbootrevision.model.Book;

public interface BookRepository extends MongoRepository<Book, String> {

	  Optional<Book> findBookByTitle(String title);
	  

}
