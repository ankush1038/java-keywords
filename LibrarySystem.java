class Book {
    private static String libraryName = "City Library"; // Static variable
    private final String isbn; // Final variable (cannot be changed)
    private String title;
    private String author;

    // Constructor using 'this' to resolve ambiguity
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public void displayBookDetails() {
        if (this instanceof Book) { // Using instanceof
            System.out.println("Library: " + libraryName);
            System.out.println("ISBN: " + isbn);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
        }
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
}

// Main class
public class LibrarySystem {
    public static void main(String[] args) {
        Book book1 = new Book("123-456-789-0", "Head first java", "Kathy Sierra & Bert Bates");
        Book book2 = new Book("123-456-789-0", "Java for Dummies", "Barry A. Burd");

        book1.displayBookDetails();
        book2.displayBookDetails();
        Book.displayLibraryName();
    }
}

