package Project.Library;

import java.util.ArrayList;
import java.util.List;

public class librarian {
    private List<book> books = new ArrayList<>(); // List to store books

    public void addBook(book newBook) {
        books.add(newBook); // Add a new book to the list
        System.out.println("Added book: " + newBook.getTitle());
    }

    public void registerStudent(student newStudent) {
        System.out.println("Registered student: " + newStudent.name);
    }
}
