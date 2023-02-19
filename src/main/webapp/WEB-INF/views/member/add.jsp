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
	
	
	<form class="row g-3 needs-validation" novalidate action="./add" method="post">
	  <div class="col-md-4">
	    <label for="validationCustom01" class="form-label">아이디</label>
	    <input type="text" class="form-control" id="validationCustom01" name="memberId" required>
	    <div class="valid-feedback">
	      Looks good!
	    </div>
	  </div>
	  <div class="col-md-4">
	    <label for="validationCustom02" class="form-label">비밀번호</label>
	    <input type="password" class="form-control" id="validationCustom02" name="memberPw" required>
	    <div class="valid-feedback">
	      Looks good!
	    </div>
	  </div>
	  
	  <div class="col-md-4">
	    <label for="validationCustom02" class="form-label">성함</label>
	    <input type="text" class="form-control" id="validationCustom02" name="memberName" required>
	    <div class="valid-feedback">
	      Looks good!
	    </div>
	  </div>
	  <div class="col-md-4">
	    <label for="validationCustom02" class="form-label">핸드폰 번호</label>
	    <input type="text" class="form-control" id="validationCustom02" name="memberPhone" required>
	    <div class="valid-feedback">
	      Looks good!
	    </div>
	  </div>
	  
	  <div class="col-md-4">
	    <label for="validationCustom02" class="form-label">이메일</label>
	    <input type="text" class="form-control" id="validationCustom02" name="memberEmail" required>
	    <div class="valid-feedback">
	      Looks good!
	    </div>
	  </div>
	  <div class="col-md-4">
	    <label for="validationCustom02" class="form-label">주소</label>
	    <input type="text" class="form-control" id="validationCustom02" name="memberAddress" required>
	    <div class="valid-feedback">
	      Looks good!
	    </div>
	  </div>
	  
	  <div class="col-12">
	    <div class="form-check">
	      <input class="form-check-input" type="checkbox" value="" id="invalidCheck" required>
	      <label class="form-check-label" for="invalidCheck">
	        Agree to terms and conditions
	      </label>
	      <div class="invalid-feedback">
	        You must agree before submitting.
	      </div>
	    </div>
	  </div>
	  <div class="col-12">
	    <button class="btn btn-primary" type="submit">Submit form</button>
	  </div>
	</form>
	
	
	
	<c:import url="../template/bootStrap_body.jsp"></c:import>
</body>
</html>