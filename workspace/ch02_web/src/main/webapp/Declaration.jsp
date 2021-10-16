<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		out.println("2 + 3 = " + sum(2, 3));
	%><br>
	<%! /* 함수선언 */
		int sum(int a, int b) {
			return a + b;
		}
	%>
	2^1=<%=power(2,1) %><br>
	2^2=<%=power(2,2) %><br>
	2^3=<%=power(2,3) %><br>
	2^4=<%=power(2,4) %><br>
	2^5=<%=power(2,5) %><br>
	
	<%!
	private int power(int base, int exp)
	{
		int result = 1;
		for(int cnt = 0; cnt < exp; cnt++)
			result *= base;
		return result;
	}
	%>
</body>
</html>