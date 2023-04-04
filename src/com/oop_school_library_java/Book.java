package com.oop_school_library_java;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private String title;
	private String author;
	private List<Rental> rentals;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.setRentals(new ArrayList<>());
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public List<Rental> getRentals() {
		return rentals;
	}

	public void setRentals(List<Rental> rentals) {
		this.rentals = rentals;
	}
	
	public void addRental(Rental rental) { this.rentals.add(rental); }
	
}
