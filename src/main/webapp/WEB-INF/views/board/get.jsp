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

	<h3>Datail Page</h3>
	아이디 
	<input name="id" value="<c:out value='${board.id}' />" 
	 readonly>
	 승/패(w/l) <input name="w_l" readonly <c:out value='${board.w_l }' />> <br>
	챔피언 <input name="champion" readonly <c:out value='${board.champion }' />> <br>
	킬뎃 <input name="kda" readonly <c:out value='${board.kda }' />> <br>
	킬 관여율 <input name="kill_invol" readonly <c:out value='${board.kill_invol }' />> <br>
	
	<button style="
						color:white; 
						background-color:yellowgreen;
						padding:5px 12px;
						border-radius:5px;
						left:50px;
						margin-top:10px;"
						onclick="location.href='/board/modify?id=${board.id}'">Modify</button> 
	

</body>
</html>