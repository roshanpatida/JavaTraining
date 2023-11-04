package com.restapi.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.Service.BookService;
import com.restapi.entities.Book;

@RestController
public class BookController {

	@Autowired
	private BookService bookservice;

	@GetMapping("/books")
	public List<Book> getBooks() {
/*  public ResponseEntity<List<Book>> getBooks(){
 * List<Book> list  = bookService.getAllBooks();
 * 
 * if(list.size()<=0){
 * return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
 * }
 * return ResposeEntity.of(optional.of(list)); 
 * }
 * */
		
		return this.bookservice.getAllBooks();

	}

	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable("id") int id) {
		
	
		return bookservice.getBookById(id);
		/* 
		 * public ResponseEntit<Book> getBook(@PathVariable("id")int id){
		 * 
		 * Book book = bookService.getBookById(id);
		 * if(book==null){
		 * return ResposneEntity.status(HttpStatus.NOT_FOUND).build();
		 * }
		 * return ResponseEntity.of(Optional.of(book));
		 * 
		 * 
		 * 
		 * 
		 * */
	}

	@PostMapping("/books")
	public ResponseEntity<Book> addBook(@RequestBody Book book) {
		Book b =null;
		try {
			
				this.bookservice.addBook(book);
		System.out.println(book);
		return ResponseEntity.of(Optional.of(b));
		}
		catch(Exception e){
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@DeleteMapping("/books/{bookId}")
	public void deleteBook(@PathVariable("bookId") int bookId) {
		this.bookservice.deleteBook(bookId);
	}
	//update book handler
	@PutMapping("/books/{bookId}")
	public ResponseEntity<Book> update(@RequestBody Book book, @PathVariable("booId") int bookId) {
	try {
		this.bookservice.updateBook(book, bookId);
		return ResponseEntity.ok().body(book);
	}
	catch(Exception e) {
		e.printStackTrace();
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}
	}
}
