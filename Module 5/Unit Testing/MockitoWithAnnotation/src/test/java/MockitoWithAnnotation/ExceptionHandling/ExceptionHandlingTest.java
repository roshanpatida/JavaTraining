package MockitoWithAnnotation.ExceptionHandling;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

import java.sql.SQLException;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class ExceptionHandlingTest {

	@InjectMocks
	private BookService bookService;
	@Mock
	private BookRepository bookRepository;
	
	
	@Test
	public void totalPriceOfBookTest() throws Exception{
  when(bookRepository.findAllBooks()).thenThrow(SQLException.class);	
   assertThrows(DatabaseReadException.class, () ->  bookService.getTotalPriceOfBooks());
	}
	@Test
	public void testTotalPriceOfBooks1() throws SQLException {
		when(bookRepository.findAllBooks()).thenThrow(new SQLException("Database not available"));
		assertThrows(DatabaseReadException.class, () -> bookService.getTotalPriceOfBooks());
	}
	
	@Test
	public void testAddBook() throws SQLException {
		Book book = new Book(null, "Mockito In Action", 600, LocalDate.now());
		doThrow(SQLException.class).when(bookRepository).save(book);
		assertThrows(DatabaseWriteException.class, () -> bookService.addBook(book));
	}
	
	@Test
	public void testTotalPriceOfBooks2() throws SQLException {
		when(bookRepository.findAllBooks()).thenThrow(new SQLException("Database not available"));
		assertThrows(DatabaseReadException.class, () -> bookService.getTotalPriceOfBooks());
	}

}
