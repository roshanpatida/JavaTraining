package Fack_Test_double_without_mockito.stub;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import Unit_testing_Wothout_Mockito.Stub.Book;
import Unit_testing_Wothout_Mockito.Stub.BookRepository;
import Unit_testing_Wothout_Mockito.Stub.BookService;


public class StubTest {

	
	@Test
	public void demoStub() {
		
		
		BookRepository bookRepository = new BookRepositoryStub();
		BookService bookService = new BookService(bookRepository);
		
		List<Book> NewBooksWithAppliedDiscount = bookService.getNewBooksWithAppliedDiscount(10, 7);
		
		assertEquals(2, NewBooksWithAppliedDiscount.size());
		assertEquals(450, NewBooksWithAppliedDiscount.get(0).getPrice());
		assertEquals(360, NewBooksWithAppliedDiscount.get(1).getPrice());
	}
}
