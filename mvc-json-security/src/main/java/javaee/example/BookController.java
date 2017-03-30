package javaee.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Radu Dumbrâveanu on 18.03.17.
 */
@Controller("/")
public class BookController {
  private BookDao bookDao;

  public BookController() {
    bookDao = new BookDao();
  }

  @GetMapping
  public String index(Model model) {
    model.addAttribute("books", bookDao.finaAll());
    return "books";
  }
}
