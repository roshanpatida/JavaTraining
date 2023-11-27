package MockitoWithAnnotation.BehaviorVarification;

import java.time.LocalDate;
import java.util.List;


public class BookService {

	private BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	

	public void save(Book book) {
		bookRepository.save(book);
	}
}