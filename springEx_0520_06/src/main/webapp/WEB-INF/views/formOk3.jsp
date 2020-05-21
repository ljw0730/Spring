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
		<p>번호 : ${boardDTO.b_num }</p>
		<p>제목 : ${boardDTO.b_title }</p>
		<p>내용 : ${boardDTO.b_content }</p>
		<p>날짜 : ${boardDTO.b_date }</p>
		<p>그룹 : ${boardDTO.b_group }</p>
		<p>step : ${boardDTO.b_step }</p>
		<p>indent : ${boardDTO.b_indent }</p>	
	
	
	</body>
</html>