<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<c:import url="../template/bootStrap_header.jsp"></c:import>
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>

	<!-- 	private String memberId;
	private String memberPw;
	private String memberName;
	private String memberPhone;
	private String memberEmail;
	private String memberAddress;
	private String memberDate; -->
	
	<h2>아이디: ${memberDTO.memberId }</h2>
	<h2>이름: ${memberDTO.memberName }</h2>
	<h2>핸드폰: ${memberDTO.memberPhone }</h2>
	<h2>이메일: ${memberDTO.memberEmail }</h2>
	<h2>주소: ${memberDTO.memberAddress }</h2>
	<h2>날짜: ${memberDTO.memberDate }</h2>

	<a href = "./update?memberId=${memberDTO.memberId}">수정하기</a>

	<c:import url="../template/bootStrap_body.jsp"></c:import>
</body>
</html>