<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Human" %>
<%
Human h = (Human) application.getAttribute("human");
// application.removeAttribute("human");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
</head>
<body>
	<h1>index.jspやで</h1>
	<p><%= h.getName() %>さんは、<%= h.getAge() %>歳です。</p>
</body>
</html>