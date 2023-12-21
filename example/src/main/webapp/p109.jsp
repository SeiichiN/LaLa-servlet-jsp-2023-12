<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Random" %>
<%
// これはコメントです
String name = "湊 雄輔";
int age = 23;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- jspのコメントです --%>
	<h1>p109.jsp</h1>
	<p>私の名前は<%= name %>、年齢は<%= age %>才です。</p>
	<% for (int i = 0; i < 5; i++) { %>
		<p>こんにちは</p>
	<% } %>
	<!-- htmlのコメントです -->
	<%= new Random().nextInt(4) %>
</body>
</html>