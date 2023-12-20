package Fack_Test_double_without_mockito.stub;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import Unit_testing_Wothout_Mockito.Stub.Book;
import Unit_testing_Wothout_Mockito.Stub.BookRepository;



public class BookRepositoryStub implements BookRepository {

	@Override
	public List<Book> findNewBooks(int days) {
		List<Book> newBooks = new ArrayList<>();
	Book book1= new Book("111","Movckito in action",500,LocalDate.now());
	Book book2= new Book("222","stub without mockito",400,LocalDate.now());
	newBooks.add(book1);
	newBooks.add(book2);
		return newBooks;
	}


}
