package Composition;

public class Library {
    Book[] books;
    Library(Book[] books){
        this.books = books;
    }
    void displayBooks(){
        System.out.println("Library Books: ");
        for(Book b : books){
            System.out.printf("Title: %s, Author: %s%n", b.title, b.author);
        }
    }
}
