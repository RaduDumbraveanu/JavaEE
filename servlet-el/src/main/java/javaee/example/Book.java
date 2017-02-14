package javaee.example;

import java.net.URL;

/**
 * Created by Radu Dumbrăveanu on 2/10/17.
 */
public class Book {
    private String title;
    private String[] authors;
    private Integer editionNumber;
    private URL url;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public Integer getEditionNumber() {
        return editionNumber;
    }

    public void setEditionNumber(Integer editionNumber) {
        this.editionNumber = editionNumber;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }
}
