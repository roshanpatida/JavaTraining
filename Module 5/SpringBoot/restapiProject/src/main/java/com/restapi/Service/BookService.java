package com.restapi.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.restapi.entities.Book;

@Component
public class BookService {

	private static List<Book> list = new ArrayList<>();
//	static {
//		list.add(new Book(12,"Java Complete Reference", "Xyz"));
//		list.add(new Book(14,"Pythod full cource","Merrio"));
//		list.add(new Book(15,"Spring course", "timcook"));
		
//	}
	
	//get all books
	
	public List<Book> getAllBooks(){
		return list;
		
	}
	
	//get single book by id
	public Book getBookById( int id) {
		Book book = null;
		book = list.stream().filter(e->e.getId()==id).findFirst().get();
		return book;
		
	}
	
	//adding the books
	public Book addBook(Book b) {
		list.add(b);
		return b;
	}
	
	// delete book handler
	
	public void deleteBook(int bid) {
		list = list.stream().filter(book->book.getId()!=bid).collect(Collectors.toList());
		
	
	}
	// update the book
	public void updateBook(Book book,int bookId) {
		list.stream().map(b->{
			if(b.getId()==bookId) {
				b.setTitle(book.getTitle());
				b.setAuthor(book.getAuthor());
				
			}
			return b;
			
		}).collect(Collectors.toList());
	}
}
