package pl.javastart.task;

import java.util.Arrays;
import java.util.Scanner;

public class Library {

    private Book[] books;
    private int booksCounter = 0;

    public Library() {
        books = new Book[3];
    }

    public void addBook() {
        System.out.println("Podaj informacje o trzech unikalnych książkach");
        while (booksCounter < books.length) {
            Book book = createBook();
            if (isDuplicate(books, book)) {
                System.out.println("Duplikat");
            } else {
                books[booksCounter] = book;
                booksCounter++;
            }
        }
    }

    private Book createBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tytuł książki");
        String bookTitle = scanner.nextLine();
        System.out.println("Podaj ilość stron:");
        int pagesNumber = scanner.nextInt();
        scanner.nextLine();

        return new Book(bookTitle, pagesNumber);
    }

    private boolean isDuplicate(Book[] books, Book book) {
        for (int i = 0; i < booksCounter; i++) {
            if (books[i].equals(book)) {
                return true;
            }
        }
        return false;
    }

    public void printBooks() {
        addBook();
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}
