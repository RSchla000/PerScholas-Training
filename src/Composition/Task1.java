package Composition;

public class Task1 {
    static void main(String[] args) {
        Book[] bookArr = {
                new Book("Java Basics", "Alice"),
                new Book("OOP Concepts", "Bob"),
                new Book("Data Structures","Charlie")
        };
        Library library = new Library(bookArr);
        library.displayBooks();
    }
}
