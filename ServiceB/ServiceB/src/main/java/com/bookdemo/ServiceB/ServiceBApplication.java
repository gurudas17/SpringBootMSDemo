package com.bookdemo.ServiceB;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookdemo.ServiceB.Entity.Book;
import com.bookdemo.ServiceB.repository.BookRepository;

@SpringBootApplication
public class ServiceBApplication {

	@Autowired
	BookRepository bookRep;
	public static void main(String[] args) {
		SpringApplication.run(ServiceBApplication.class, args);
	}


	
}

class InitialDBRecords implements CommandLineRunner
{

	@Autowired
	BookRepository bookRep;

	@Override
	public void run(String... args) throws Exception {
		
		List<Book> bookList = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			bookList.add( new Book (i+1,"Book"+i, "Auth"+i, 100+i));
		}

		bookRep.saveAll(bookList);
		
	}
	
}