package JunitandMockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;

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


