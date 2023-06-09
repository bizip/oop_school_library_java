package com.oop_school_library_java;
import java.util.List;
import java.util.Scanner;


import com.oop_school_library_java.Student.Student;

public class School {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		App app = new App();
		Runtime.getRuntime().addShutdownHook(new Thread(app::onExit));
//		app.onStartup();
		System.out.println("Welcome to school library app!");
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
			System.out.println("6. List all rentals for a given person name");
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
//				 String type = JOptionPane.showInputDialog("Are you a student or a teacher");
//				 String name = JOptionPane.showInputDialog("What is your first name?");
				System.out.println("Please enter the name");
				System.out.println("========================");
				
				int type = scanner.nextInt();
				
				switch(type) {
				case 1:
					System.out.println("Please enter the name of student");
					System.out.println("========================");
					break;
				case 2:
					System.out.println("Please enter the name of the techer");
					System.out.println("========================");
					break;
				default:
					System.out.println("failled try again");
				}
//				 String name = scanner.nextLine();
//				Classroom classroom1 = new Classroom("Chemistry 101");
//				app.createPerson("student", 20, true, name, "specialization", classroom1);
//				app.createPerson("teacher", 20, true, name, "specialization", classroom1);
				
				break;
			case 4:
				app.createBook("Who moved my cheese", "Bizimungu Pascal");
				break;
			case 5:
				String name1 = scanner.nextLine();
				Classroom classroom =new Classroom("Math 101");
//				System.out.println(app.listAllPeople());
				
//				app.createRental("01/01/2023",people.get(0) , new Book("My story","Bizimungu"));
				break;
			case 6:
				app.listAllRentals();
				break;
			default:
				scanner.close();
				System.out.println("Invalid option, please select again.");
			}
		}
	}

}
