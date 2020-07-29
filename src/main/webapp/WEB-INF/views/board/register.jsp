<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>Register Page</h3>
	<!-- GET 방식의 /board/register 요청 : 이 페이지에 도착함 -->
	<!-- POST 방식의 /board/register 요청 : 이 페이지에서 작성한 글을 등록함 -->
	
	<form action="/board/register" method="POST">
		아이디 <input name="id"> <br>
		승/패(w/l) <input name="w_l"> <br>
		챔피언 <input name="champion"> <br>
		킬뎃 <input name="kda"> <br>
		킬 관여율 <input name="kill_invol"> <br>
		<button type="submit">Submit</button>
		<button type="reset">Reset</button>
	
	</form>

</body>
</html>