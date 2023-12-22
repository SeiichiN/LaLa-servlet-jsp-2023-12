<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>お問い合わせ</title>
</head>
<body>
	<h1>お問い合わせ</h1>
	<form action="testenq" method="post">
		お名前<br>
		<input type="text" name="name"><br>
		お問い合わせの種類<br>
		<select name="qtype">
			<option value="" selected>選択してください</option>
			<option value="compamy">会社について</option>
			<option value="product">製品について</option>
			<option value="support">アフターサポートについて</option>
		</select><br>
		お問い合わせ内容<br>
		<textarea rows="10" cols="60" name="body"></textarea><br>
		<input type="submit" value="送信">
	</form>
</body>
</html>