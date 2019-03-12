package com.bass.bookshop.demo.model;

import java.util.Set;

public class Book {
	private long id;
	private int year;
	private String title;
	private double price;
	private String description;
	private String publisher;
	private Set<Author> authors;
	private Category category;
	private Set<BookOrder> bookOrders;

	private Book() {
	}

	private Book(long id, int year, String title, double price, String publisher, Set<Author> authors) {
		this.id = id;
		this.year = year;
		this.title = title;
		this.price = price;
		this.publisher = publisher;
		this.authors = authors;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Set<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Set<BookOrder> getBookOrders() {
		return bookOrders;
	}

	public void setBookOrders(Set<BookOrder> bookOrders) {
		this.bookOrders = bookOrders;
	}

}
