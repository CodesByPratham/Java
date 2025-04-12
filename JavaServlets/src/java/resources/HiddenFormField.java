package resources;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class HiddenFormField extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        // Hidden field carries user data without showing it on UI
        out.println("<form action='DisplayServlet' method='post'>");
        out.println("<input type='hidden' name='username' value='Hidden Pratham'/>");
        out.println("<input type='submit' value='Submit Hidden Form'/>");
        out.println("</form>");
    }
}
