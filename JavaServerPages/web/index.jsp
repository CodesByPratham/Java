<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Overview - Basic JSP Page</title>
    </head>
    <body>

        <!-- Presentation Logic: Static HTML -->
        <h1>Welcome to JSP!</h1>
        <p>This is a simple JSP page demonstrating presentation logic.</p>

        <!-- Dynamic Content: Business Logic -->
        <p>Current Date and Time: <%= new java.util.Date()%></p>

    </body>
</html>
