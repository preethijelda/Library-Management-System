package libraryManagmentSystem.java;

public class Book {
    // 1. Attributes (Data fields)
    private String title;
    private String author;
    private boolean isAvailable;

    // 2. Constructor (To create a book object easily)
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; // New books are available by default
    }

    // 3. Getters and Setters (To safely access and change the data)
    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Success: You borrowed '" + title + "'");
        } else {
            System.out.println("Sorry: '" + title + "' is already borrowed.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("Success: You returned '" + title + "'");
    }
}