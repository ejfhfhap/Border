<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<c:import url="../template/bootStrap_header.jsp"></c:import>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>

	<form action="./update" method="post" enctype="multipart/form-data">
		<input type="hidden" name="borderId" value="${borderDTO.borderId}">
		<input type="text" placeholder="수정 할 제목을 입력 해주세요" name="borderTitle">
		<input type="text" placeholder="수정 할 내용을 입력 해주세요" name="borderDetail">
		<input type="file" name = "multipartFile">
		
		<input type="submit" value="제출하기">
	</form>

	<c:import url="../template/bootStrap_body.jsp"></c:import>
</body>
</html>