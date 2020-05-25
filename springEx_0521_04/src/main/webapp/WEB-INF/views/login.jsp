<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>validator</title>
	</head>
	<body>
		<form action="loginOk">
			<h2>로그인</h2>
			<label>아이디 : </label>
			<input type="text" name="id"/><br/>
			<label>패스워드 : </label>
			<input type="text" name="pw"/><br/>
			<label>이름 : </label>
			<input type="text" name="name"/><br/> 
			
			<input type="submit" value="로그인" />
			<input type="reset" value="취소" />
		
		
		</form>
	</body>
</html>