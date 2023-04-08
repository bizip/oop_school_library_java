package com.oop_school_library_java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.oop_school_library_java.Student.Student;
import com.oop_school_library_java.Teacher.Teacher;

public class App {
    private List<Book> books;
    private List<Person> people;
    private List<Rental> rentals;
    private int nextPersonId;

    public App() {
        this.books = new ArrayList<Book>();
        this.people = new ArrayList<Person>();
        this.rentals = new ArrayList<Rental>();
        this.nextPersonId = 1;
    }
    
    public void listAllBooks() {
    	System.out.println("List of all books");
    	System.out.println("--------------------");
        for (Book book : this.books) {
            System.out.println(book.getTitle() + " " + "by" + " " + book.getAuthor());
        }
    }
    
    public void listAllPeople() {
    	System.out.println("List of all people");
    	System.out.println("--------------------");
    	for (Person people : this.people) {
    		System.out.println("[" + people.getClass().getSimpleName() + "]" +" " + "name:"+ " "  + people.getName() );
    	}
    }
    
    
    public void listAllRentals() {
    	for (Rental rental : this.rentals) {
    		System.out.println("List of al peoples");
    		System.out.println("_" + rental);
    	}
    }
    
    public void createPerson(String type,int age, boolean parentPermission, String name, String specialization,Classroom classroom) {
        Person person;
        int id = this.nextPersonId++;
        if (type.equals("teacher")) {
            person = new Teacher(id, age, parentPermission,  name, specialization);
        } else {
            person = new Student(123, 18, true, "John Doe", classroom, "undergraduate");
        }
        this.people.add(person);
    }
    
    public void createBook(String title,String author ) {
    Book book;
    book = new Book(title,author);
    this.books.add(book);
    }
    
    public void createRental(LocalDate date, Person person, Book book) {
    	Rental rental;
    	rental = new Rental(date, person, book);
    	this.rentals.add(rental);
    	
    }

}
