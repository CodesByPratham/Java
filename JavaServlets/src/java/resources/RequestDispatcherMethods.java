package resources;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RequestDispatcherMethods extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body bgcolor='pink'>");

        // Get user input from the form (username and password)
        String user = request.getParameter("uname");
        String pwd = request.getParameter("upwd");

        out.println("<b>Hello " + user);

        // Check if the entered username and password are correct
        if (user.equals("Pratham") && pwd.equals("Password")) {
            // If the credentials are valid, forward to the WelcomePage servlet
            RequestDispatcher rd = request.getRequestDispatcher("WelcomePage");
            rd.forward(request, response);  // Forward the request and response to WelcomePage servlet
        } else {
            // If the credentials are invalid, show an error message and include the login form again
            out.println("<b> Sorry, Your UserName or Password is Incorrect!!!");

            // Include the login form again in the response (it keeps the current response intact)
            RequestDispatcher rd = request.getRequestDispatcher("JavaRequestDispatcher");
            rd.include(request, response);  // Include the content of JavaRequestDispatcher servlet

            /**
             * Alternatively, we could use
             * response.sendRedirect("JavaRequestDispatcher"); but Redirection
             * Mechanism will work at Client Side. Hence Client aware of which
             * Servlet is providing the required Response. A separate New
             * Request Object will be created in Redirection. Hence Information
             * sharing between the Components is not possible. It is the Best
             * Choice if we want to communicate outside of Server.
             */
        }

        out.println("</Center>");
        out.println("</body>");
        out.println("</html>");
    }
}
