package com.caching.service;

public interface BookService {

	Book addBook(Book book);
	Book updateBook(Book book);
	Book  getBook(long id);
	String deleteBook(long id);
}
