package com.oop_school_library_java.Student;

import com.oop_school_library_java.Person;

public class Student extends Person{
	private String classroom;

	public Student(String name, int age, boolean parentPermission, int id, String classroom ) {
		super( id, age,parentPermission, name);
		this.classroom = classroom;
	}
	
	public String playhooky() {
		return "¯\\_(ツ)_/¯";
	}

}
