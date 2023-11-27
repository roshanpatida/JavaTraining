package MockitoWithAnnotation.Stub;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class StubTestUsingAnnotation {
	
	@InjectMocks
	private BookService bookService;
	@Mock
	private BookRepository bookRepository;
	
	@Test
	public void demoStub() {
		
		
		
		
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


