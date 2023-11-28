package MockitoWithAnnotation.ExceptionHandling;

import java.time.LocalDate;

public class BookRequest {
	private String title;
	 private int price;
	 private LocalDate publishedDate;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public LocalDate getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(LocalDate publishedDate) {
		this.publishedDate = publishedDate;
	}
	public BookRequest(String title, int price, LocalDate publishedDate) {
		super();
		this.title = title;
		this.price = price;
		this.publishedDate = publishedDate;
	}
	 
	
}
