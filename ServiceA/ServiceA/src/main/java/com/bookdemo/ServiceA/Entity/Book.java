package com.bookdemo.ServiceA.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Book {


    private Integer id;
	String bookName;
	String authName;
	int bookPrice;
	
//	public Book() {}
//	
//	public Book(Integer id, String bookName, String authName, int bookPrice) {
//		super();
//		this.id = id;
//		this.bookName = bookName;
//		this.authName = authName;
//		this.bookPrice = bookPrice;
//	}
//	public Integer getId() {
//		return id;
//	}
//	public void setId(Integer id) {
//		this.id = id;
//	}
//	public String getBookName() {
//		return bookName;
//	}
//	public void setBookName(String bookName) {
//		this.bookName = bookName;
//	}
//	public String getAuthName() {
//		return authName;
//	}
//	public void setAuthName(String authName) {
//		this.authName = authName;
//	}
//	public int getBookPrice() {
//		return bookPrice;
//	}
//	public void setBookPrice(int bookPrice) {
//		this.bookPrice = bookPrice;
//	}
//	
//	
}
