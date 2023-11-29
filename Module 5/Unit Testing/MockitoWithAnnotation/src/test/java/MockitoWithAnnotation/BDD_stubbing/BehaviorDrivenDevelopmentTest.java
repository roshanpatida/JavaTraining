package MockitoWithAnnotation.BDD_stubbing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BehaviorDrivenDevelopmentTest {
	
	@InjectMocks
	private BookService bookService;
	@Mock
	private BookRepository bookRepository;
	
	@Test
	public void demoStub() {
		
		
		
		 //  is this the traditional form of writting the stub but after the BDD we just write human readable code which is read by any of the develper
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
		
		// it is human readable
		
//		@Test
//		@DisplayName("Given - New books , when - findNewBooks , Then - assertEquals is check equality")
//	       public void bddFormOfStubbing() {
//			Book book1= new Book("111","Movckito in action",500,LocalDate.now());
//			Book book2= new Book("222","stub without mockito",400,LocalDate.now());
//			Collection<Book> newBooks =new ArrayList<>();
//			
//	 		newBooks.add(book1);
//			newBooks.add(book2);
//			
//			given(bookRepository).fi
//		}
//	

@Test
@DisplayName("Given - New books, When - Get new books with applied discount method is called, Then - New books with applied discount is returned")
public void test_Given_NewBooks_When_GetNewBooksWithAppliedDiscountIsCalled_Then_NewBooksWithAppliedDiscountIsReturned() {
	// Arrange - Given
	Book book1 = new Book("1234", "Mockito In Action", 500, LocalDate.now());
	Book book2 = new Book("1235", "JUnit 5 In Action", 400, LocalDate.now());
	
	List<Book> newBooks1 = new ArrayList<>();
	newBooks1.add(book1);
	newBooks1.add(book2);
	
//	given(bookRepository.findNewBooks(7)).thenReturn(newBooks1);
	
	// Act - When
	List<Book> newBooksWithAppliedDiscount = bookService.getNewBooksWithAppliedDiscount(10, 7);
	
	// Assert - Then
	assertEquals(2, newBooksWithAppliedDiscount.size());
	assertEquals(450, newBooksWithAppliedDiscount.get(0).getPrice());
	assertEquals(360, newBooksWithAppliedDiscount.get(1).getPrice());

	// AssertJ - BDDAssertions
//	then(newBooksWithAppliedDiscount).isNotNull();
//	then(newBooksWithAppliedDiscount.size()).isEqualTo(2);
//	then(newBooksWithAppliedDiscount.get(0).getPrice()).isEqualTo(450);
}
}

