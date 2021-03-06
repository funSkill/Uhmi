<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>administrator</title>
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
			<h1 class="page-title">Admin Panel</h1>
		</div>
	</header>
</body>
</html>