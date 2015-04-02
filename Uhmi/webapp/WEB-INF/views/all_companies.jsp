<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insurance companies</title>
<link
	href="<c:url value="/resources/themes/adminthemes/default/css/main.css" />"
	rel="stylesheet" type="text/css" />
<link
	href="<c:url value="/resources/themes/adminthemes/default/css/bootstrap.min.css" />"
	rel="stylesheet" type="text/css" />
</head>
<body>
	<!-- Top Navigation -->
	<div class="top-menu">
		<nav class="dropdown-main-menu">
			<ul>
				<li><a href="<c:url value='/' />">Site</a></li>
				<li><a href="#">Manage users</a>
					<ul class="submenu">
						<li><a href="<c:url value='#' />">Admin panel</a></li>
						<li><a href="<c:url value='#' />">Client site</a></li>
						<li><a href="<c:url value='#' />">Game 1</a></li>
						<li><a href="<c:url value='#' />">Game 2</a></li>
					</ul></li>
				<li><a href="#">Manage data</a>
					<ul class="submenu">
						<li><a href="<c:url value='/administrator/companies' />">Insurance
								companies</a></li>
						<li><a href="<c:url value='/administrator/programs' />">Insurance
								programs</a></li>
						<li><a href="<c:url value='#' />">Surveys</a></li>
					</ul>
				</li>
				<li class="btn-log-out-adm-panel">
					<c:url var="logoutUrl" value="/logout"/>
				    <form class="form-inline" action="${logoutUrl}" method="post">
				      <input type="submit" value="Log out" />
				      <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
				    </form>
				</li>
				<li id="userRole">
					<a href="#"><c:out value="${pageContext.request.remoteUser}"/></a>
				</li>
			</ul>
		</nav>
	</div>
	<!-- Header -->
	<header class="header">
		<div class="container-title">
			<h1 class="page-title">List of Companies</h1>
		</div>
	</header>

	<!-- Subheader -->
	<div class="subhead-collapse">
		<div class="subhead">
			<div class="container-fluid">
				<div class="row-fluid">
					<div class="btn-toolbar">
						<a class="btn btn-success" href="<c:url value='/administrator/new-company' />">Add
							New Company</a>
					</div>
				</div>
			</div>
		</div>
	</div>

	<table class="table table-striped table-bordered" cellspacing="0"
		width="100%">
		<tr>
			<td>NAME</td>
			<td>Hotline</td>
			<td>ID</td>
			<td>DELETE</td>
		</tr>
		<c:forEach var="company" items="${companies}">
			<tr>
				<td>${company.name}</td>
				<td>${company.hotline}</td>
				<td>${company.id}</td>
				<td><a href="<c:url value='/administrator/delete-${company.id}-company' />">delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br />
</body>
</html>