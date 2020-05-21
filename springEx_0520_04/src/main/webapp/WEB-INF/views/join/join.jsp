<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h2>학생성적입력</h2>
		<form action="joinOk" method="get">
			<lable>학생번호</lable>
			<input type="text" name="stu_num" /> <br/>
			<lable>학생이름</lable>
			<input type="text" name="stu_name" /> <br/>
			<lable>국어점수</lable>
			<input type="text" name="kor" /> <br/>
			<lable>영어점수</lable>
			<input type="text" name="eng" /> <br/>
			<lable>수학점수</lable>
			<input type="text" name="math" /> <br/>
			<lable>합계</lable>
			<input type="text" name="total" /> <br/>
			<lable>평균</lable>
			<input type="text" name="avg" /> <br/>
			
			<input type="submit" value="입력" />
			<input type="reset" value="취소" />
			
			
		
		</form>
	
	</body>
</html>