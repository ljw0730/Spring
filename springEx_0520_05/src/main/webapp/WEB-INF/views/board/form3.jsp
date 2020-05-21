<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
		<title>Insert title here</title>
		</head>
	<body>
		<form action="formOk3" method="post">
			<label>번호</label>
			<input type="text" name="b_num" /> <br/>
			<label>제목</label>
			<input type="text" name="b_title" /> <br/>
			<label>내용</label>
			<input type="text" name="b_content" /> <br/>
			<label>날짜</label>
			<input type="text" name="b_date" /> <br/>
			<label>그룹</label>
			<input type="text" name="b_group" /> <br/>
			<label>step</label>
			<input type="text" name="b_step" /> <br/>
			<label>indent</label>
			<input type="text" name="b_indent" /> <br/>
			
			<input type="submit" value="전송" />
			<input type="reset" value="취소" />
			
			
		
		</form>
	
	
	</body>
</html>