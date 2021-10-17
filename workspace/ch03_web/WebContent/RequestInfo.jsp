<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
요청 ip: <%=request.getRemoteAddr() %><br>
요청 방식: <%=request.getMethod() %><br>
요청 uri: <%=request.getRequestURI() %><br>
app 경로: <%=request.getContextPath() %><br>
서버 이름: <%=request.getServerName() %><br>
서버 포트: <%=request.getServerPort() %><br>

</body>
</html>