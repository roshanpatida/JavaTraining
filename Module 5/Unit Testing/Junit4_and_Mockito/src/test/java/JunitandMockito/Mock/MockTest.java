package JunitandMockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;




public class MockTest {

	@Test
	public void demoMock() {
		BookServiceMock bookServiceMock = new BookServiceMock();
		BookService bookService = new BookService(bookServiceMock);
		
		Book book1 = new Book("123","Spy test double",500,LocalDate.now());
		Book book2 = new Book("111","Mockito  test double ",500,LocalDate.now());
		
		bookServiceMock.verify(null, 0);
		
		
	}
	
	@Test
	public void demoMockWithMockito() {
		BookRepository bookServiceMock = Mockito.mock(BookRepository.class);
		BookService bookService = new BookService(bookServiceMock);
		
		Book book1 = new Book("123","Spy test double",500,LocalDate.now());
		Book book2 = new Book("111","Mockito  test double ",500,LocalDate.now());
	bookService.addBook(book1);
	bookService.addBook(book2);
	
		Mockito.verify(bookServiceMock,Mockito.times(1)).save(book2); // it will called 1 time for save
		Mockito.verify(bookServiceMock,Mockito.times(0)).save(book1); //it will return only 
		
	}
}
