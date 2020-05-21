<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form action="formOk" method="post" name="">
			<label>학번 : </label><input type="text" name="s_num"/><br/>
			<label>이름 : </label><input type="text" name="name"/><br/>
			<label>전공 : </label><input type="text" name="major"/><br/>
			<label>연락처 : </label><input type="text" name="tel"/><br/>
			<label>주소 : </label><input type="text" name="address"/><br/>
			<input type="submit" value="전송" />
			<input type="reset" value="취소" />
		
		</form>
	
	</body>
</html>