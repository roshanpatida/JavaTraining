package JunitandMockito.Dummy;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Test;



public class DummyTest {
// it just used only code compile and throw messege if any erro
	@Test
	public void demoDummy() {
		BookRepository bookRepository = new FakeBookRepository();
		EmailService emailService = new DummyEmailService();
		BookService bookService = new BookService(bookRepository,emailService);
		bookService.addBook(new Book("123","fake test double unit testing without mockito",223,LocalDate.now()));
		bookService.addBook(new Book("12","fake test double program creating without mockito using the fake repository and fake test clas ",222,LocalDate.now()));
		
		assertEquals(2,bookService.findnumberOfBooks());
	}
	
	public void dummyTestDoubleWithMockito() {
		BookRepository bookRepository = mock(BookRepository.class);
		EmailService emailService = mock(EmailService.class);
		BookService bookService = new BookService(bookRepository,emailService);
		
		
		Book book1 = new Book("121","this is dummy test double with mockito",232,LocalDate.now());
		Book book2  = new Book("2121","this is dummy test double with mockito",2323,LocalDate.now());
		
		
		Collection<Book> books = new ArrayList<>();
	books.add(book1);
	books.add(book2);
	
	when(bookRepository.findAll()).thenReturn(books);
		assertEquals(2, bookService.findnumberOfBooks());
	
	}
}
