package Unit_testing_Without_Mockito.Dummy;

public class BookService {
 // bookService use email repository and bookRepository
	private BookRepository bookRepository;
	
	private EmailService emailService;
	
	public BookService(BookRepository bookRepository, EmailService emailService) {
	
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
// other methods which use emailservice