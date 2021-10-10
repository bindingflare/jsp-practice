<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>현제 시간</title>
</head>
<body>
<!-- 스크립틀렛 자바코드가 표시되는 영역 -->
 현제 시간은 <% Date now=new Date(); out.print(now); %>입니다.
</body>
</html>