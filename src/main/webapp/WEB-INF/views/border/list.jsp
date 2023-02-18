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
				  <option value="member">작성자</option>
				  <option value="title">제목</option>
			   	  <option value="detail">내용</option>
			   	  <option value="title+detail">제목+내용</option>
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
			   		<a href="./add" class="btn btn-primary mb-3">글쓰기</a>
			   </div>
		  </div>
	</form>


	<table class="table bg-body-secondary">
		<thead>
			<tr>
				<th scope="col">게시판 번호</th>
				<th scope="col">제목</th>
				<th scope="col">작성자 아이디</th>
				<th scope="col">작성 날짜</th>
				<th scope="col">조회수</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${borderDTOs}" var="dto">
				<tr>
					<td scope="row">${dto.borderId}</td>
					<td><a href = "./detail?borderId=${dto.borderId}">${dto.borderTitle }</a></td>
					<td>${dto.memberId}</td>
					<td>${dto.borderDate }</td>
					<td>${dto.borderCount }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
		
	
	<div class ="container-fluid">	
		<div>
			<form action="./list" method="get">
				<input type="hidden" name=page value="${pager.page}">
				<input type="hidden" name=searchKind value="${pager.searchKind}">
				<input type="hidden" name=searchDetail value="${pager.searchDetail}">
				
				<div class = "row">
					<select name="perPage" class="form-select col-3" aria-label="Default select example" style="width: 150px">
					  <option value="5">5개씩 보기</option>
					  <option value="7" ${pager.perPage eq 7 ? 'selected':'' }>7개씩 보기</option>
					  <option value="10" ${pager.perPage eq 10 ? 'selected':'' }>10개씩 보기</option>
					</select>
  					<input class = "col-auto" type="submit" value="선택">
				</div>
			</form>
		</div>
		<div class="mx-auto" style="width: 200px;">
			<nav class = "col px-auto" aria-label="Page navigation example">
			  <ul class="pagination">
			    <li class="page-item"><a class="page-link ${pager.pre ? '' : 'disabled' }" href="./list?page=${pager.minBlock - 1}&searchKind=${pager.searchKind}&searchDetail=${pager.searchDetail}&perPage=${pager.perPage}">Previous</a></li>
				   	<c:forEach begin="${pager.minBlock}" end="${pager.maxBlock}" var="i">
						<li class="page-item"><a class="page-link" href="./list?page=${i}&searchKind=${pager.searchKind}&searchDetail=${pager.searchDetail}&perPage=${pager.perPage}">${i} </a></li>
					</c:forEach>
			    <li class="page-item"><a class="page-link ${pager.next ? '' : 'disabled' }" href="./list?page=${pager.maxBlock + 1}&searchKind=${pager.searchKind}&searchDetail=${pager.searchDetail}&perPage=${pager.perPage}">Next</a></li>
	  		  </ul>
			</nav>
		</div>
	</div>


		
		<c:import url="../template/bootStrap_body.jsp"></c:import>
</body>
</html>