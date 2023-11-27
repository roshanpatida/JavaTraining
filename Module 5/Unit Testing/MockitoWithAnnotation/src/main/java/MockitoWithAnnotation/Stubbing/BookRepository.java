package MockitoWithAnnotation.Stubbing;

import java.util.List;

public interface BookRepository {
	List<Book> findNewBooks(int days);
	Book findBookById(String bookId);
	 void save(Book book);
}
