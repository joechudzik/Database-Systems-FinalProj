package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.domain.Book;
import com.example.demo.domain.BookMapper;

@Component
public class BookDAO {
	
	@Autowired
	BookMapper bookMapper;
	
	public BookDAO() {
		
	}
	
	public List<Book> getBookList() {
		List<Book> bookList = new ArrayList<Book>();
		bookList = bookMapper.getBookList();
		return bookList;
	}
	
	public void insertBook(Book book){
		
	}
	
	public Book getBook(Book book) {
		return bookMapper.getBook(book);
	}
	
	public void updateBook(Book book) {
		bookMapper.updateBook(book);
	}
	
}
