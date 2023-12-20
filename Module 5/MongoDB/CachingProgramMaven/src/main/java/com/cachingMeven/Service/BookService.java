package com.cachingMeven.Service;

import com.cachingMeven.dto.Book;

public interface BookService {

	Book addBook( Book book);
//	Book updateBook(Book book);
	Book getBook(long id);
	String deleteBook(long id);
	Book updateBook(Book book, long id);
	
}
