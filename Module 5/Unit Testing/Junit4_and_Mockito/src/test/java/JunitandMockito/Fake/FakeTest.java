package JunitandMockito.Fake;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Test;

public class FakeTest {

	@Test
	public void testFake() {
		BookRepository bookRepository = new FakeBookRepository();
		BookService bookService = new BookService(bookRepository);
		bookService.addBook(new Book("123","fake test double unit testing without mockito",223,LocalDate.now()));
		bookService.addBook(new Book("122","fake test double program creating without mockito using the fake repository and fake test clas ",222,LocalDate.now()));
		
		assertEquals(2,bookService.findnumberOfBooks());
	}
	
	@Test
	public void testFakeWithMockito() {
		BookRepository bookRepository = mock(BookRepository.class);
		BookService bookService = new BookService(bookRepository);
		
		Book book1 =new Book("121","this fake test double with mockito",121,LocalDate.now());
		Book book2 = new Book("111","it check fake test double",233,LocalDate.now());
		
	Collection<Book> books = new ArrayList<>();
	books.add(book1);
	books.add(book2);
	when(bookRepository.findAll()).thenReturn(books);
	assertEquals(2, bookService.findnumberOfBooks());
		
		
	}
}
