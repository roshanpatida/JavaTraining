package MockitoWithAnnotation.BehaviorVarification;

import java.time.LocalDate;
import java.util.List;


public class BookService {

	private BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	public void addBook(BookRequest  bookRequest)   {
		 Book book = new Book(null, "Mockito", 400, LocalDate.now());
		 book.setTitle(bookRequest.getTitle());
		 book.setPrice(bookRequest.getPrice());
		 book.setPublishedDate(bookRequest.getPublishedDate());
		 bookRepository.save(book);
	}
	public void save(Book book) {
		bookRepository.save(book);
	}
	
	public void updatePrice(String bookId, int updatePrice) {
		if(bookId ==null) {
			return;
		}
		Book book =bookRepository.findBookById(bookId);
//		if(book.getPrice()== updatePrice) {
//			return;
//		}
		 book.setPrice(updatePrice);
		 bookRepository.save(book);
	}
	
	
}