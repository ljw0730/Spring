<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h2>로그인 페이지</h2>
		<form action="formOk" method="post" name="">
			<label for="id">아이디 : </label>
			<input type="text" name="id" id="id" /> <br/>
			<label for="pw">패스워드 : </label>
			<input type="password" name="pw" id="pw" /> <br/>
			
			<input type="submit" value="전송" />
			<input type="reset" value="취소" />
 		
		</form>
	</body>
</html>