<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h2>학생 정보</h2>
		학생번호 : ${stuDTO.stu_num } <br/>
		이름 : ${stuDTO.name } <br/>
		학과 : ${stuDTO.major } <br/>
		연락처 : ${stuDTO.tel} <br/>
	</body>
</html>