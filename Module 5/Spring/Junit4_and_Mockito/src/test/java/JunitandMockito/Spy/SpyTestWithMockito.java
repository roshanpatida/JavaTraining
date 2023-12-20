package JunitandMockito.Spy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import JunitandMockito.Dummy.BookRepository;

public class SpyTestWithMockito {

	@Test
	public void demoSpy() {
		BookServiceSpy bookServicespy = new BookServiceSpy();
		BookService bookService = new BookService(bookServicespy);
		
		Book book1 = new Book("123","Spy test double",500,LocalDate.now());
		Book book2 = new Book("111","Mockito  test double ",500,LocalDate.now());
		
		
		bookService.addBook(book2);
		bookService.addBook(book1);
		
		assertEquals(2, bookServicespy.timesCalled());
//		assertTrue(bookServicespy.calledWith(book2));
	}
	
	@Test
	public void demoSpywithMockito() {
//		BookRepository bookServicespy = mock(BookRepository.class);
		JunitandMockito.Spy.BookRepository bookServicespy = spy(JunitandMockito.Spy.BookRepository.class);
		BookService bookService = new BookService(bookServicespy);
		
		Book book1 = new Book("123","Spy test double",500,LocalDate.now());
		Book book2 = new Book("111","Mockito  test double ",500,LocalDate.now());
		
		
		bookService.addBook(book2);
		bookService.addBook(book1);
		
		
	
}}
