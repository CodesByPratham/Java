package resources;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * ProfileServlet is the target servlet for displaying a profile page.
 * It is accessed through a link from the HelloWorld servlet.
 */
public class ProfileServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Set the response content type to HTML
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // Log message when ProfileServlet is accessed
        System.out.println("Profile Servlet Executed.....");

        // Display profile page
        out.println("<html>"); 
        out.println("<head>");
        out.println("<title> Servlet ProfileServlet </title>");
        out.println("</head>");
        out.println("<body bgcolor = 'teal'>"); 
        out.println("<h1>Welcome to Profile Page</h1>");
        out.println("<h1>This is the Profile Page</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
