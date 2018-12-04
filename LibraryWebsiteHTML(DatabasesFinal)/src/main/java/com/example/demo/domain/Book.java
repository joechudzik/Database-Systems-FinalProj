package com.example.demo.domain;

public class Book {
	public int bookid;
	private String title;
	private String publisher;
	
	public Book(int bookid, String title, String publisher) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.publisher = publisher;
	}
	public Book() {
		
	}
	
	public int getBookID() {
		return bookid;
	}
	public void setBookID(int bookid){
		this.bookid = bookid;
	}
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getPublisher(){
		return publisher;
	}
	public void setPublisher(String publisher){
		this.publisher = publisher;
	}
}
