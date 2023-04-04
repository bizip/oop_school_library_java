package com.oop_school_library_java;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private int id;
	private String name;
	private int age;
	private boolean parentPermission;
	private List<Rental> rentals;

	public Person(int id, int age, boolean parentPermission, String name) {
		this.id = id;
		this.age = age;
		this.parentPermission = parentPermission;
		this.name = name != null ? name : "Unknown";
		this.setRentals(new ArrayList<>());

	}

	public Person(int id, int age) {
		this(id, age, true, "Unknown");
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name != null ? name : "Unknown";
	}

	public void setAge(int age) {
		this.age = age;
	}

	private boolean isOfAge() {
		return age >= 18;
	}

	public boolean canUseServices() {
		return isOfAge() || parentPermission;
	}

	public List<Rental> getRentals() {
		return rentals;
	}

	public void setRentals(List<Rental> rentals) {
		this.rentals = rentals;
	}

	public void addRentals(Rental rental) {
		this.rentals.add(rental);
	}
}
