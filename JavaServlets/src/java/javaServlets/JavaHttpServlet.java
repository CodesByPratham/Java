package javaServlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// Extending HttpServlet allows this class to handle HTTP-specific methods like GET, POST, etc.
public class JavaHttpServlet extends HttpServlet {

    // The doGet() method is invoked by the Web Container whenever a GET request is made by the client.
    // This method is part of the HTTP protocol-specific handling.
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Setting the response type to HTML so the browser can interpret it correctly
        response.setContentType("text/html");

        // Getting the PrintWriter object to send character-based output to the client
        PrintWriter out = response.getWriter();

        // Writing HTML content to the response stream
        out.println("<h1>Welcome Innocent & Beloved Students of MCA-I</h1>");

        // The doGet() method is one of several HTTP method handlers like doPost(), doPut(), doDelete(), etc.
        // These methods are mapped based on the HTTP method used in the request.
    }

    // Note:
    // If the request uses the POST method, we would override doPost().
    // If needed, the service() method can also be overridden to manage both GET and POST in a centralized way.
}
