<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Player" %>
<%
Player p = (Player) request.getAttribute("player");
String[] hands = {"グー", "チョキ", "パー"};
String path = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>じゃんけんゲーム</title>
<link rel="stylesheet" href="<%= path %>/css/style.css">
</head>
<body>
	<div id="wrap">
		<section>
			<h1>じゃんけんゲーム</h1>
			<form action="game" method="post" class="janken-form">
				<div class="janken-btn">
					<label class="btn-area">
						<img src="<%= path %>/img/gu.png" alt="グー" class="hand-image">
						<input type="radio" name="hand" value="0">
					</label>
	
					<label class="btn-area">
						<img src="<%= path %>/img/choki.png" alt="チョキ" class="hand-image">
						<input type="radio" name="hand" value="1">
					</label>
					
					<label class="btn-area">
						<img src="<%= path %>/img/pa.png" alt="パー" class="hand-image">
						<input type="radio" name="hand" value="2">
					</label>
				</div>
				
				<input type="submit" value="勝負!">			
			</form>
		</section>
		
		<section>
			<h2>結果</h2>
			<% if (p != null) { %>
				<p>ユーザー: <%= hands[p.getHand()] %></p>
				<p>コム: <%= hands[p.getCom()] %></p>
				<p>勝敗: <%= p.getResult() %></p>
			<% } %>
		</section>
	</div>
</body>
</html>