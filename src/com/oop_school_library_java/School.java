package com.oop_school_library_java;

import com.oop_school_library_java.Teacher.Teacher;

public class School {

	public static void main(String[] args) {
		App app = new App();
		System.out.println("Welcome to school libraly app!");
		System.out.println("================================");
		System.out.println("");
		System.out.println("Welcome to school libraly app!");
		
//		create a new student
//		Classroom mathClassroom = new Classroom("Chemistry 101");
//		Student student = new Student("John Smith", 16, true, 1234, mathClassroom);
//		Student student1 = new Student("John Smith", 16, true, 1234, mathClassroom);
		
//		List all students
//		System.out.println(student);	
//		System.out.println(student1);
		
//		create the teacher
		Teacher teacher1 = new Teacher(1, 35, true, "Jane Smith", "Math");
		Teacher teacher2 = new Teacher(2, 42, true, "John Doe", "English");
		
//		List all students
		System.out.println("List of teachers");
		System.out.println("");
		System.out.println(teacher1);	
		System.out.println(teacher2);
		
		
//		create new book
		
		Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
		Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
//	    list all books
		System.out.println("List of Books");
		System.out.println("");
		System.out.println(book1);	
		System.out.println(book2);
//		create a new class
		System.out.println("List of classrooms");
		System.out.println("");
		Classroom classroom1 = new Classroom("Chemistry 101");
		System.out.println(classroom1.getClass().getSimpleName());
		
//		create a person
		app.createPerson("teacher",20, true, "name","specialization", classroom1);
		app.createPerson("student",20, true, "name","specialization", classroom1);
		app.listAllPeople();

	}
}
