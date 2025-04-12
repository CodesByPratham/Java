package resources;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * OrderServlet is the target servlet for displaying an order page.
 * It is accessed through a link from the HelloWorld servlet.
 */
public class OrderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Set the response content type to HTML
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // Log message when OrderServlet is accessed
        System.out.println("Order Servlet Executed.....");

        // Display order page
        out.println("<html>"); 
        out.println("<head>");
        out.println("<title> Servlet OrderServlet </title>");
        out.println("</head>");
        out.println("<body bgcolor = 'cyan'>");
        out.println("<h1> This is OrderServlet </h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
