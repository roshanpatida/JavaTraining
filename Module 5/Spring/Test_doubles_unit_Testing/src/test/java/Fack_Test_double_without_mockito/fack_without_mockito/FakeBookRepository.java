package Fack_Test_double_without_mockito.fack_without_mockito;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import Unit_testing_Without_Mockito.fake.Book;
import Unit_testing_Without_Mockito.fake.BookRepository;

public class FakeBookRepository implements BookRepository{

	// we create the fake repository which is replace the external database 
	// we use the in memory database using HashMap or list
	Map<String,Book> bookStore = new HashMap<>();
	
	
	@Override
	public void save(Book book) {
		bookStore.put(book.getBookId(), book);
		
	}

	@Override
	public Collection<Book> findAll() {
			return bookStore.values();
	}

	
}
