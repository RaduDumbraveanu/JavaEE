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
@WebServlet("/hello-form")
public class HelloFormServlet extends HttpServlet {
    @Override
    public void doGet (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        if (name == null || "".equals(name.trim())) {
            printForm(out);
        } else {
            printHello(out, name);
        }

        out.close();
    }

    private void printForm(PrintWriter out) {
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<title>\"Hello, World!\" servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<form action=\"hello-form\" method=\"get\">");
        out.println("N-am reținut numele dumneavoastră, nu vă supărați!");
        out.println("<input type=\"text\" name=\"name\"><br>");
        out.println("<input type=\"submit\" value=\"Submit\">");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

    private void printHello(PrintWriter out, String name) {
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<title>\"Hello, World!\" servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("Bună ziua " + name + "!");
        out.println("</body>");
        out.println("</html>");
    }
}
