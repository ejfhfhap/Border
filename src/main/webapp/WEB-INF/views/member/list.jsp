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
		<form class="row g-3 mt-3" action="./list" method="get">
		<div class="row">
		  	  <div class="col-auto">
				  <select class="col-2 form-select" aria-label="Default select example" name="searchKind">
					  	<option value="id">아이디</option>
				  		<option value="name">이름</option>
				  </select>
			  </div>
			  
			  <div class="col-5">
			    <label for="inputPassword2" class="visually-hidden">검색하기</label>
			    <input type="text" class="form-control" id="inputPassword2" name="searchDetail" placeholder="검색 할 내용입력">
			  </div>
			  
			  <div class="col-auto">
			    <button type="submit" class="btn btn-primary mb-3">검색</button>
			   </div>
			   
			   <div class="col-auto">
			   		<a href="./add" class="btn btn-primary mb-3">멤버 추가</a>
			   </div>
	    </div>
	</form>
	
	<table>
		<c:forEach items="${memberDTOs}" var="dto">
			<tr>
				<td>아이디</td>
				<td><a href = "./detail?memberId=${dto.memberId}">${dto.memberId}</a></td>
				<td><a href = "./delete?memberId=${dto.memberId}">삭제</a></td>
			</tr>
		</c:forEach>
	</table>
	
	<div class="mx-auto" style="width: 200px;">
		<nav class = "col px-auto" aria-label="Page navigation example">
		  <ul class="pagination">
		    <li class="page-item"><a class="page-link ${pager.pre ? '' : 'disabled' }" href="./list?page=${pager.minBlock - 1}&searchKind=${pager.searchKind}&searchDetail=${pager.searchDetail}">Previous</a></li>
			   	<c:forEach begin="${pager.minBlock}" end="${pager.maxBlock}" var="i">
					<li class="page-item"><a class="page-link" href = "./list?page=${i}&searchKind=${pager.searchKind}&searchDetail=${pager.searchDetail}">${i}</a></li>
				</c:forEach>
		    <li class="page-item"><a class="page-link ${pager.next ? '' : 'disabled' }" href="./list?page=${pager.maxBlock + 1}&searchKind=${pager.searchKind}&searchDetail=${pager.searchDetail}">Next</a></li>
  		  </ul>
		</nav>
	</div>


	
	<c:import url="../template/bootStrap_body.jsp"></c:import>
</body>
</html>