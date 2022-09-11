package com.bookdemo.ServiceB.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookdemo.ServiceB.Entity.Book;
import com.bookdemo.ServiceB.service.BookService;

@RestController

@RequestMapping ("/Books")
public class ServiceBController {
	
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
		Optional<Book> book = 	bookServ.getBookById(id);
		
		if(book.isPresent())
			return (Book) book.get();
		else
			return null;
	}
		

	@PostMapping("/")
	public void addBook (@RequestBody Book b)
	{
			bookServ.addBook(b);
	}
	
	

}
