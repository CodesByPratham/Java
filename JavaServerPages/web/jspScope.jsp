<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.Date" %>

<!DOCTYPE html>
<html>
    <head>
        <title>JSP Scope Example</title>
    </head>
    <body>

        <h2>Demonstrating JSP Scopes</h2>

        <%-- 1. Request Scope (Only available in the same request) --%>
        <% request.setAttribute("requestData", "Request Scope Value");%>
        <p><b>Request Scope:</b> <%= request.getAttribute("requestData")%></p>

        <%-- 2. Session Scope (Retains value throughout user session) --%>
        <% session.setAttribute("sessionData", "Session Scope Value");%>
        <p><b>Session Scope:</b> <%= session.getAttribute("sessionData")%></p>

        <%-- 3. Application Scope (Shared across the entire application) --%>
        <% application.setAttribute("appData", "Application Scope Value");%>
        <p><b>Application Scope:</b> <%= application.getAttribute("appData")%></p>

        <%-- 4. Page Scope (Available only on this page) --%>
        <% pageContext.setAttribute("pageData", "Page Scope Value");%>
        <p><b>Page Scope:</b> <%= pageContext.getAttribute("pageData")%></p>

        <br>

        <%-- Link to another JSP page to check request scope --%>
        <a href="resources/jspScopeCheck.jsp">Go to Next Page (Check if request scope persists)</a>

    </body>
</html>
