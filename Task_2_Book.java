// ============================================================
// Task 2 (OOP Basics): Book Class
// ============================================================
// What this program does:
//   - Defines a "Book" class with title, year, and author
//   - Creates two Book objects representing famous Bengali novels
//   - Calls print() on each to display their details
// ============================================================

// Define the Book class
class Book {

    // Fields: every Book has a title, publication year, and author
    String title;   // Title of the book
    int year;       // Year the book was published
    String author;  // Name of the author

    // Constructor: initializes all fields when a Book object is created
    Book(String title, int year, String author) {
        this.title = title;   // Assign parameter to field
        this.year = year;
        this.author = author;
    }

    // Method: print all details of this book
    void print() {
        System.out.println("Title: " + title);
        System.out.println("Year: " + year);
        System.out.println("Author: " + author);
        System.out.println(); // Blank line after each book for readability
    }
}

// ============================================================
// Main class
// ============================================================
public class Main {
    public static void main(String[] args) {

        // Create Book object b1 — a classic Bengali novel
        Book b1 = new Book("Pather Panchali", 1929, "Bibhutibhushan Bandopadhyay");

        // Create Book object b2 — another classic
        Book b2 = new Book("Devdas", 1917, "Sarat Chandra Chattopadhyay");

        // Print details of both books
        b1.print();
        b2.print();
    }
}
