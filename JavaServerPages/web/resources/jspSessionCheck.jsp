<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Check Session Data</title>
    </head>
    <body>

        <h2>Checking Session Data</h2>

        <p><b>Session ID:</b> <%= session.getId()%></p>
        <p><b>Stored Username:</b> <%= session.getAttribute("username")%></p>

        <br>
        <a href="../jspSession.jsp">Go Back</a>

    </body>
</html>
