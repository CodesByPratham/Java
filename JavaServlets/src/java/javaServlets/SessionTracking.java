package javaServlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class SessionTracking extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        out.println("<h1>Session Tracking Techniques</h1>");
        out.println("<ul>");
        out.println("<li><a href='HiddenFormField'>Hidden Form Field</a></li>");
        out.println("<li><a href='URLRewriting?username=Pratham'>URL Rewriting</a></li>");
        out.println("<li><a href='JavaSession'>HttpSession</a></li>");
        out.println("<li><a href='JavaCookies'>Cookies</a></li>");
        out.println("</ul>");
    }
}
