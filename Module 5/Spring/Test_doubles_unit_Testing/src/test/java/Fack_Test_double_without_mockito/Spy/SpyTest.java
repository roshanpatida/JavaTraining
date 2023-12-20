package Fack_Test_double_without_mockito.Spy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import Unit_testing_Wothout_Mockito.Spy.Book;
import Unit_testing_Wothout_Mockito.Spy.BookRepository;
import Unit_testing_Wothout_Mockito.Spy.BookService;

public class SpyTest {

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
}
