/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beginner_level;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Abdul Rafay
 */

/* Library Management System:
Create a class Book with attributes like title, author, ISBN, and genre.
Create another class Library that can store an array of Book objects.
Implement methods in Library to add, remove, and search for books based on different criteria (title, author, etc.). */
//Create a class Book with attributes like title, author, ISBN, and genre.
class Book {

    private String title;
    private String author;
    private String genre;
    private String ISBN;

    public Book(String title, String author, String genre, String ISBN) {

        this.title = title;
        this.author = author;
        this.genre = author;
        this.ISBN = ISBN;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
//Create another class Library that can store an array of Book objects.
//Implement methods in Library to add, remove, and search for books based on different criteria (title, author, etc.).

class Library {

    private List<Book> books;

    public Library() {

        books = new ArrayList<>();
    }

    public void addBook(Book book) {

        books.add(book);
    }

    public void removeBook(Book book) {

        books.remove(book);
    }

    public List<Book> searchByTitle(String title) {

        List<Book> result = new ArrayList<>();

        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(title)) {
                result.add(book);
            }
        }
        return result;
    }

}

public class Library_management_system {

    public static void main(String[] args) {
        Library library = new Library();

        // Create some books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456", "Classic");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "789012", "Fiction");

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        
       
        // Search for books by title
        List<Book> searchResult = library.searchByTitle("To Kill a Mockingbird");
        for (Book book : searchResult) {
            System.out.println("Found book: " + book.getTitle());
        }
    }

}
