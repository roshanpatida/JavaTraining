package ArgumentMatchers.ArgumentMatchers;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.contains;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.junit.jupiter.MockitoExtension;

import ArgumentMatchers.argumentMatchers.Book;
import ArgumentMatchers.argumentMatchers.BookRepository;

import ArgumentMatchers.argumentMatchers.BookService;



@ExtendWith(MockitoExtension.class)// this annotation is used  in Junit 5 and we used in Junit 4 @runWith(MockitoAnnotation.
public class matchersTest {
	
	@InjectMocks
	private BookService bookService;

	@Mock
	private BookRepository bookRepository;
	 
	
	@Test
	public void BehaviorTest() {
		
		
		Book book1 = new Book("111","Argument Matchers",500,LocalDate.now());
		Book book2 = new Book("111","Argument Matchers",800,LocalDate.now());
		
		when(bookRepository.findBookById(any())).thenReturn(book1);
		bookService.updatePrice("111", 800);
		verify(bookRepository).save(book1);
		
	}
	
	public void testUsertitle() {
		Book book1 = new Book("111","Argument Matchers",500,LocalDate.now());
//		when(bookRepository.findBookByTitleAndPublishedDate("Argument Matchers", LocalDate.now())).thenReturn(book1);
//		when(bookRepository.findBookByTitleAndPublishedDate("Argument Matchers", any())).thenReturn(book1);

		when(bookRepository.findBookByTitleAndPublishedDate("Argument Matchers", any())).thenReturn(book1);Book actualDate = bookService.getBookByTitleAndPublishedDate("Argument Matchers", LocalDate.now());
		assertEquals("Argument Matchers", actualDate.getTitle());
		
	}
	@Test
	public void testSpecificTypeOfArgumentMatchers() {
		Book book = new Book("1234", "Mockito In Action", 600, LocalDate.now());
		when(bookRepository.findBookByTitleAndPriceAndIsDigital(anyString(), anyInt(), anyBoolean())).thenReturn(book);
		Book actualBook = bookService.getBookByTitleAndPriceAndIsDigital("Mockito In Action", 600, true);
		assertEquals("Mockito In Action", actualBook.getTitle());
	}
		@Test
		public void testCollectionTypeArgumentMatchers() {
			List<Book> books = new ArrayList<>();
			Book book = new Book("1234", "Mockito In Action", 600, LocalDate.now());
			books.add(book);
			bookService.addBooks(books);
			verify(bookRepository).saveAll(anyList()); // anySet, anyMap, anyCollection
		}
		@Test
		public void testStringTypeArgumentMatchers() {
			Book book = new Book("1234", "Mockito In Action", 600, LocalDate.now());
			when(bookRepository.findBookByTitleAndPriceAndIsDigital(contains("Action"), anyInt(), anyBoolean())).thenReturn(book);
			Book actualBook = bookService.getBookByTitleAndPriceAndIsDigital("JUnit 5 In Action", 600, true);
			assertEquals("Mockito In Action", actualBook.getTitle());
		}
//  int type argument Matchers 
		public void testIntTypeArgumentMatchers(){
			Book book = new Book("1234", "Mockito In Action", 600, LocalDate.now());
			when(bookRepository.findBookByTitleAndPriceAndIsDigital("Mockito In Action",anyInt(),anyBoolean())).thenReturn(book);
			Book actualBook = bookService.getBookByTitleAndPriceAndIsDigital("Junit 5 in action", 600, true);
			assertEquals(600, actualBook.getPrice());		
		}

		

		 }

				
	
	


