package javaee.example;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by vundicind on 2/18/17.
 */
public class BookDao {
    Book[] books;

    private Book[] loadBooks() throws MalformedURLException {
        Book[] books = new Book[3];

        books[0] = new Book();
        books[0].setId(1L);
        books[0].setTitle("Java EE 7 Essentials: Enterprise Developer Handbook");
        books[0].setAuthors(new String[]{"Arun Gupta"});
        books[0].setEditionNumber(1);
        books[0].setUrl(new URL("https://www.amazon.com/Java-EE-Essentials-Enterprise-Developer/dp/1449370179"));

        books[1] = new Book();
        books[1].setId(2L);
        books[1].setTitle("The Java EE 7 Tutorial: Volume 1");
        books[1].setAuthors(new String[]{"Eric Jendrock", "Ricardo Cervera-Navarro", "Ian Evans", "Kim Haase", "William Markito"});
        books[1].setEditionNumber(5);
        books[1].setUrl(new URL("https://www.amazon.com/Java-EE-Tutorial-5th/dp/0321994922"));

        books[2] = new Book();
        books[2].setId(3L);
        books[2].setTitle("Google");
        books[2].setAuthors(new String[]{"X", "Y"});
        books[2].setEditionNumber(0);
        books[2].setUrl(new URL("https://google.md"));

        return books;
    }

    public BookDao() {
        try {
            books = loadBooks();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public Book find(Long id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }

    public Book[] findAll() {
        return books;
    }

    public void save(Book book) {
    }

    public void update(Book book) {
        for (int i=0; i<books.length; i++) {
            if (books[i].getId().equals(book.getId())) {
                books[i] = book;
            }
        }
    }

    public void delete(int id) {
    }
}
