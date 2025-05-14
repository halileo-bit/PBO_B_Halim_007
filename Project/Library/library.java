package Project.Library;

import java.util.ArrayList;
import java.util.List;

public class library {
    private List<book> books = new ArrayList<>(); // List to store books

    public void addBook(book newBook) {
        books.add(newBook); // Add a new book to the list
    }

    public void listBooks() {
        System.out.println("Available books in the library:");
        for (book b : books) {
            System.out.println("- " + b.getTitle() + (b.isAvailable() ? " (Available)" : " (Not Available)"));
        }
    }
}
