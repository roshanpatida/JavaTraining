package com.redisGradle.Service;

import com.redisGradle.Entity.Book;

public interface BookService {

	Book addBook( Book book);
	Book updateBook(Book book);
	Book getBook(long id);
	String deleteBook(long id);
	Book updateBook(Book book, long id);
	
}
