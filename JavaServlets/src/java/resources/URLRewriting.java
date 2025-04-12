package resources;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class URLRewriting extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {

        // Value appended in the URL query string: ?username=Pratham
        String name = req.getParameter("username");

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        out.println("<h2>Hello, " + name + " (from URL Rewriting)</h2>");
    }
}
