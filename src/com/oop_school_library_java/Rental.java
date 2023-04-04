package com.oop_school_library_java;

import java.time.LocalDate;

public class Rental {
	private Person person;
	private Book book;
	private LocalDate date = LocalDate.now();

	public Rental(LocalDate date, Person person, Book book) {
		this.date = date;
		this.setPerson(person);
		this.setBook(book);
		this.book.addRental(this);
        this.person.addRentals(this);
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

}
