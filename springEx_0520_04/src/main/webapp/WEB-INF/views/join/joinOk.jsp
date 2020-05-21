<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h2>학생성적정보</h2>
		<p> 학생번호 : ${student.stu_num }</p>
		<p> 학생이름 : ${student.stu_name }</p>
		<p> 국어점수 : ${student.kor }</p>
		<p> 영어점수 : ${student.eng }</p>
		<p> 수학점수 : ${student.math }</p>
		<p> 합계 : ${student.total }</p>
		<p> 평균 : ${student.avg }</p>
		
	</body>
</html>