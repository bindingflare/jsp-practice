<%@page import="java.util.Enumeration"%>
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
	Enumeration enumParams = request.getParameterNames();
	while(enumParams.hasMoreElements())
	{
		out.print(enumParams.nextElement() + "<br>");
	}
%>

<%
	String name = request.getParameter("name");
	String id = "";
	String pass = request.getParameter("pass");
	String gender = request.getParameter("gender");
	String inotice = request.getParameter("inotice");
	String cnotice = request.getParameter("cnotice");
	String dnotice = request.getParameter("dnotice");
	String job = request.getParameter("job");
	
	if(inotice==null) inotice = "";
	if(cnotice==null) cnotice = "";
	if(dnotice==null) dnotice = "";
	
	out.print("<html><body>");
	out.print("이름: " + name + "<p>아이디: " + id + "<p>");
	out.print("암호: " + pass + "<p>");
	out.print("성별: " + gender + "<p>");
	out.print("메일수신: " + inotice + " " + cnotice + " " + dnotice + "<p>");
	out.print("직업: " + name + "<p>");
	out.print("</body></html>");
%>
<br>
<%=request.getHeader("host") %><br>
<%=request.getHeader("accept-language") %>


</body>
</html>