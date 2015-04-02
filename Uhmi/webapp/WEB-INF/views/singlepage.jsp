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

<title>Insurance programs</title>

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

<!-- jQuery Version 1.11.1 -->
<script src="<c:url value="/resources/js/jquery.js" />"></script>

<!-- Grid Programs JavaScript -->
<script src="<c:url value="/resources/js/getGridInsPrograms.js" />"></script>
<script src="<c:url value="/resources/js/gridInsPrograms.js" />"></script>
<script src="<c:url value="/resources/js/dataSourceInsurancePrs.js" />"></script>

<!-- SinglePage JavaScript -->
<script src="<c:url value="/resources/js/site.js" />"></script>
<script src="<c:url value="/resources/js/spController.js" />"></script>

<!-- Bootstrap Core JavaScript -->
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>
	<!-- Navigation -->
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="<c:url value='/' />">Home</a>
			</div>
			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
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
				<h1 id="insCompanyName">${company.name}</h1>
			</div>
		</div>
		<!-- /.row -->
	</div>
	<!-- /.container -->

	<!--##################################################################################################  -->
	<!--<div>
		<div>
			<div>${company.name}</div>
			<div>${company.hotline}</div>
			<div>${company.id}</div>
		</div>	
	</div>-->

	<!-- ################################################################################################# -->

	<!-- <div  class="filtersBarTitle">
        <h3>Обрати програми за фільтром</h3>
    </div> -->
	<div id="filtersBar" class="filtersBar">
		<div id="messageContainer"></div>
		<div class="filter">
			<h4>Вік, років</h4>
			<input class="age" type="checkbox" name="filterItem" value="0-18"><span>0-18</span>
			<input class="age" type="checkbox" name="filterItem" value="18-55"><span>18-55</span>
			<input class="age" type="checkbox" name="filterItem" value=">=50"><span>55-і
				більше</span>
		</div>
		<div class="filter">
			<h4>Страховий платіж/внесок/премія, грн..</h4>
			<input class="insurancePayment" type="checkbox" name="filterItem"
				value="<1000"><span>До 1000</span> <input
				class="insurancePayment" type="checkbox" name="filterItem"
				value="1000-5000"><span>1000-5000</span> <input
				class="insurancePayment" type="checkbox" name="filterItem"
				value="5000-10000"><span>5000-10000</span> <input
				class="insurancePayment" type="checkbox" name="filterItem"
				value=">=10000"><span>10000- і більше</span>
		</div>
		<div class="filter">
			<h4>Медичні заклади</h4>
			<input class="medicalInstitutions" type="checkbox" name="filterItem"
				value="governmental"><span>Державні</span> <input
				class="medicalInstitutions" type="checkbox" name="filterItem"
				value="departmental"><span>Відомчі</span> <input
				class="medicalInstitutions" type="checkbox" name="filterItem"
				value="commercial"><span>Приватні (комерційні)</span>
		</div>
		<div class="filter">
			<h4>Франшиза</h4>
			<input class="franchise" type="checkbox" name="filterItem" value="0"><span>0</span>
			<input class="franchise" type="checkbox" name="filterItem"
				value="0-5"><span>0-5%</span> <input class="franchise"
				type="checkbox" name="filterItem" value=">=5"><span>5%
				і більше</span> <input class="franchise" type="checkbox" name="filterItem"
				value="0-500"><span>0-500 грн.</span> <input
				class="franchise" type="checkbox" name="filterItem" value=">=500"><span>500
				грн. і більше</span>
		</div>
		<div class="filter">
			<h4>Форма оплати</h4>
			<input class="methodOfPayment" type="checkbox" name="filterItem"
				value="oneOff"><span>Одноразово</span> <input
				class="methodOfPayment" type="checkbox" name="filterItem"
				value="instalment"><span>Розстрочка</span>
		</div>
		<div class="buttonsBar">
			<button id="addToCompare">Додати до порівняння</button>
			<button id="filteringPros">Відфільтровані програми</button>
			<button id="allPrograms">Усі програми</button>
		</div>
	</div>
	<table id="gridInsCoPro" class="table table-striped table-bordered"
		cellspacing="0" width="100%"></table>
	<table id="insPrograms" class="table table-striped table-bordered"
		cellspacing="0" width="100%"></table>

	<!-- ################################################################################################# -->
</body>
</html>