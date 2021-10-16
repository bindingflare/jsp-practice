<%@page import="java.io.FileReader"%>
<%@page import="java.io.BufferedReader"%>
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
	BufferedReader br = null;
	try {
		String filePath = application.getRealPath("/WEB-INF/input.txt");
		br = new BufferedReader(new FileReader(filePath));
		
		while(true)
		{
			String str = br.readLine();
			if(str == null) break;
			out.print(str + "<br>");
		}
	} catch (Exception e) {
		out.print("오류발생: " + e.getMessage() + "<br>");
	}
	
	try {
		br.close();
	} catch (Exception e) {
		out.print("FileReader close() 오류발생: " + e.getMessage() + "<br>");
	}
%>
</body>
</html>