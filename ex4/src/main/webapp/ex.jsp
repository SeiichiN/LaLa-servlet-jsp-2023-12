<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="ex.Employee" %>
<%
Employee emp = new Employee("0001", "湊 雄輔");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% for (int i = 0; i < 10; i++) { %>
		<% switch (i) {
			case 0:
			case 3:
			case 6:
			case 9: %>
				<p style="color:red">
				<% break;
			default: %>
				<p>
		<% } %>
		IDは<%=emp.getId()%>、名前は<%=emp.getName()%>です</p>
	<% } %>
</body>
</html>