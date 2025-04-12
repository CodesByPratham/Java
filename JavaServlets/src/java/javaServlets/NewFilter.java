package javaServlets;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;

/**
 * MyFilter is an example of a filter used for pre and post processing of
 * requests. It implements the Filter interface and provides the core methods:
 * init(), doFilter(), and destroy().
 */
public class NewFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Initialization code, executed once when the filter is instantiated.
        System.out.println("Filter Initialized");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain fc)
            throws IOException, ServletException {

        // Pre-processing: Executed before the request is passed to the target servlet.
        System.out.println("Filter Before Servlet");

        // Pass the request and response along the filter chain to the next filter/servlet
        fc.doFilter(request, response);

        // Post-processing: Executed after the response is returned from the servlet.
        System.out.println("Filter After Servlet");
    }

    @Override
    public void destroy() {
        // Cleanup code, executed once when the filter is destroyed.
        System.out.println("Filter Destroyed");
    }
}
