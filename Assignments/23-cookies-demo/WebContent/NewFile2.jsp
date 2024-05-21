<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New File2</title>
</head>
<body>

<c:forEach items="${strings}" var="str">
<c:out value="${str}"></c:out>
</c:forEach>

<c:catch var ="exception">
   <% int x = 5/0;%>
</c:catch>

<c:if test="${exception ne null}">

<c:out value="${exception}"></c:out>
</c:if>
<br>
<c:set var="a" value="5" scope="request"></c:set>

<c:out value="${a}"></c:out>


</body>
</html>