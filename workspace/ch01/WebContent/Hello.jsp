<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Hello!!!!
jsp는 html파일에 자바코드가 있는 형식입니다.
<br>
<!-- ?이후는 파라미터 전달 부분, queryString -->
<a href="test3?id=hong&pwd=1234">테스트3</a>
<br>
<button onclick="move()">페이지 이동 (Test2)</button>
<!-- 스크립트를 이용한 이동 - GET방식 이동 -->
<script>
	function move(){
		location.href="test2?id=nada&pwd=4321";
	}
</script>

<form action="test2" method="get"> <!-- default:get -->
	Id: <input name="id"><br>
	Password: <input type="password" name="pwd"><br>
	<input type="submit"><!-- 기본 동작: 페이지 이동 처리 -->
</form>
</body>
</html>