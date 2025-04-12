package javaServlets;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class JavaServletConfig extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");
        out.println("<body bgcolor='cyan'>");

        // Retrieving ServletConfig object, which contains servlet-specific initialization parameters
        ServletConfig config = getServletConfig();

        // Fetching the 'driver' parameter from the web.xml using ServletConfig
        String driver = config.getInitParameter("driver");

        // Displaying the value of the 'driver' parameter
        out.println("<b>Driver Name from Web.xml Configuration file : " + driver);
        out.println("<br>");

        // Retrieving an enumeration of all the initialization parameter names
        Enumeration<String> e = config.getInitParameterNames();
        String str = "";

        // Iterating over each initialization parameter name and displaying its value
        while (e.hasMoreElements()) {
            str = e.nextElement(); // Getting the next parameter name
            out.println("<br><br>Name : " + str); // Displaying the parameter name
            out.println("| Value : " + config.getInitParameter(str)); // Displaying the parameter value
        }

        // Closing HTML tags
        out.println("</body>");
        out.println("</html>");
    }
}
