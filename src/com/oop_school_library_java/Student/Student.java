package com.oop_school_library_java.Student;

import com.oop_school_library_java.Classroom;
import com.oop_school_library_java.Person;

public class Student extends Person{
	private Classroom classroom;
	

	public Student(String name, int age, boolean parentPermission, int id, Classroom classroom ) {
		super( id, age,parentPermission, name);
		this.classroom = classroom;
	}
	
	
	public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
        classroom.getStudents().add(this);
    }
	
	  public Classroom getClassroom() {
	        return classroom;
	    }
	
	public String playhooky() {
		return "¯\\_(ツ)_/¯";
	}

}
