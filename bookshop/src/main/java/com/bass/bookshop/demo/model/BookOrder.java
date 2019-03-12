package com.bass.bookshop.demo.model;

public class BookOrder {
	private Order order;
	private Book book;
	private int bookAmount;

	private BookOrder() {
		// TODO Auto-generated constructor stub
	}

	private BookOrder(Order order, Book book, int bookAmount) {
		this.order = order;
		this.book = book;
		this.bookAmount = bookAmount;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public int getBookAmount() {
		return bookAmount;
	}

	public void setBookAmount(int bookAmount) {
		this.bookAmount = bookAmount;
	}

}
