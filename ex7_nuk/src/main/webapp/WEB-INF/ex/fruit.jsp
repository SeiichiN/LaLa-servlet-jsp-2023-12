<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="ex.Fruit" %>
<%
Fruit fruit = (Fruit) request.getAttribute("fruit");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>果物屋</h1>
	<form action="fruit" method="post">
		果物の名前：<input type="text" name="name"><br>
		1個の値段：<input type="number" name="price">円<br>
		個数：<input type="number" name="number">個<br>
		<input type="submit" value="送信">
	</form>
	<% if (fruit != null) { %>
		<%= fruit.getName() %>の値段は<%= fruit.getPrice() %>円です。
	<% } %>
</body>
</html>