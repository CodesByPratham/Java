<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.Date" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP Life Cycle Example</title>
</head>
<body>

    <h2>JSP Life Cycle Demonstration</h2>

    <!-- Request Processing Phase -->
    <p>Current Request Processed at: <%= new Date() %></p>

</body>
</html>

<%!
    // Translation Phase - JSP is converted into a Servlet (Handled by JSP Engine)
    
    // Compilation Phase - The Servlet class is compiled
    
    // Servlet Class Loading - Class is loaded into memory
    
    // Initialization Phase - jspInit() is executed once
    public void jspInit() {
        System.out.println("jspInit() called: JSP Page Initialized");
    }

    // Service Phase - _jspService() is executed for each request (Auto-managed)
    
    // Destruction Phase - jspDestroy() is executed once when JSP is unloaded
    public void jspDestroy() {
        System.out.println("jspDestroy() called: JSP Page Destroyed");
    }
%>
