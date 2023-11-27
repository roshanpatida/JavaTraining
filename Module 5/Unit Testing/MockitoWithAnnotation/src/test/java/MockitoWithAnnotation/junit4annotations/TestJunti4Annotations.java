package MockitoWithAnnotation.junit4annotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import MockitoWithAnnotation.Stub.Book;
import MockitoWithAnnotation.Stub.BookRepository;
import MockitoWithAnnotation.Stub.BookService;

public class TestJunti4Annotations {
	
	
//	@Rule
//	public MockitoRule mockitoRule = MockitoJUnit.rule();

	@InjectMocks
	private BookService bookService;
	@Mock
	private BookRepository bookRepository;

@BeforeEach // this is use for junit 4 unit testing
public void BeforeEach() {
	MockitoAnnotations.initMocks(this);
}
	
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




