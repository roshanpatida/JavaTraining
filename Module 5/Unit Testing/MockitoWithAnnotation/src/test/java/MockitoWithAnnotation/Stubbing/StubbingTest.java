package MockitoWithAnnotation.Stubbing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;



@ExtendWith(MockitoExtension.class)// this annotation is used  in Junit 5 and we used in Junit 4 @runWith(MockitoAnnotation.
public class StubbingTest {
	
	@InjectMocks
	private BookService bookService;

	@Mock
	private BookRepository bookRepository;
	
	public void testStubbing() {
		List<String> bookId = new ArrayList<>();
		bookId.add("111");
		bookId.add("222");
		 
		Book book1= new Book("111","Movckito in action",500,LocalDate.now());
		Book book2= new Book("222","stub without mockito",400,LocalDate.now());
		// first feature of perform  stubbing
//		when(bookRepository.findBookById("111")).thenReturn(book1); // we passed this id with the mentioned method
//	   when(bookRepository.findBookById("222")).thenReturn(book2);
//	   
//	   
	   // second feature of perform stubbing
	   doReturn(book1).when(bookRepository).findBookById("111");
	   doReturn(book2).when(bookRepository).findBookById("222");
		 int actualCost = bookService.CalculateTotalCost(bookId);  //calculate the costing of creating the Books 
		 assertEquals(900,actualCost); //  check it actualCost and 900 is matched if it correct so testing is successful
		 
	}
	
	    @Test
		 public void testSaveBook() {
				Book book1= new Book("111","Movckito in action",500,LocalDate.now());
				when(bookRepository).save(book1);
				bookService.addBook(book1);
 
		 }
		 }
	
	
	


