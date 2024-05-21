<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Demo</title>
</head>
<body>
<h1>
<c:set var="id" value="${100}" scope="session"></c:set>

<c:out value="${id}"></c:out>

<c:import url="NewFile.jsp"></c:import>
</h1>

<c:if test="${id != 100}">
<p>If is working</p>
</c:if>

<c:choose>
<c:when test="${id<100 }">
less than 100
</c:when>
<c:when test="${id>100 }">
greater than 100
</c:when>
<c:when test="${id==100 }">
equal to 100
</c:when>
<c:otherwise>
otherwise
</c:otherwise>

</c:choose>
<table>

<c:forEach items="${strings}" var="str">
<tr><td>
<c:out value="${str}"></c:out>
</td>
</tr>
</c:forEach>

</table>

</body>
</html>