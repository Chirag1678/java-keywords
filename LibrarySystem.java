class Book {
    // Static variable
    private static String libraryName = "City Library";

    // Instance Variable
    private final String isbn; // Final variable (cannot be changed)
    private String title;
    private String author;

    // Constructor
    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    // Method to display book details
    public void displayDetails() {
        if(this instanceof Book) { // Using instanceOf
            System.out.println("Library Name: " + libraryName);
            System.out.println("ISBN: " + isbn);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println();
        }
    }

    // Method to display library name
    public static void getLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
}

// Main Class
public class LibrarySystem {
    public static void main(String[] args) {
        // Create Objects of Book class
        Book book1 = new Book("978-3-16-148410-0", "Java Programming", "RK Singh");
        Book book2 = new Book("978-0-262-13472-9", "Data Structures", "SP Shukla");

        // Display book details
        book1.displayDetails();
        book2.displayDetails();

        // Display library name
        Book.getLibraryName();
    }
}
// Sample Output ->
//Library Name: City Library
//ISBN: 978-3-16-148410-0
//Title: Java Programming
//Author: RK Singh
//
//Library Name: City Library
//ISBN: 978-0-262-13472-9
//Title: Data Structures
//Author: SP Shukla
//
//Library Name: City Library