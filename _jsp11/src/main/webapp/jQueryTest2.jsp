<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="aa"></div>
<h1></h1>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script>
$(function(){
	
	var car = new Object();
	car.make = '삼성';
	var owner = new Object();
	car.owner = owner;
	car.owner.name = '홍길동';
	console.log(car);
});
</script>
</body>
</html>




