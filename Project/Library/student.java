package Project.Library;

public class student {
    String name;
    libraryCard card;

    public student(String name, libraryCard card) {
        this.name = name;
        this.card = card;
    }

    public void borrowBook(book book) {
        book.borrowBook();
    }

    public void returnBook(book book) {
        book.returnBook();
    }
}
