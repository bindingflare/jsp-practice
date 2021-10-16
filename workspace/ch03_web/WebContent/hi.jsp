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
	// 파라미터 값은 String 타입으로 넘어옴
	String str = request.getParameter("yourname");
	byte[] bs = str.getBytes("8859_1");
	// String st = new String(str.getBytes("8859_1"), "euc-kr");
	String st = new String(bs, "euc-kr");
%>
안녕하세요, <%=str %>님!<br>
안녕하세요, <%=st %>님!<br>


</body>
</html>