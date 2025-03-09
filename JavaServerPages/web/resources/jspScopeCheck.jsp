<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Checking JSP Scope Persistence</title>
    </head>
    <body>

        <h2>Checking Scope Data Persistence</h2>

        <p><b>Request Scope (Expected to be NULL):</b> <%= request.getAttribute("requestData")%></p>
        <p><b>Session Scope:</b> <%= session.getAttribute("sessionData")%></p>
        <p><b>Application Scope:</b> <%= application.getAttribute("appData")%></p>

        <br>
        <a href="../jspScope.jsp">Go Back</a>

    </body>
</html>
