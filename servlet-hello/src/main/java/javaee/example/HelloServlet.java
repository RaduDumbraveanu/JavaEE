package javaee.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Radu Dumbrăveanu on 2/10/17.
 */
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    public void doGet (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<title>\"Hello, World!\" servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("Hello, World!");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
