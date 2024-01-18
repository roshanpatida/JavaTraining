	package MockitoWithAnnotation.BehaviorVerification;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.atMostOnce;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import MockitoWithAnnotation.BehaviorVarification.Book;
import MockitoWithAnnotation.BehaviorVarification.BookRepository;
import MockitoWithAnnotation.BehaviorVarification.BookRequest;
import MockitoWithAnnotation.BehaviorVarification.BookService;



@ExtendWith(MockitoExtension.class)// this annotation is used  in Junit 5 and we used in Junit 4 @runWith(MockitoAnnotation.
public class VerificationTest {
	
	@InjectMocks
	private BookService bookService;

	@Mock
	private BookRepository bookRepository;
	 
	
	@Test
	public void BehaviorTest() {
		BookRequest bookRequest = new BookRequest("Mockito",500,LocalDate.now());
		
		Book book= new Book("111","Movckito",500,LocalDate.now());
		bookService.addBook(bookRequest);
//		verify(bookRepository).save(book);
		verify(bookRepository,times(0)).save(book); // we just check it how many times it was called . if it is verify so  will testing is successful 
		
		 }
	
	@Test
	public void BehaviorTest1() {
		BookRequest bookRequest = new BookRequest("Mockito",500,LocalDate.now());
		
		Book book= new Book("111","Movckito",500,LocalDate.now());
		bookService.addBook(bookRequest);
//		verify(bookRepository).save(book);
		//  behavior varification just check it that passing data argument will matched with method of repository is addBook where we passed the argument data so if both are matched so equals method will getting successful in the tesing.
		 verify(bookRepository,times(0)).save(book); // save method called with data of book which is passed in the test class and we also passed the bookRequest data in the test class so it will check the arugment data also and perform test results.
		 }
	
	@Test
	public void priceUpdateTest() {
		bookService.updatePrice(null, 500);
		verifyNoInteractions(bookRepository);// we passed  as a argument book repository beacouse it check  becuse this method takes mock object so we assign mock to the bookRepository.
	}
	
	
	@Test
	public void priceUpdate2() {
		Book book= new Book("111","Movckito",500,LocalDate.now());
     when(bookRepository.findBookById("111")).thenReturn(book); // se use stubbing in this  line checked it if find method will called so return the book entity of data.
     bookService.updatePrice("111", 590);
//     verify(bookRepository).findBookById("111");
//     verify(bookRepository).save(book);
//     verifyNoMoreInteractions(bookRepository);
     
     InOrder inOrder = Mockito.inOrder(bookRepository);
     inOrder.verify(bookRepository).findBookById("111"); // it will
   inOrder.verify(bookRepository).save(book); // it will be called after the findByBook, so this is prefect but if we write save method before the findBy so it will haven't tesing successful. 
     
   
	}
	
	
	@Test
	public void priceupdateChanger() {
BookRequest bookRequest = new BookRequest("Mockito",500,LocalDate.now());
		
		Book book= new Book("111","Movckito",500,LocalDate.now());
		bookService.addBook(bookRequest);
		bookService.addBook(bookRequest);
		bookService.addBook(bookRequest);
//		verify(bookRepository,times(0)).save(book);
//		verify(bookRepository, atLeast(0)).save(book);
//
//		verify(bookRepository,atMost(3)).save(book);
		verify(bookRepository,atMostOnce()).save(book);
//		verify(bookRepository,atLeastOnce()).save(book); // it will not test successful because it will not called atleaseOnce it called 0 time also.
	}
		 }
				
	
	


