package com.bookapp.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.model.entities.Book;
import com.bookapp.model.service.BookService;
@RestController
@RequestMapping(path="api")

public class BookRestController {
	private BookService bookService;

	@Autowired
	public BookRestController(BookService bookService) {
		this.bookService = bookService;
	}
	
	//------get all books-----@GetMapping
	
	@GetMapping(path = "books")
	public List<Book> getAll(){
		return bookService.getAllBooks();
	}

}
