package com.restapi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "BookStore")
public class Book {

	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String title;
	@OneToOne
	private Author author;

	public Book(int id, String title, Author author) {
		super();
		Id = id;
		this.title = title;
		this.author = author;
	}

	public Book() {
	}

	@Override
	public String toString() {
		return "Book [Id=" + Id + ", title=" + title + ", author=" + author + "]";
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

}
