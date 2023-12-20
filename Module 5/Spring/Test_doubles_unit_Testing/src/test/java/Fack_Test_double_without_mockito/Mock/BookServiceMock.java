package Fack_Test_double_without_mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;

import Unit_testing_Wothout_Mockito.Mock.Book;
import Unit_testing_Wothout_Mockito.Mock.BookRepository;
import Unit_testing_Wothout_Mockito.Mock.BookService;

public class BookServiceMock implements BookRepository {

	
	int saveCalled = 0;
	Book lastAddedBook = null;
	
	@Override
	public void save(Book book) {
		saveCalled++;
		lastAddedBook = book;
	}

	
	public void verify(Book book,int times) {
		assertEquals(times, saveCalled);
		assertEquals(book, lastAddedBook);
	}




	}


