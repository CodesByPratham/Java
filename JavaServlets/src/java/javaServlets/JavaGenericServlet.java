package javaServlets;

// Importing required servlet and IO classes
import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * GenericServlet demonstrates a simple use of the GenericServlet class.
 * GenericServlet is protocol-independent and can be used for any kind of request/response.
 * It's an abstract class that provides default implementations of init(), destroy(), and getServletConfig().
 * Only the service() method must be implemented.
 */
public class JavaGenericServlet extends GenericServlet {

    // The service() method is called by the servlet container to process each request.
    // It receives ServletRequest and ServletResponse objects.
    @Override
    public void service(ServletRequest request, ServletResponse response) 
            throws ServletException, IOException {

        // Set the content type of the response to HTML.
        // This sets the MIME type of the response. Important for the browser to understand the data format.
        response.setContentType("text/html");
        
        // Get a character output stream to write the response back to the client.
        PrintWriter out = response.getWriter();

        // Writing basic HTML content as response.
        out.println("<html>");
        out.println("<body>");
        out.println("<h1> Hello World </h1>");
        out.println("</body>");
        out.println("</html>");

        // The response goes back to the client (browser), displayed as a rendered HTML page.
    }
}
