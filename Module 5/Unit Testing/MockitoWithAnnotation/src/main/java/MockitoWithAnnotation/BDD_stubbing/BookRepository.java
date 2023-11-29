package MockitoWithAnnotation.BDD_stubbing;

import java.util.List;

public interface BookRepository {
	List<Book> findNewBooks(int days);
}
