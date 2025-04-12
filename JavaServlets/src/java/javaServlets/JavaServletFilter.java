package javaServlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * A basic servlet that provides two links to other servlets. When user clicks
 * either link, the corresponding servlet is invoked. If a filter is mapped to
 * these URLs, it will be executed before and after the servlet.
 */
public class JavaServletFilter extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");
        out.println("<h1><a href='ProfileServlet'>Go to PROFILE Servlet</a></h1>");
        out.println("<h1><a href='OrderServlet'>Go to ORDER Servlet</a></h1>");
        out.println("<h1><a href='MyServlet'>Go to MyServlet</a></h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
