package javaServlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

public class AttributeScopeSet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Set application-scoped attribute (accessible throughout the entire web application)
        request.getServletContext().setAttribute("name", "Application Scoped Attribute");
        
        // Set session-scoped attribute (specific to the user's session)
        HttpSession session = request.getSession();
        session.setAttribute("name", "Session Scoped Attribute");
        
        // Set request-scoped attribute (only accessible during this request)
        request.setAttribute("name", "Request Scoped Attribute");
        
        // Forward the request to another servlet (AttributeScopeGet) to retrieve and display the attributes
        RequestDispatcher rd = request.getRequestDispatcher("AttributeScopeGet");
        rd.forward(request, response);
    }
}
