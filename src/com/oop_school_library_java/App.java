package com.oop_school_library_java;

import java.time.LocalDate;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;

import java.io.*;

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
    	System.out.println("List of all Rentals");
    	System.out.println("--------------------");
    	for (Rental rental : this.rentals) {
    		System.out.println(rental.getPerson().getName() + " "+ "has" + " "+ rental.getBook().getTitle());
    	}
    }
    
    public void createPerson(String type,int age, boolean parentPermission, String name, String specialization,Classroom classroom) {
        Person person;
//        int id = this.nextPersonId++;
        if (type.equals("teacher")) {
            person = new Teacher(13, age, parentPermission,  name, specialization);
        } else {
            person = new Student(123, 18, true, name, classroom, "undergraduate");
        }
        this.people.add(person);
    }
    
    public void createBook(String title,String author ) {
    Book book;
    book = new Book(title,author);
    this.books.add(book);
    }
    
    public void createRental(String date, Person person, Book book) {
    	Rental rental;
    	rental = new Rental(date, person, book);
    	this.rentals.add(rental);
    	 
    }
    
    // Method to save data to JSON files
    public void saveDataToJson() {
        // Create Gson object to serialize data to JSON format
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Serialize books to JSON and write to books.json file
        try (FileWriter writer = new FileWriter("books.json")) {
            gson.toJson(books, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Serialize people to JSON and write to people.json file
        try (FileWriter writer = new FileWriter("people.json")) {
            gson.toJson(people, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Serialize rentals to JSON and write to rentals.json file
        try (FileWriter writer = new FileWriter("rentals.json")) {
            gson.toJson(rentals, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
 // Method to load data from JSON files
    public void loadDataFromJson() {
    	Gson gson = new GsonBuilder()
    		    .registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
    		    .create();

        // Load books from books.json file
        try (Reader reader = new FileReader("books.json")) {
            books = gson.fromJson(reader, new TypeToken<ArrayList<Book>>() {}.getType());
        } catch (FileNotFoundException e) {
            System.out.println("books.json file not found.");
            books = new ArrayList<>(); // Initialize books list as empty list
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Load people from people.json file
        try (Reader reader = new FileReader("people.json")) {
            people = gson.fromJson(reader, new TypeToken<ArrayList<Person>>() {}.getType());
        } catch (FileNotFoundException e) {
            System.out.println("people.json file not found.");
            people = new ArrayList<>(); // Initialize people list as empty list
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Load rentals from rentals.json file
        try (Reader reader = new FileReader("rentals.json")) {
            rentals = gson.fromJson(reader, new TypeToken<ArrayList<Rental>>() {}.getType());
        } catch (FileNotFoundException e) {
            System.out.println("rentals.json file not found.");
            rentals = new ArrayList<>(); // Initialize rentals list as empty list
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void onExit() {
        // Save data to JSON files
        saveDataToJson();
    }

    // Method to handle application startup
    public void onStartup() {
        // Load data from JSON files
        loadDataFromJson();
    }

}
