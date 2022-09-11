package com.bookdemo.ServiceB.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookdemo.ServiceB.Entity.Book;
import com.bookdemo.ServiceB.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

@Autowired	
BookRepository bookRepo;
@Override
	public List<Book> getAllBooks ()
	{
		
		return bookRepo.findAll();
	}
	@Override
	public Optional <Book>  getBookById (int id)
	{
		
		return bookRepo.findById(id);
		
	}

	@Override
	public void addBook(Book book) {

			bookRepo.save(book);
		
	}
	
	
}
