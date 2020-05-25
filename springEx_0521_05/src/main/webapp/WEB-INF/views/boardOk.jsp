<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>@Valid</title>
	</head>
	<body>
		<h2>게시판 정보</h2>
		게시판 번호 : ${boardDTO.b_num} <br/>
		제목 : ${boardDTO.b_title} <br/>
		내용 : ${boardDTO.b_content} <br/>
		작성일 : ${boardDTO.b_date} <br/>
	</body>
</html>