package JunitandMockito.Fake;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;



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
