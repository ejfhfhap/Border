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
	<section class="container-fluid">
		<c:if test="${not empty borderDTO.borderImgDTO.imgName}">
			<div class="row"><img src="/resources/upload/border/${borderDTO.borderImgDTO.imgName}"></div>
		</c:if>
		<div class = "row"><h2>제목: ${borderDTO.borderTitle}</h2></div>
		<div class="row"><h2>내용: ${borderDTO.borderDetail}</h2></div>
	</section>
	<a href = "./delete?borderId=${borderDTO.borderId}">삭제하기</a>
	<a href = "./update?borderId=${borderDTO.borderId}">수정하기</a>
	<c:import url="../template/bootStrap_body.jsp"></c:import>
</body>
</html>