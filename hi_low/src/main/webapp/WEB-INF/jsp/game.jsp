<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Player" %>
<%
Player player = (Player) request.getAttribute("player");
String gazo = (String) request.getAttribute("gazo");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HI LOW GAME</title>
<link rel="stylesheet" 
      href="<%= request.getContextPath() %>/css/style.css">
</head>
<body>
	<div id="wrap">
		<h1>HI LOW ゲーム</h1>
		<p>1～99の数字を入力してください</p>
		<form action="game" method="post">
			<% if (player != null) { %>
				<input type="number" min="1" max="99" name="user"
				       value="<%= player.getNumber() %>">
			<% } else { %>
	 			<input type="number" min="1" max="99" name="user">
			<% } %>
			<input type="submit" value="送信">
		</form>
		
		<% if (player != null) { %>
			<p><%= player.getMsg() %></p>
		<% } %>
		
		<% if (gazo != null) { %>
			<img class="gazo" src="<%= gazo %>" alt="">
		<% } %>
	</div>
</body>
</html>