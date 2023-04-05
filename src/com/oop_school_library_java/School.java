package com.oop_school_library_java;

public class School {

	public static void main(String[] args) {
		App app = new App();
		
//		create new book
	    app.createBook("The Great Gatsby", "F. Scott Fitzgerald");
	    app.createBook("To Kill a Mockingbird", "Harper Lee");
	    app.createBook("1984", "George Orwell");
	    
//	    list all books
	    app.listAllBooks();

	}
}
