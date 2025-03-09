<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="/WEB-INF/tlds/customtags.tld" prefix="mytag" %>

<!DOCTYPE html>
<html>
    <head>
        <title>JSP Custom Tag Example</title>
    </head>
    <body>

        <h2>Using Custom Tag in JSP</h2>

        <%-- Using the Custom Tag --%>
        <mytag:helloTag />

    </body>
</html>
