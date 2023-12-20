package com.cachingMeven.Service;


import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.cachingMeven.Repository.BookRepository;
import com.cachingMeven.dto.Book;



@Service
public class BookServiceImpl implements BookService {

	
	private static final Logger logger = (Logger) LoggerFactory.getLogger(BookServiceImpl.class);
	
	@Autowired
	private BookRepository  bookRepository;

	@Override
	public Book addBook(Book book) {
		logger.info("adding book with - {}",book.getId());
		 return bookRepository.save(book);
	}

	 @Override
	    @CachePut(cacheNames = "books", key="#id")
	    public Book updateBook(Book book, long id) {
//	        bookRepository.updateAddress(book.getId(), book.getName());
		 book.setId(id);
		 bookRepository.save(book);
	        logger.info("book updated with new name");
	        return book;
	    }


	@Override
	@Cacheable(cacheNames = "books", key = "#id")
	public Book getBook(long id) {
	Optional<Book> book = bookRepository.findById(id);
	if(book.isPresent()){
		return book.get();
	}else {
		return new Book();
	}
	
	}

	@Override
	@CacheEvict(cacheNames = "books", key = "#id")
	public String deleteBook(long id) {
		bookRepository.deleteById(id);
		return "deleted data";
	}

	
}
