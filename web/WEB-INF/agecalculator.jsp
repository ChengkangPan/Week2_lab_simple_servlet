<%-- 
    Document   : agecalculator
    Created on : Sep 27, 2020, 11:43:08 AM
    Author     : 832676
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            <p>Enter your age:<input type="text" name="age" value=""></p>
            <input type="submit" value="Age next birthday">      
        </form>
        <p>${Message}</p>
        <p><a href="arithmeticcalculator.jsp">Arithmetic Calculator</a></p>
</html>
