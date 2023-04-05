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
//    private int nextBookId;

    public App() {
        this.books = new ArrayList<Book>();
        this.people = new ArrayList<Person>();
        this.rentals = new ArrayList<Rental>();
        this.nextPersonId = 1;
//        this.nextBookId = 1;
    }
    
    public void listAllBooks() {
        for (Book book : this.books) {
            System.out.println(book);
        }
    }
    
    public void listAllPeople() {
    	System.out.println("List of all people");
    	System.out.println("--------------------");
    	for (Person people : this.people) {
    		System.out.println(people.getClass().getSimpleName());
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

}
