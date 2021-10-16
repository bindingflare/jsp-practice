<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isErrorPage="true"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Directives tag</title>
</head>
<body>
<h4>ErrorPage 디렉티브 태그</h4>
	에러가 발생했습니다
<%	/* exception */
	out.println(exception.getMessage());
%>
</body>
</html>