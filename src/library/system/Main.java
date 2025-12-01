package library.system;

import library.system.Book.Book;
import library.system.Library.Library;

public class Main {
    static void main(String[] args) {
        Library library = new Library();

        Book b1 = new Book("Clean Code", "Robert Martin", 2008);
        Book b2 = new Book("Java: A Beginner's Guide", "Herbert Schildt", 2018);

        library.addBook(b1);

        library.listBooks();

        library.lendBook("Clean Code");
        library.listBooks();

        library.returnBook("Clean Code");
        library.listBooks();
    }
}
