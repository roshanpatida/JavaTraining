package JunitandMockito.Stub;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.Test;


public class StubTest {

	
	@Test
	public void demoStub() {
		
		
		BookRepository bookRepository = mock(BookRepository.class);
		BookService bookService = new BookService(bookRepository);
		
		Book book1= new Book("111","Movckito in action",500,LocalDate.now());
		Book book2= new Book("222","stub without mockito",400,LocalDate.now());
		Collection<Book> newBooks =new ArrayList<>();
			
 		newBooks.add(book1);
		newBooks.add(book2);
	when(bookRepository.findNewBooks(7)).thenReturn((List<Book>) newBooks);
		
		List<Book> NewBooksWithAppliedDiscount = bookService.getNewBooksWithAppliedDiscount(10, 7);
		
		assertEquals(2, NewBooksWithAppliedDiscount.size());
		assertEquals(450, NewBooksWithAppliedDiscount.get(0).getPrice());
		assertEquals(360, NewBooksWithAppliedDiscount.get(1).getPrice());
	}
}
