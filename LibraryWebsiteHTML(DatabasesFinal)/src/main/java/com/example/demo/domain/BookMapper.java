package com.example.demo.domain;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface BookMapper {
	@Select("SELECT bookid, title, publisher FROM BOOK")
	List<Book> getBookList();
	
	@Select("SELECT bookid, title, publisher FROM BOOK where bookid = #{bookid}")
	Book getBook(Book book);
	
	@Update("update book set title = #{title}, publisher = #{publisher} where bookid = #{bookid}")
	void updateBook(Book book);
	
	@Insert("insert into book .... ")
	void insertBook(Book book);
}
