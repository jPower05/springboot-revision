package com.james.springbootrevision.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.james.springbootrevision.model.Book;

@Service
public class BookService {
	
	
	
	public List<Book> getBooks(){
		return List.of(
				new Book(
						1L,
						"Treasure Island",
						"Pirates and stuff",
						"Robert Louis Stephenson",
						"Fantasy",
						4.2)
				);	
	}
	
}
