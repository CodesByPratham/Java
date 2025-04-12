package javaServlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class PostRequest extends HttpServlet {

    /**
     * This method handles GET requests from the client. It generates an HTML
     * form to collect user input.
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");

        // Create a form with POST method, the action attribute specifies where the form data will be sent (to the 'Two' servlet)
        out.println("<form action='PostResult' method='Post'>");
        out.println("First No <input type='text' name='fno'><br>");
        out.println("Second No <input type='text' name='sno'><br>");
        out.println("<input type='submit' value='Submit'><br>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
