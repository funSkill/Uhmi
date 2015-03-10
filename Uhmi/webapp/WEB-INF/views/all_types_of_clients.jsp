<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insurance companies</title>

	<style>
		tr:first-child{
			font-weight: bold;
			background-color: #C6C9C4;
		}
	</style>

</head>


<body>
	<h2>List types of clients </h2>	
	<table>
		<tr>
			<td>TIPE OF CLIENTS</td><td>ID in DB</td>
		</tr>
		<c:forEach var="typeOfClients" items="${typesOfClients}">
		<tr>
			<td>${typeOfClients.name}</td>			
			<td>${typeOfClients.id}</td>
		</tr>
		</c:forEach>
	</table>
	<br/>
</body>
</html>