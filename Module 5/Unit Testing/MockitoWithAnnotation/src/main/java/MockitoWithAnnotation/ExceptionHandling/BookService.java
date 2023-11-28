package MockitoWithAnnotation.ExceptionHandling;


import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;




public class BookService {

	private BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	public int getTotalPriceOfBooks() throws SQLException {
		List<Book> books = null;
		books = bookRepository.findAllBooks();
		int totalPrice = 0;
		for(Book book: books) {
			totalPrice = totalPrice + book.getPrice();
		}
		return totalPrice;
	}
//	public void addBook(Book book){
//		try {
//			bookRepository.save(book);
//		} catch (SQLException e) {
//			// log exception
//			throw new DatabaseWriteException("Unable to write in database due to - " + e.getMessage());
//		}
	
	
		// OR OR OR OR OR OR   we can write both try - catch and throws alos but in this program try catch will throw error so we can use throws exception 
	
	
	public void addBook(Book book)throws Exception {
		bookRepository.save(book);
		
	}
			
	
	
}