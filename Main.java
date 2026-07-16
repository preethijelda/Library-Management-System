package libraryManagmentSystem.java;

import java.util.Scanner;

		public class Main {
		    public static void main(String[] args) {
		        Library myLibrary = new Library();
		        Scanner input = new Scanner(System.in); // Tool to read keyboard typing
		        
		        // Let's add two books to start with
		        myLibrary.addBook(new Book("Java Basics", "James Gosling"));
		        myLibrary.addBook(new Book("Head First Java", "Kathy Sierra"));

		        boolean running = true;

		        while (running) {
		            System.out.println("\n=== WELCOME TO THE LIBRARY ===");
		            System.out.println("1. View Catalog");
		            System.out.println("2. Add a New Book");
		            System.out.println("3. Exit");
		            System.out.print("Choose an option: ");
		            
		            int choice = input.nextInt();
		            input.nextLine(); // Clear the scanner memory

		            if (choice == 1) {
		                myLibrary.displayBooks();
		            } 
		            else if (choice == 2) {
		                System.out.print("Enter book title: ");
		                String title = input.nextLine();
		                System.out.print("Enter book author: ");
		                String author = input.nextLine();
		                
		                // Create and add the new book dynamically!
		                Book userBook = new Book(title, author);
		                myLibrary.addBook(userBook);
		            } 
		            else if (choice == 3) {
		                System.out.println("Goodbye!");
		                running = false; // This stops the loop and ends the program
		            } 
		            else {
		                System.out.println("Invalid option. Try again.");
		            }
		        }
		        input.close(); // Close the scanner tool
		    }
		}

	
	 


