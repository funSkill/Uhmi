<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
	<title>Insurance companies</title>
	
	<!-- Site Core CSS -->
	<link href="<c:url value="/resources/themes/sitethemes/default/css/main.css" />" rel="stylesheet"  type="text/css" />
	
	<!-- Bootstrap Core CSS -->
	<link href="<c:url value="/resources/themes/sitethemes/default/css/bootstrap.min.css" />" rel="stylesheet"  type="text/css" />
	
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
	<!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand"  href="<c:url value='/' />">Home</a>
                <a class="navbar-brand"  href="<c:url value='/administrator' />">Admin Panel</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <!-- <ul class="nav navbar-nav">
                    <li>
                        <a href="#">About</a>
                    </li>
                    <li>
                        <a href="#">Services</a>
                    </li>
                    <li>
                        <a href="#">Contact</a>
                    </li>
                </ul> -->
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>

    <!-- Page Content -->
    <div class="container">

        <div class="row">
            <div class="col-lg-12 text-center">
                <h1>Страхові компанії</h1>
            </div>
            <div class="btn-bar col-lg-12">
                <a class="btn_filter  btn btn-info" href="<c:url value='/programs-filter' />">обрати програму за допомогою фільтру</a>
            </div>
        </div>
        <!-- /.row -->

    </div>
    <!-- /.container -->

	<div class="companies-container">
		<c:forEach var="company" items="${companies}">
			<a class="btn btn-default btn-lg btn-company" href="<c:url value='/${company.id}' />">${company.name}</a>
		</c:forEach>
	</div>
</body>
</html>