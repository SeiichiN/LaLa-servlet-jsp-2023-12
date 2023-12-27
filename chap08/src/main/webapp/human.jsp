<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Human" %>
<%
Human h = (Human) session.getAttribute("human");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>title</title>
</head>
<body>
	<h1>human.jspやで</h1>
	<p><%= h.getName() %>さんは、<%= h.getAge() %>歳です。</p>
</body>
</html>