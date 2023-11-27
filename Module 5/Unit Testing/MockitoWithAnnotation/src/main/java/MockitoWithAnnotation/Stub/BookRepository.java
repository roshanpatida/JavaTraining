package MockitoWithAnnotation.Stub;

import java.util.List;

public interface BookRepository {
	List<Book> findNewBooks(int days);
}
