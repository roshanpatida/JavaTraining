package Unit_testing_Without_Mockito.fake;

import Unit_testing_Without_Mockito.Dummy.EmailService;

public class BookService {

	private BookRepository bookRepository;
	
  private EmailService emailService;
   
	public BookService(BookRepository bookRepository,EmailService emailService) {
	 this.bookRepository = bookRepository;
	 this.emailService = emailService; 
	}

	public  void addBook(Book book) {
		bookRepository.save(book);
	}
	
	public int findnumberOfBooks() {
		return bookRepository.findAll().size();
	}
}
