<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Player" %>
<%
String path = request.getContextPath();
String gu = path + "/img/gu.png";
String choki = path + "/img/choki.png";
String pa = path + "/img/pa.png";
Player p = (Player) request.getAttribute("player");
String[] hands = {"グー", "チョキ", "パー"};
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>じゃんけん</title>
<link rel="stylesheet" href="<%= path %>/css/style.css">
</head>
<body>
	<div id="wrap">
		<h1>じゃんけん</h1>
		<form action="game" method="post">
			<label>
				<input type="radio" name="hand" value="0">
				<img class="hand" src="<%= gu %>" alt="グー">
			</label>
			<label>
				<input type="radio" name="hand" value="1">
				<img class="hand" src="<%= choki %>" alt="チョキ">
			</label>
			<label>
				<input type="radio" name="hand" value="2">
				<img class="hand" src="<%= pa %>" alt="パー">
			</label><br>
			<input type="submit" value="勝負!">
		</form>
		<% if (p != null) { %>
			<section class="result-area">
				<h2>結果</h2>
				<p class="flex player-hands">
					<span>ユーザー: <%=hands[p.getHand()] %></span>
					<span>コム: <%=hands[p.getTarget()] %></span>
				</p>
				<p class="result"><%= p.getResult() %></p>
			</section>
		<% } %>
	</div>
	<script src="<%= path %>/js/script.js"></script>
</body>
</html>