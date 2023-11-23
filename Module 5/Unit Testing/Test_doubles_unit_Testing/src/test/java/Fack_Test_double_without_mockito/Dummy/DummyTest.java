package Fack_Test_double_without_mockito.Dummy;
import Unit_testing_Mockito.Dummy.EmailService;
import Unit_testing_Mockito.fake.Book;
import Unit_testing_Mockito.fake.BookRepository;
import Unit_testing_Mockito.fake.BookService;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import Fack_Test_double_without_mockito.fack_without_mockito.FakeBookRepository;

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
}
