<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true" %>

<!DOCTYPE html>
<html>
    <head>
        <title>JSP Session Tracking Example</title>
    </head>
    <body>

        <h2>Session Tracking with HttpSession</h2>

        <%-- Store user data in session --%>
        <% session.setAttribute("username", "JohnDoe");%>

        <p><b>Session ID:</b> <%= session.getId()%></p>
        <p><b>Stored Username:</b> <%= session.getAttribute("username")%></p>

        <a href="resources/jspSessionCheck.jsp">Check Session in Another Page</a>

    </body>
</html>
