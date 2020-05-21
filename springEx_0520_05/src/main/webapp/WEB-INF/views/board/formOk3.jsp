<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		
		<h2>게시판 정보</h2>
		<p> 번호 : ${board.b_num }</p>
		<p> 제목 : ${board.b_title }</p>
		<p> 내용 : ${board.b_content }</p>
		<p> 날짜 : ${board.b_date }</p>
		<p> 그룹 : ${board.b_group }</p>
		<p> step : ${board.b_step }</p>
		<p> indent : ${board.b_indent }</p> 
		
	</body>
</html>