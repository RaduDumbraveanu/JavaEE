package javaee.example;

import java.io.IOException;
import java.net.URL;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Radu Dumbrăveanu on 2/22/2017.
 */
@WebServlet("/book-form")
public class BooksServlet extends HttpServlet {
  BookDao bookDao;

  @Override
  public void init() throws ServletException {
    bookDao = new BookDao();
  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Long bookId = Long.valueOf(request.getParameter("id") != null ? request.getParameter("id") : "0");

    request.setAttribute("book", bookDao.find(bookId));
    request.setAttribute("id", bookId);

    RequestDispatcher view = request.getRequestDispatcher("book-form.jsp");
    view.forward(request, response);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Long bookId = Long.valueOf(request.getParameter("id") != null ? request.getParameter("id") : "0");

    Book book = bookDao.find(bookId);
    book.setTitle(request.getParameter("title"));
    book.setEditionNumber(Integer.valueOf(request.getParameter("edition")));
    book.setUrl(new URL(request.getParameter("url")));
    bookDao.update(book);

    response.sendRedirect("/book2-form?id=" + bookId);
  }
}
