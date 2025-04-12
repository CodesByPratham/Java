package resources;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class JavaCookies extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {

        // Create a cookie and add to response
        Cookie userCookie = new Cookie("username", "CookiePratham");
        res.addCookie(userCookie);

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<h2>Cookie Created and Sent to Client</h2>");
        out.println("<a href='DisplayServlet'>Go to DisplayServlet</a>");
    }
}
