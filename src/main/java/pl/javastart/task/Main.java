package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();
        Book[] bookArray = library.createBookArray();
        library.printBooks(bookArray);

    }
}
