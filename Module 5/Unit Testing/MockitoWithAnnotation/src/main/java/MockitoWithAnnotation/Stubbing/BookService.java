package MockitoWithAnnotation.Stubbing;

import java.time.LocalDate;
import java.util.List;


public class BookService {
private BookRequest bookRequest;
	private BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	
	public List<Book> getNewBooksWithAppliedDiscount(int discountRate,int days){
	List<Book> newBooks = bookRepository.findNewBooks(days);
     
	
	for(Book book:newBooks) {
		int price = book.getPrice();
		int newPrice  = price - (discountRate*price/100);
		book.setPrice(newPrice);
	}
		return newBooks;
		
		
		
	}
	
	
	public int CalculateTotalCost(List<String> bookids) {
		
		int total = 0;
		for(String bookId: bookids) {
			Book book = bookRepository.findBookById(bookId);
			total = total + book.getPrice();
		}
		return total;
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
}