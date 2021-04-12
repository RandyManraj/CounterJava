<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h1>Welcome User!!</h1>
    <!-- <c:out value="${2+2}"/>  -->
    <a href="/counter">Lets go for a run</a>
    <a href="/counter2">Lets go for a run by 2s</a>
    <a href="/reset" ><button>Reset Me!</button></a>
</body>
</html>