package com.oop_school_library_java;
import java.util.ArrayList;
import java.util.List;

import com.oop_school_library_java.Student.Student;

public class Classroom {
	private List<Student> students;
	private String label;

	public Classroom(String label) {
		this.setLabel(label);
		students=new ArrayList<>();
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(Student student) {
		students.add(student);
		student.setClassroom(this);
	}
	
}
