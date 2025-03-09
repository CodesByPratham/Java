<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<jsp:useBean id="user" class="beans.UserBean" scope="session" />
<jsp:setProperty name="user" property="name" value="Pratham" />
<jsp:setProperty name="user" property="age" value="25" />

<!DOCTYPE html>
<html>
    <head>
        <title>JSP UseBean Example</title>
    </head>
    <body>

        <h2>JSP UseBean, SetProperty, and GetProperty Example</h2>

        <p><b>User Name:</b> <jsp:getProperty name="user" property="name" /></p>
        <p><b>User Age:</b> <jsp:getProperty name="user" property="age" /></p>

    </body>
</html>
