<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<spring:url var="images" value="/rs/images" />
<spring:url var="customcs" value="/rs/css" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">



<title>${title}</title>


<!-- Custom styles for this template -->
<link href="${customcs}/header.css" rel="stylesheet" />

<script>
	window.contextRoot = '${contextRoot}';
</script>

</head>

<body class = "bgimg">

<!--BODY-->
<div>

		<!-- Navigation -->
		<%@include file="shared/nav.jsp"%>
		

		<div class = "container">
			<c:if test="${userclickhome == true}">
				<%@include file="home.jsp"%>
			</c:if>

			<c:if test="${userclickabout == true}">
				<%@include file="about.jsp"%>
			</c:if>

			<c:if test="${userclickcontact == true}">
				<%@include file="contact.jsp"%>
			</c:if>
			
		</div>
		
		<!-- Footer -->
		

</div>

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</body>

</html>