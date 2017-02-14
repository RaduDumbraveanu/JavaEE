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
@WebServlet("/info")
public class InfoServlet extends HttpServlet {
    @Override
    public void doGet (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<title>Info servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Info servlet gen phpinfo()</h1>");
        out.println("<p>Context path: " + request.getContextPath() + "</p>");
        out.println("<p>Method: " + request.getMethod() + "</p>");
        out.println("<p>Path info: " + request.getPathInfo() + "</p>");
        out.println("<p>Path translated: " + request.getPathTranslated() + "</p>");
        out.println("<p>Query string: " + request.getQueryString() + "</p>");
        out.println("<p>Request URI: " + request.getRequestURI() + "</p>");
        out.println("<p>Servlet path: " + request.getServletPath() + "</p>");
        out.println("<p>Remote address: " + request.getRemoteAddr() + "</p>");
        out.println("<p>Scheme: " + request.getScheme() + "</p>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
