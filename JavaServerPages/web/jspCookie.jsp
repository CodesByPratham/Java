<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
    <head>
        <title>JSP Cookies Example</title>
    </head>
    <body>

        <h2>Setting a Cookie</h2>

        <%-- Create a Cookie and set it in response --%>
        <%
            Cookie userCookie = new Cookie("username", "JohnDoe");
            userCookie.setMaxAge(60 * 60 * 24); // Cookie expires in 1 day
            response.addCookie(userCookie);
        %>

        <p>Cookie "username" has been set.</p>

        <a href="resources/jspCookieCheck.jsp">Check Cookies</a>

    </body>
</html>
