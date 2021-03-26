<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="images" value="/rs/images" />
<spring:url var="customcs" value="/rs/css" />
<spring:url var="custumjs" value="/rs/js" />



<c:set var="contextRoot" value="${pageContext.request.contextPath}" />


<html lang="en">


<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<!-- Latest compiled JavaScript -->
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<title>${title}</title>


<!-- Custom styles for this template -->
<link href="${customcs}/mystyle.css" rel="stylesheet">

<script>
	window.contextRoot = '${contextRoot}';
</script>
</head>

<body class = "bgimg">


	<div class="wrapper">

		<!-- Navigation -->
		<%@include file="shared/nav.jsp"%>

		<!-- Page Content -->
		<div class="content">
		
			<c:if test="${userclickhome == true}">
				<%@include file="home.jsp"%>
			</c:if>

			<c:if test="${userclickabout == true}">
				<%@include file="about.jsp"%>
			</c:if>

			<c:if test="${userclickcontact == true}">
				<%@include file="contact.jsp"%>
			</c:if>
			
			<c:if test="${userclickAllProducts == true  || userclickCategoryProducts == true}">
				<%@include file="product.jsp"%>
			</c:if>
			
			<c:if test="${userclickSingleProduct == true}">
				<%@include file="productinfo.jsp"%>
			</c:if>


		</div>

		<!-- Footer -->
		<%@include file="shared/footer.jsp"%>
	</div>


</body>

</html>