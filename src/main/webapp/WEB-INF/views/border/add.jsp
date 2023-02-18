<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/bootStrap_header.jsp"></c:import>
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>
	<form action="./add" method="post" enctype="multipart/form-data">
		<input type="text" name="borderTitle" placeholder="제목을 입력 해 주세요">
		<input type="text" name="borderDetail" placeholder="내용을 입력 해 주세요">
		<input type="file" name = "multipartFile"> 
		<input type="submit" value="제출하기">
	</form>


	<c:import url="../template/bootStrap_body.jsp"></c:import>
</body>
</html>