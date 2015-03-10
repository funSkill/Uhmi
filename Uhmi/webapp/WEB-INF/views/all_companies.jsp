<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insurance companies</title>

	<style>
		tr:first-child{
			font-weight: bold;
			background-color: #C6C9C4;
		}
	</style>

</head>


<body>
	<h2>List of Companies</h2>	
	<table>
		<tr>
			<td>NAME</td><td>Hotline</td><td>ID in DB</td>
		</tr>
		<c:forEach var="company" items="${companies}">
			<tr>
			<td>${company.name}</td>
			<td>${company.hotline}</td>
			<td>${company.id}</td>
		</tr>
		</c:forEach>
	</table>
	<br/>
</body>
</html>