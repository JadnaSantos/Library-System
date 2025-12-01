package library.system.Library;

import library.system.Book.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void listBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void lendBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {

                if (b.isAvailable()) {
                    b.lend();
                    System.out.println("Livro emprestado: " + title);
                } else {
                    System.out.println("Livro já está emprestado.");
                }
                return;
            }
        }
        System.out.println("Livro não encontrado: " + title);
    }

    public void returnBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                b.giveBack();
                System.out.println("Livro devolvido: " + title);
                return;
            }
        }
        System.out.println("Livro não encontrado: " + title);
    }
}
