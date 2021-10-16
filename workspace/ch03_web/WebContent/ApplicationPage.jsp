<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String path = application.getContextPath();
	String realPath = application.getRealPath(path);
%>

웹 경로: <%=path %>
실제 경로: <%=realPath %>
</body>
</html>