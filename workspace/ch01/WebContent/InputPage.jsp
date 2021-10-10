<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
function chk(){
	//요소의 이름을 접근 frm.num1의 값 존재 여부 확인
	if(!frm.num1.value) {
		alert("숫자를 입력하세요"); // 경고 메세지
		frm.num1.focus();
		return false; // 결좌 form로 전달
	}
	if(isNaN(frm.num1.value)) {
		frm.num1.focus();
		frm.num1.value='';
		alert("문자입니다. 다시 입력하세요");
		return false;
	}
	//요소의 이름을 접근 frm.num2의 값 존재 여부 확인
	if(!frm.num2.value) {
		alert("숫자를 입력하세요"); // 경고 메세지
		frm.num2.focus();
		return false; // 결좌 form로 전달
	}
	if(isNaN(frm.num2.value)) {
		frm.num2.focus();
		frm.num2.value='';
		alert("문자입니다. 다시 입력하세요");
		return false;
	}
	
	return true;
}
</script>
</head>
<body>
<h1>두 수 입력</h1>
<form action="AddServlet" method="post" name = "frm" onsubmit="return chk()">
	첫 번째 수:<input name="num1" type="text"><p>
	두 번째 수:<input name="num2"><p>
	<input type="submit" value="완료">
</form>
</body>
</html>