<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2 style="color: red;">
		Values are =
		<h3 style="font-family: verdana;">${no1},
			${no2};
			</h1>
	</h2>
	<h2 style="color: green;">
		Result Answer is =
		<h3 style="color: blue;">${Resultadd};</h3>
	</h2>
	<form action="PreviousPage" method="get">
		<input type="submit" value="BACK">
	</form>
</body>
</html>