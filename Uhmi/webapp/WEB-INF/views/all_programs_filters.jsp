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
	<h2>List of Programs FILTERS</h2>	
	<table>
		<tr>
			<td>PROGRAM NAME</td><td>COMPANY NAME</td><td>FILTER NAME</td>
		</tr>
		<c:forEach var="programFilters" items="${programsFilters}">
		<tr>		
			<td>${programFilters.program.programName}</td>
			<td>${programFilters.program.getCompany().getName()}</td>		
			<td>${programFilters.filter.getName()}</td>		
		</tr>
		</c:forEach>
	</table>
	<br/>
</body>
</html>