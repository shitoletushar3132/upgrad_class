package oops;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return available;
    }

    public void borrowBook() {
        this.available = false;
    }

    public void returnBook() {
        this.available = true;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Availability: " + (available ? "Available" : "Borrowed"));
        System.out.println("--------------------");
    }
}

public class LibraryManagementSystem {
    private List<Book> books = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LibraryManagementSystem system = new LibraryManagementSystem();
        system.run();
    }

    public void run() {
        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. List Available Books");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = getIntInput();

            switch (choice) {
                case 1 -> addBook();
                case 2 -> searchBook();
                case 3 -> borrowBook();
                case 4 -> returnBook();
                case 5 -> listAvailableBooks();
                case 6 -> {
                    System.out.println("Exiting system. Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private int getIntInput() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            return -1;
        }
    }

    private void addBook() {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine().trim();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine().trim();
        System.out.print("Enter book ISBN: ");
        String isbn = scanner.nextLine().trim();

        books.add(new Book(title, author, isbn));
        System.out.println("Book added successfully!");
    }

    private void searchBook() {
        System.out.print("Enter book title or author: ");
        String query = scanner.nextLine().trim().toLowerCase();
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(query) || book.getAuthor().toLowerCase().contains(query)) {
                book.displayDetails();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching book found.");
        }
    }

    private void borrowBook() {
        System.out.print("Enter book title or author to borrow: ");
        String query = scanner.nextLine().trim().toLowerCase();
        for (Book book : books) {
            if ((book.getTitle().toLowerCase().contains(query) || book.getAuthor().toLowerCase().contains(query)) && book.isAvailable()) {
                book.borrowBook();
                System.out.println("Book borrowed successfully!");
                return;
            }
        }
        System.out.println("Book not available or not found.");
    }

    private void returnBook() {
        System.out.print("Enter book title or author to return: ");
        String query = scanner.nextLine().trim().toLowerCase();
        for (Book book : books) {
            if ((book.getTitle().toLowerCase().contains(query) || book.getAuthor().toLowerCase().contains(query)) && !book.isAvailable()) {
                book.returnBook();
                System.out.println("Book returned successfully!");
                return;
            }
        }
        System.out.println("No matching borrowed book found.");
    }

    private void listAvailableBooks() {
        System.out.println("\nAvailable Books:");
        boolean hasAvailable = false;
        for (Book book : books) {
            if (book.isAvailable()) {
                book.displayDetails();
                hasAvailable = true;
            }
        }
        if (!hasAvailable) {
            System.out.println("No books available at the moment.");
        }
    }
}
