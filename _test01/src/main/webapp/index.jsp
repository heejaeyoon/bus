<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html"	cocharset="UTF-8">
<title>우리의 첫 번째 페이지</title>
</head>
<body>
	Hello World!<br/>
	<form action = "./userJoinAction.jsp" method="post">
		<input type="text" name="userID">
		<input type="password" name="userPW">
		<input type="submit" value="회원가입">
		
	</form>

</body>
</html>