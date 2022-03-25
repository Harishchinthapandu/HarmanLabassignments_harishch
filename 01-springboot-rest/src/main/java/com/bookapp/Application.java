package com.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.model.entities.Book;
import com.bookapp.model.service.BookService;

@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	private BookService bookService;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		bookService.addBook(new Book("rich dad poor dad", 300.00));
		bookService.addBook(new Book("monk who sold farari", 200.00));
		bookService.addBook(new Book("you can win", 240.00));
	}

}
