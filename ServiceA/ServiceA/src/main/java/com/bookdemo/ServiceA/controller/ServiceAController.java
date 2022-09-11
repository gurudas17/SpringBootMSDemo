package com.bookdemo.ServiceA.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookdemo.ServiceA.Entity.Book;
import com.bookdemo.ServiceA.service.BookService;

@RestController

public class ServiceAController {
	
	@Autowired
	BookService bookServ;
	@GetMapping("/")
	public List<Book> getAllBooks ()
	{
		return bookServ.getAllBooks();
	}

	@GetMapping("/{id}")
	public Book getBookbyId (@PathVariable  ("id") int id)
	{
		return bookServ.getBookbyId(id);//getBookById(id);
	}
		

	@PostMapping("/")
	public void addBook (@RequestBody Book b)
	{
			bookServ.addBook(b);
	}
	
		
	
}
