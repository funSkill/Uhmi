<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
		<h1 class="page-title">TODO</h1>
	</div>
	</header>

	<!-- Subheader -->
	<div class="subhead-collapse">
		<div class="subhead">
			<div class="container-fluid">
				<div class="row-fluid">
					<div class="btn-toolbar">
						<a class="btn btn-default" href="<c:url value='#' />">List of
							All Programs</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>