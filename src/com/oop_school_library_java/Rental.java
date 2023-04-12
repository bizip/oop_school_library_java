package com.oop_school_library_java;


public class Rental {
	private Person person;
	private Book book;
	private String date = "01/01/2023";

	public Rental(String date, Person person, Book book) {
		this.date = date;
		this.setPerson(person);
		this.setBook(book);
		this.book.addRental(this);
        this.person.addRentals(this);
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
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
