package com.cachingMeven.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cachingMeven.Repository.BookRepository;
import com.cachingMeven.Service.BookService;
import com.cachingMeven.dto.Book;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	@PostMapping("/add")
	public Book addBook(@RequestBody Book book) {
		return this.bookService.addBook(book);
	}

	@GetMapping("/get/{id}")
	public Book getBook(@PathVariable("id") long id) {
		return this.bookService.getBook(id);
	}

	@PutMapping("/update/{id}")
	public void updateBook(@PathVariable("id") long id ,@RequestBody Book book) {
		this.bookService.updateBook(book, id);
	}							
	   @PutMapping("/book")
	    public Book updateBook(@RequestBody Book book) {
	        return bookService.updateBook(book);
	    }
	   @PutMapping("/bookCategory")
	    public Book updateBookCategory(@RequestBody Book book) {
	        return bookService.updateBook(book);
	    }

	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable long id) {
		return this.bookService.deleteBook(id);
}

}
