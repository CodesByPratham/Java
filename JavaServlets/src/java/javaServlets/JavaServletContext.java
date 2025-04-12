package javaServlets;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class JavaServletContext extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");
        out.println("<body bgcolor='cyan'>");

        // Creating ServletContext object to access application-wide parameters
        ServletContext context = getServletContext();

        // Retrieving the value of the context initialization parameter defined in web.xml
        String initParam = context.getInitParameter("Pratham");

        // Displaying the value of the context parameter
        out.println("<b>The value of Param-Name from Web.xml: " + initParam + "</b>");

        // Getting all the initialization parameter names using Enumeration
        Enumeration<String> enm = context.getInitParameterNames();

        String str;

        // Looping through each initialization parameter name
        while (enm.hasMoreElements()) {
            // Get the name of the parameter
            str = enm.nextElement();

            // Displaying the parameter name and its value
            out.println("<br> Name  : " + str);
            out.println("<br> Value : " + context.getInitParameter(str));
        }

        out.println("</body>");
        out.println("</html>");
    }
}
