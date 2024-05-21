<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="Date.jsp" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My First Jsp Page</title>
</head>
<body>

<h1>  This is my first JSP Page</h1>

<%-- This is a comment --%>

<%! int i=10; %>

<%
    out.print(i);
   
    
 

%>

<%= ++i %>



</body>
</html>