package com.oop_school_library_java;

import java.util.Scanner;

public class School {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		App app = new App();
		System.out.println("Welcome to school libraly app!");
		System.out.println("================================");
		System.out.println("");

		boolean quit = false;

		while (!quit) {
			System.out.println("\nPlease choose the option by intering a number:");
			System.out.println("1. List all books");
			System.out.println("2. List all people");
			System.out.println("3. Create a person");
			System.out.println("4. Create a book");
			System.out.println("5. Create a rental");
			System.out.println("6. List all rentals for a given person id");
			System.out.println("0. Quit");

			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 0:
				quit = true;
				break;
			case 1:
				app.listAllBooks();
				break;
			case 2:
				app.listAllPeople();
				break;
			case 3:
				Classroom classroom1 = new Classroom("Chemistry 101");
				app.createPerson("teacher", 20, true, "name", "specialization", classroom1);
				app.createPerson("student", 20, true, "name", "specialization", classroom1);

				break;
			case 4:
				app.createBook("Who moved my cheese", "Bizimungu Pascal");
				break;
			case 5:

				break;
			case 6:

				break;
			default:
				System.out.println("Invalid option, please select again.");
			}
		}
	}

}
