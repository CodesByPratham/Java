package resources;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class PostResult extends HttpServlet {

    /**
     * This method handles POST requests and performs an addition based on form
     * data. It retrieves the input data, performs the calculation, and displays
     * the result.
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
            out.println("<html>");
            out.println("<body>");
            out.println("<body bgcolor='cyan'>");
            out.println("<font color='blue'>");

            // Retrieve the values entered in the form using request.getParameter()
            int num1 = Integer.parseInt(request.getParameter("fno")); // Get the first number (fno)
            int num2 = Integer.parseInt(request.getParameter("sno")); // Get the second number (sno)

            // Perform the addition of the two numbers
            int res = num1 + num2;

            // Display the result of the addition
            out.println("Summation = " + res);

            out.println("</font>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
