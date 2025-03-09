<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Checking Cookies</title>
    </head>
    <body>

        <h2>Retrieving Stored Cookies</h2>

        <%
            Cookie[] cookies = request.getCookies();
            String username = "Not Found";

            if (cookies != null) {
                for (Cookie c : cookies) {
                    if (c.getName().equals("username")) {
                        username = c.getValue();
                        break;
                    }
                }
            }
        %>

        <p><b>Stored Username (From Cookie):</b> <%= username%></p>

        <br>
        <a href="../jspCookie.jsp">Go Back</a>

    </body>
</html>
