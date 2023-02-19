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

		<form action="./update" method="post" class="row g-3 needs-validation" novalidate>

	     <input type="hidden" class="form-control" id="validationCustom01" name="memberId" value="${memberDTO.memberId}">

			  
		  <div class="col-md-4">
		    <label for="validationCustom01" class="form-label">이름</label>
		    <input type="text" class="form-control" id="validationCustom01" name="memberName" value="${memberDTO.memberName}">
		    <div class="valid-feedback">
		      Looks good!
		    </div>
		  </div>
		  <div class="col-md-4">
		    <label for="validationCustom01" class="form-label">핸드폰</label>
		    <input type="text" class="form-control" id="validationCustom01" name="memberPhone">
		    <div class="valid-feedback">
		      Looks good!
		    </div>
		  </div>
		  <div class="col-md-4">
		    <label for="validationCustom01" class="form-label">이메일</label>
		    <input type="text" class="form-control" id="validationCustom01" name="memberEmail">
		    <div class="valid-feedback">
		      Looks good!
		    </div>
		  </div>
		  <div class="col-md-4">
		    <label for="validationCustom01" class="form-label">주소</label>
		    <input type="text" class="form-control" id="validationCustom01" name="memberAddress">
		    <div class="valid-feedback">
		      Looks good!
		    </div>
		  </div>

		    <div class="col-12">
		    <button class="btn btn-primary" type="submit">Submit form</button>
		  </div>
		</form>

	<c:import url="../template/bootStrap_body.jsp"></c:import>
</body>
</html>