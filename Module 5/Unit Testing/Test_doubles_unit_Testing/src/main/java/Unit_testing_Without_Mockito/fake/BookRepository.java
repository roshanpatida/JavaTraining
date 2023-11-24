package Unit_testing_Without_Mockito.fake;

import java.util.Collection;

public interface BookRepository {
 void save(Book book);
 Collection<Book> findAll();
}
