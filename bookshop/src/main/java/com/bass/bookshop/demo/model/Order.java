package com.bass.bookshop.demo.model;

import java.util.Date;
import java.util.Set;

public class Order {
	private int id;
	private Date dateOrdered;
	private Date dateDelivered;
	private Client client;
	private boolean delivered;
	private String address;
	private Set<BookOrder> bookOrders;
	private Order() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDateOrdered() {
		return dateOrdered;
	}
	public void setDateOrdered(Date dateOrdered) {
		this.dateOrdered = dateOrdered;
	}
	public Date getDateDelivered() {
		return dateDelivered;
	}
	public void setDateDelivered(Date dateDelivered) {
		this.dateDelivered = dateDelivered;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public boolean isDelivered() {
		return delivered;
	}
	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Set<BookOrder> getBookOrders() {
		return bookOrders;
	}
	public void setBookOrders(Set<BookOrder> bookOrders) {
		this.bookOrders = bookOrders;
	}
	
}
