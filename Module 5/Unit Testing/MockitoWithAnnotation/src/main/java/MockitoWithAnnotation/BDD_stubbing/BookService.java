package MockitoWithAnnotation.BDD_stubbing;

import java.util.List;


public class BookService {

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
}