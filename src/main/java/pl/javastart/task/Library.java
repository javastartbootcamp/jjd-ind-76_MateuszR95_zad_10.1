package pl.javastart.task;

import java.util.Scanner;

public class Library {

    public Book[] createBookArray() {
        Book[] books = new Book[3];
        int booksCounter = 0;
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
        return books;
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
        for (Book value : books) {
            if (value != null && value.equals(book)) {
                return true;
            }
        }
        return false;
    }

    public void printBooks(Book[] books) {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}
