<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>LogIn</title>

<!-- Site Core CSS -->
<link
	href="<c:url value="/resources/themes/sitethemes/default/css/main.css" />"
	rel="stylesheet" type="text/css" />

<!-- Bootstrap Core CSS -->
<link
	href="<c:url value="/resources/themes/sitethemes/default/css/bootstrap.min.css" />"
	rel="stylesheet" type="text/css" />

<!-- Custom CSS -->
<style>
body {
	padding-top: 70px;
	/* Required padding for .navbar-fixed-top. Remove if using .navbar-static-top. Change if height of navigation changes. */
}
</style>

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
	<div class="container" tiles:fragment="content">

      <form class="form-signin" name="f" th:action="@{/login}" method="post">
        <h2 class="form-signin-heading">Please sign in</h2>
		<%-- <div th:if="${param.error}" class="alert alert-error">    
			Invalid username and password.
		</div> --%>
		<div th:if="${param.logout}" class="alert alert-success"> 
			You have been logged out.
		</div>
        <label for="inputEmail" class="sr-only">Email address</label>
        <input type="email" id="inputEmail" name="username" class="form-control" placeholder="Email address" required="" autofocus="">
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" required="">
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
      </form>

    </div>
</body>
</html>