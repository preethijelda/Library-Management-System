package libraryManagmentSystem.java;

	import java.util.ArrayList;

	public class Library {
	    // 1. A dynamic list to hold multiple Book objects
	    private ArrayList<Book> bookList;

	    // 2. Constructor: Initializes an empty library
	    public Library() {
	        bookList = new ArrayList<>();
	    }

	    // 3. Method to add a new book to the library
	    public void addBook(Book book) {
	        bookList.add(book);
	        System.out.println("Added to library: " + book.getTitle());
	    }

	    // 4. Method to display all books and their availability
	    public void displayBooks() {
	        System.out.println("\n--- Library Catalog ---");
	        if (bookList.isEmpty()) {
	            System.out.println("The library is currently empty.");
	            return;
	        }
	        
	        // Loop through every book in our list
	        for (Book book : bookList) {
	            String status = book.isAvailable() ? "Available" : "Borrowed";
	            System.out.println("- " + book.getTitle() + " [" + status + "]");
	        }
	        System.out.println("----------------------");
	    }
	}



