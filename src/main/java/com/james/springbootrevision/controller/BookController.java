package com.james.springbootrevision.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.james.springbootrevision.model.Book;
import com.james.springbootrevision.service.BookService;

@RestController
@RequestMapping(path = "api/book")

public class BookController {
	
	private final BookService bookService;
	
	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@GetMapping
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
}
