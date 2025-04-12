package resources;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class WelcomePage extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body bgcolor='teal'>");
        out.println("<Center>");
        
        // Get user password (in this case, the password is used as the 'username' in the WelcomePage)
        String user = request.getParameter("uname");

        // Display a personalized welcome message
        out.println("<b> Welcome User. Your User Name is: " + user);
        out.println("</Center>");
        out.println("</body>");
        out.println("</html>");
    }
}
