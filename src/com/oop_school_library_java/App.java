package com.oop_school_library_java;

import java.util.ArrayList;
import java.util.List;

import com.oop_school_library_java.Student.Student;
import com.oop_school_library_java.Teacher.Teacher;

public class App {
    private List<Book> books;
    private List<Person> people;
    private List<Rental> rentals;
    private int nextPersonId;
    private int nextBookId;

    public App() {
        this.books = new ArrayList<Book>();
        this.people = new ArrayList<Person>();
        this.rentals = new ArrayList<Rental>();
        this.nextPersonId = 1;
        this.nextBookId = 1;
    }
    
    public void listAllBooks() {
        for (Book book : this.books) {
            System.out.println(book);
        }
    }
    
    public void listAllPeople() {
    	for (Person people : this.people) {
    		System.out.println("List of al peoples");
    		System.out.println("_" + people);
    	}
    }
    
    public void createPerson(String type,int age, boolean parentPermission, String name, String specialization,Classroom classroom) {
        Person person;
        int id = this.nextPersonId++;
        if (type.equals("teacher")) {
            person = new Teacher(id, age, parentPermission,  name, specialization);
        } else {
            person = new Student(name, age, parentPermission, id, classroom);
        }
        this.people.add(person);
    }
    
    public void createBook(String title, String author) {
        int id = this.nextBookId++;
        Book book = new Book(title, author);
        this.books.add(book);
    }

}
