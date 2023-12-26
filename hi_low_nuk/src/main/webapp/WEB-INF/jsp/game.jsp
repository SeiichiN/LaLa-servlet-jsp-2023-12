<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.User" %>
<%
User user = (User) request.getAttribute("user");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%= request.getContextPath() %>/css/style.css">
</head>
<body>
	<h1>HI LOW ゲーム</h1>
	<p>1～9の数字を入力してください</p>
	<form action="game" method="post">
		<% if (user == null) { %>
			<input type="number" min="1" max="9" name="user" value="">
		<% } else { %>
			<input type="number" min="1" max="9" name="user" value="<%= user.getNumber() %>">
		<% } %>
		<input type="submit" value="送信">
	</form>
	<% if (user != null) { %>
		<p><%= user.getMsg() %></p>
	<% } %>
</body>
</html>