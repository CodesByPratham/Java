package javaServlets;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * MyFilter uses FilterConfig to read init parameter from web.xml. Based on
 * value ("Core Java" or "Advance Java"), it either stops processing or forwards
 * request.
 */
public class MyFilter implements Filter {

    FilterConfig config;

    // Called once when the filter is initialized.
    @Override
    public void init(FilterConfig config) throws ServletException {
        this.config = config; // Store the config object to access init params later
    }

    // Called every time a matching request URL is intercepted
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain fc)
            throws IOException, ServletException {

        PrintWriter out = response.getWriter();

        // Get the init parameter named "Pratham" from web.xml
        String env = config.getInitParameter("Pratham");

        // Behavior based on the value of the init-param
        if (env.equals("Core Java")) {
            out.println("<h2>Welcome Core Java</h2>");
            // Do not forward the request, just end here (block servlet execution)
        } else if (env.equals("Advance Java")) {
            // Forward request to next filter or servlet in the chain
            fc.doFilter(request, response);
        }
    }

    // Called once when the filter is taken out of service
    @Override
    public void destroy() {
        // Cleanup if needed
    }
}
