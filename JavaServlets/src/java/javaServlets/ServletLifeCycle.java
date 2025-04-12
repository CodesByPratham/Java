package javaServlets;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// A Servlet must implement the Servlet interface to be recognized by the Web Container.
public class ServletLifeCycle implements Servlet {

    // This object holds servlet-specific configuration (from web.xml).
    ServletConfig config;

    // init() method is called only ONCE when the servlet is first loaded into memory by the Web Container.
    // It's used for one-time setup or initialization logic.
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
        System.out.println("Servlet Initialization");
        // At this stage, servlet reads init parameters (if any) from the web.xml via config
    }

    // getServletConfig() returns the ServletConfig object which holds config data from deployment descriptor.
    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }

    // service() method is invoked every time a client sends a request to the servlet.
    // It handles the request and generates response (HTML in this case).
    @Override
    public void service(ServletRequest request, ServletResponse response) 
            throws ServletException, IOException {
        PrintWriter out = response.getWriter(); // Used to write response back to the client
        out.println("<html>");
        out.println("<body>");
        out.println("<h1> Welcome Innocent & Beloved Students of MCA-I Div-II </h1>");
        out.println("</body>");
        out.println("</html>");

        // This is where dynamic content is created and sent back to the client browser.
        // In real applications, we can use request data to customize the response.
    }

    // getServletInfo() can be used to return metadata information about the servlet.
    @Override
    public String getServletInfo() {
        return "This Servlet is Developed by Pratham";
    }

    // destroy() method is called ONCE just before the servlet is taken out of service (e.g., server shutdown).
    // Used for cleanup activities like releasing DB connections or resources.
    @Override
    public void destroy() {
        System.out.println("Servlet Destroyed");
    }
}
