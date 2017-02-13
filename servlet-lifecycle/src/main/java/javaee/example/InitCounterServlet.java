package javaee.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Radu Dumbrăveanu on 2/10/17.
 */
@WebServlet(value = "/init-counter", initParams = {
        @WebInitParam(name = "counter", value = "99")})
public class InitCounterServlet extends HttpServlet {
    private int counter;

    @Override
    public void init() {
        try {
            counter = Integer.parseInt(getInitParameter("counter"));
        } catch (NumberFormatException e) {
            counter = 0;
        }
    }

    @Override
    public void doGet (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        counter++;
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<title>CounterServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>CounterServlet</h1>");
        out.println("<p>counter: " + counter + "</p>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
