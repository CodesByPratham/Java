<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isErrorPage="true" %>
<%@ page import="java.util.Date" %>

<!DOCTYPE html>
<html>
    <head>
        <title>JSP Implicit Objects Example</title>
    </head>
    <body>

        <h2>JSP Implicit Objects Demonstration</h2>

        <%-- 1. request: Fetching Client Details --%>
        <p><b>Client IP Address:</b> <%= request.getRemoteAddr()%></p>
        <p><b>Request Method:</b> <%= request.getMethod()%></p>
        <p><b>Requested URL:</b> <%= request.getRequestURL()%></p>

        <%-- 2. response: Redirecting User (Uncomment to use) --%>
        <%-- response.sendRedirect("https://example.com"); --%>

        <%-- 3. session: Storing & Retrieving Session Data --%>
        <% session.setAttribute("username", "JohnDoe");%>
        <p><b>Session Username:</b> <%= session.getAttribute("username")%></p>

        <%-- 4. application: Storing Shared Data --%>
        <% application.setAttribute("appName", "JSP Implicit Objects Demo");%>
        <p><b>Application Name:</b> <%= application.getAttribute("appName")%></p>

        <%-- 5. out: Printing Output --%>
        <% out.println("<p><b>Output from 'out' object:</b> This is dynamically generated content.</p>");%>

        <%-- 6. config: Fetching Servlet Configuration --%>
        <p><b>Servlet Name:</b> <%= config.getServletName()%></p>

        <%-- 7. pageContext: Managing Attributes Across Scopes --%>
        <% pageContext.setAttribute("pageVar", "This is a page-scoped variable.");%>
        <p><b>Page Context Variable:</b> <%= pageContext.getAttribute("pageVar")%></p>

        <%-- 8. page: Using 'page' Object --%>
        <p><b>Class of the Current Page:</b> <%= page.getClass().getName()%></p>

        <%-- 9. exception: Handling Exceptions (Works on error pages) --%>
        <% if (exception != null) {%>
        <p style="color:red;"><b>Error Occurred:</b> <%= exception.getMessage()%></p>
        <% } else { %>
        <p>No Exception Occurred.</p>
        <% }%>

    </body>
</html>
