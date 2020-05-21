<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>Spring MVC 연습(RequestMapping에서 Get방식과 Post방식) </title>
	</head>
	<body>
		<form action="joinOk" method="post">
			<label for="mem_num">회원번호</label>
			<input type="text" name="mem_num" id="mem_num" /><br/>
			<label for="mem_name">회원이름</label>
			<input type="text" name="mem_name" id="mem_name" /><br/>
			<label for="address">주소</label>
			<input type="text" name="address" id="address" /><br/>
			<label for="tel">연락처</label>
			<input type="text" name="tel" id="tel" /><br/>
			<label for="birth">생년월일</label>
			<input type="text" name="birth" id="birth" /><br/>
		
			<input type="submit" value="전송" />
			<input type="reset" value="취소" />
		
		</form>
	
	
	</body>
</html>