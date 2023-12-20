package JunitandMockito.Mock;



public class BookService {
private BookRepository bookRepository;

public BookService(BookRepository bookServiceMock) {
	this.bookRepository = bookServiceMock;

}

public void addBook(Book book) {

	bookRepository.save(book);
}
}
