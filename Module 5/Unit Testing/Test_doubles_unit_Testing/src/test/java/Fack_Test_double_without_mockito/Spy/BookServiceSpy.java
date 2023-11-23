package Fack_Test_double_without_mockito.Spy;

import java.util.Collection;

import Unit_testing_Wothout_Mockito.Spy.Book;
import Unit_testing_Wothout_Mockito.Spy.BookRepository;
import Unit_testing_Wothout_Mockito.Spy.BookService;

public class BookServiceSpy implements BookRepository {

	
	int saveCalled = 0;
	Book lastAddedBook = null;
	
	@Override
	public void save(Book book) {
		saveCalled++;
		lastAddedBook = book;
	}

	public int timesCalled() {
		return saveCalled;
	}
	
	public boolean calledWith(Book book) {
		return lastAddedBook.equals(book);
	}
	
	}


