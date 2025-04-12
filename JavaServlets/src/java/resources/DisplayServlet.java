package resources;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class DisplayServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {

        // Get from hidden field (POST request)
        String hiddenUser = req.getParameter("username");

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<h2>--- Hidden Form Field ---</h2>");
        out.println("Username from hidden field: " + hiddenUser);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        // Session example
        HttpSession session = req.getSession(false);
        String sessionUser = (session != null) ? (String) session.getAttribute("username") : "No Session";

        // Cookie example
        String cookieUser = "No Cookie";
        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("username")) {
                    cookieUser = c.getValue();
                }
            }
        }

        out.println("<h2>--- HttpSession ---</h2>");
        out.println("Username from session: " + sessionUser);

        out.println("<h2>--- Cookie ---</h2>");
        out.println("Username from cookie: " + cookieUser);
    }
}
