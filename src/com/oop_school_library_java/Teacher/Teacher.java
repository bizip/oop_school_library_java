package com.oop_school_library_java.Teacher;

import com.oop_school_library_java.Person;

public class Teacher extends Person {
	private String specialization;
	
	public Teacher(int id, int age, boolean parentPermission, String name, String specialization) {
		super(  name, id, age);
		this.setSpecialization(specialization);
	}
	
  @Override
    public boolean canUseServices() {
        return true;
    }

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	

}
