<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>Modify Page</h3>
	<form id="modi-form" method="POST">
	아이디 <input readonly name="id" value="<c:out value='${board.id }'/>"> <br>
	승/패(w/l) <input name="w_l" value="<c:out value='${board.w_l }'/>"> <br>
	챔피언 <input name="champion" value="<c:out value='${board.champion }'/>"> <br>
	킬뎃 <input name="kda" value="<c:out value='${board.kda }'/>"> <br>
	킬 관여율 <input name="kill_invol" value="<c:out value='${board.kill_invol }'/>"> <br>	
	</form>
	<button type="submit" data-todo="modify">Modify</button>
	<button type="submit" data-todo="remove">Delete</button>
	<button type="submit" data-todo="list">List</button>
	
	<script>
	
	//타입이  submit인 모든 버튼 태그를 배열로 가져온다.
	const buttons=document.querySelectorAll("button[type='submit']");
	//id가 modi-form인 html 요소를 하나 가져온다.
	const form=document.querySelector("form");
	
	//가져온 모든 버튼에 이벤트를 추가한다.
	for(i=0;i<buttons.length;++i){
		
		//addEventLister(이벤트종류, 이벤트발생시 실행함수) : 해당 요소에 원하는 이벤트를 추가한다
		buttons[i].addEventListener("click",function(e){
			
			e.preventDefault(); //기본 동작을 막아줌
			
			// 눌린 button의 data-todo를 가져와 todo 변수에 저장한다.
			const todo=e.toElement.dataset.todo;
			//cf 자바 스크립트는 ; 없어도 됨
			if(todo=='remove'){
				//alert('눌린 것은 remove')
				form.setAttribute("action","/board/remove");
			}else if(todo=='list'){
				//alert('눌린 것은 list')
				location.href="/board/list"; //Get방식
				//GetMapping 으로 처리되기 떄문에 location.href를 이용
				return;
			}else if(todo=='modify'){
				//alert('눌린 것은 modify')
				form.setAttribute("action","/board/modify");
			}
			
			form.submit();
			
		});
	}
	
	</script>
	

</body>
</html>