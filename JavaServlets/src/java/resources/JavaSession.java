package resources;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class JavaSession extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        // Get session or create new
        HttpSession session = req.getSession(true);

        // Store attribute in session
        session.setAttribute("username", "SessionPratham");

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<h2>Session Created and Username Stored</h2>");
        out.println("<a href='DisplayServlet'>Go to DisplayServlet</a>");
    }
}
