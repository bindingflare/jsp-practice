<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
function chk() {
	if(!frm.title.value){alert("제목"); frm.title.focus(); return false;}
	if(!frm.name.value){alert("이름"); frm.name.focus(); return false;}
	if(!frm.content.value){alert("내용"); frm.content.focus(); return false;}
	
	return true;
}
</script>
</head>
<body>
<h1>게시판</h1>
<form action="Board" name="frm" method="post" onsubmit="return chk()">
<table border=1 bgcolor="pink">
	<tr><td>제목</td><td><input name="title"></td></tr>
	<tr><td>이름</td><td><input name="name"></td></tr>
	<tr><td>내용</td><td><textarea name="content" rows="10" cols="30"></textarea></td></tr>
	<tr><td><input type="submit" value="확인">
			<input type="submit" value="취소"></td></tr>
</table>
</form>
</body>
</html>