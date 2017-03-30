package javaee.example;

/**
 * Created by Radu Dumbrăveanu on 18.03.17.
 */
public class Book {
  private Long id;
  private String title;
  private String[] authors;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

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
}
