package resources;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class AttributeScopeGet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Get application-scoped attribute (accessible globally in the app)
        String applicationScope = (String)request.getServletContext().getAttribute("name");
        
        // Get session-scoped attribute (specific to this user’s session)
        HttpSession session = request.getSession();
        String sessionScope = (String)session.getAttribute("name");
        
        // Get request-scoped attribute (available only during this request)
        String requestScope = (String)request.getAttribute("name");
        
        // Print the values of the attributes in the response (HTML page)
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<body bgcolor='cyan'>");
        out.println("<h2>Servlet Attributes Example: Application Scope, Session Scope and Request Scope</h2>");
        out.println("<p><b>ApplicationScope : " + applicationScope + "</p>");
        out.println("<p>SessionScope: " + sessionScope + "</p>");
        out.println("<p>RequestScope: " + requestScope + "</p>");
        
        // After displaying the session attribute, remove it from the session
        if (session != null) {
            session.removeAttribute("name");
        }
    }
}
