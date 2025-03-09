<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true" %>
<%@ page import="java.util.Date" %>
<%@ include file="resources/header.jsp" %>

<!DOCTYPE html>
<html>
    <head>
        <title>JSP Directives Example</title>
    </head>
    <body>

        <h2>JSP Page Directive Example</h2>

        <%-- Displaying current date and time --%>
        <p><b>Current Date and Time:</b> <%= new Date()%></p>

        <%-- Include another JSP file using include directive --%>
        <%@ include file="resources/footer.jsp" %>

    </body>
</html>
