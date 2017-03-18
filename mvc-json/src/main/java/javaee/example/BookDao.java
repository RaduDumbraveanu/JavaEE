package javaee.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by utilizator on 18.03.17.
 */
public class BookDao {
    public static final String PATHNAME = "/home/utilizator/books.json";
    private List<Book> books;

    public BookDao() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            books = mapper.readValue(new File(PATHNAME), new TypeReference<List<Book>>(){});
        } catch (IOException e) {
            e.printStackTrace();
            books = new ArrayList<>();
        }
    }

    public List<Book> finaAll() {
        return books;
    }

    public Book save(Book book) {
        books.add(book);

        updateJsonFile();

        return book;
    }

    public Book update(Book book) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId().equals(book.getId())) {
                books.set(i, book);
            }
        }

        updateJsonFile();

        return book;
    }

    private void updateJsonFile() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File(PATHNAME), books);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
