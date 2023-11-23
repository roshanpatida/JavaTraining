package Fack_Test_double_without_mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import Unit_testing_Wothout_Mockito.Mock.Book;
import Unit_testing_Wothout_Mockito.Mock.BookService;




public class MockTest {

	@Test
	public void demoMock() {
		BookServiceMock bookServiceMock = new BookServiceMock();
		BookService bookService = new BookService(bookServiceMock);
		
		Book book1 = new Book("123","Spy test double",500,LocalDate.now());
		Book book2 = new Book("111","Mockito  test double ",500,LocalDate.now());
		
		bookServiceMock.verify(null, 0);
		
		
	}
}
