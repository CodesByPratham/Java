<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
    <head>
        <title>JSTL Complete Example</title>
    </head>
    <body>

        <h2>JSTL Demonstration: Core, Formatting, and Functions</h2>

        <%-- 1. JSTL Core Tags --%>
        <h3>1. JSTL Core Tags (Conditionals & Loops)</h3>

        <%-- Using c:if for conditional statements --%>
        <c:set var="age" value="20" />
        <c:if test="${age >= 18}">
            <p><b>User is an adult.</b></p>
        </c:if>

        <%-- Using c:forEach to loop through a list --%>
        <h4>Looping through numbers:</h4>
        <ul>
            <c:forEach var="num" begin="1" end="5">
                <li>Number: ${num}</li>
                </c:forEach>
        </ul>

        <%-- Redirecting to another page (Commented for now) --%>
        <%-- <c:redirect url="anotherPage.jsp"/> --%>

        <hr>

        <%-- 2. JSTL Formatting Tags --%>
        <h3>2. JSTL Formatting Tags (Numbers & Dates)</h3>

        <%-- Formatting a number as currency --%>
        <fmt:setLocale value="en_US"/>
        <p><b>Formatted Currency:</b> <fmt:formatNumber value="1234.56" type="currency" /></p>

        <%-- Formatting a date --%>
        <p><b>Formatted Date & Time:</b> 
            <fmt:formatDate value="<%= new java.util.Date()%>" type="both" dateStyle="long" timeStyle="short"/>
        </p>

        <hr>

        <%-- 3. JSTL Functions Tags --%>
        <h3>3. JSTL Functions Tags (String Operations)</h3>

        <%-- Using JSTL functions for string operations --%>
        <c:set var="message" value="Hello, JSP World!" />

        <p><b>Original Message:</b> ${message}</p>
        <p><b>Message Length:</b> ${fn:length(message)}</p>
        <p><b>Uppercase:</b> ${fn:toUpperCase(message)}</p>
        <p><b>Substring (0-5):</b> ${fn:substring(message, 0, 5)}</p>

    </body>
</html>
