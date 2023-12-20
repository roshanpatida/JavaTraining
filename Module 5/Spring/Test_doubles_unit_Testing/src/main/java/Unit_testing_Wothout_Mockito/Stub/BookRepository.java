package Unit_testing_Wothout_Mockito.Stub;

import java.util.Collection;
import java.util.List;

public interface BookRepository {
	List<Book> findNewBooks(int days);
}
