package MockitoWithAnnotation.BehaviorVerification;

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

import MockitoWithAnnotation.BehaviorVarification.BookRepository;
import MockitoWithAnnotation.BehaviorVarification.BookService;
import MockitoWithAnnotation.Stub.Book;



@ExtendWith(MockitoExtension.class)// this annotation is used  in Junit 5 and we used in Junit 4 @runWith(MockitoAnnotation.
public class VerificationTest {
	
	@InjectMocks
	private BookService bookService;

	@Mock
	private BookRepository bookRepository;
	 
	
	public void BehaviorTest() {
		Book book1= new Book("111","Movckito in action",500,LocalDate.now());
		 }
		 }
	
	
	


