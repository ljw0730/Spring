<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>@Valid</title>
	</head>
	<body>
		<form action="boardOk">
			<label>게시판 번호</label>
			<input type="text" name="b_num" /> <br/>
			<label>제목</label>
			<input type="text" name="b_title" /> <br/>
			<label>내용</label>
			<input type="text" name="b_content" /> <br/>
			<label>등록일</label>
			<input type="text" name="b_date" /> <br/>
			
			<input type="submit" value="등록" />
			<input type="reset" value="취소" />
		
		</form>
		
		
		
	</body>
</html>