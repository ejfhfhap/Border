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

	<table>
		<thead>
			<tr>
				<th>게시판 번호</th>
				<th>작성자 아이디</th>
				<th>게시판 제목</th>
				<th>게시판 내용</th>
				<th>작성 날짜</th>
				<th>조회수</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${borderDTOs}" var="dto">
				<tr>
					<td>${dto.borderId}</td>
					<td>${dto.memberId}</td>
					<td>${dto.borderTitle }</td>
					<td>${dto.borderDetail }</td>
					<td>${dto.borderDate }</td>
					<td>${dto.borderCount }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
		<form class="row g-3" action="./list" method="get">
			
		  <select class="form-select" aria-label="Default select example" name="searchKind">
			  <option value="member">작성자</option>
			  <option value="title">제목</option>
		   	  <option value="detail">내용</option>
		   	  <option value="title+detail">제목+내용</option>
		  </select>
		  
		  <div class="col-auto">
		    <label for="inputPassword2" class="visually-hidden">검색하기</label>
		    <input type="text" class="form-control" id="inputPassword2" name="searchDetail" placeholder="검색 할 내용입력">
		  </div>
		  
		  <div class="col-auto">
		    <button type="submit" class="btn btn-primary mb-3">검색</button>
		  </div>
		</form>
		
		
		<nav aria-label="Page navigation example">
		  <ul class="pagination">
		    <li class="page-item"><a class="page-link ${pager.pre ? '' : 'disabled' }" href="#">Previous</a></li>
			   	<c:forEach begin="${pager.minBlock}" end="${pager.maxBlock}" var="i">
					<li class="page-item"><a class="page-link" href="./list?page=${i}&searchKind=${pager.searchKind}&searchDetail=${pager.searchDetail}">${i} </a></li>
				</c:forEach>
		    <li class="page-item"><a class="page-link ${pager.next ? '' : 'disabled' }" href="#">Next</a></li>
  		  </ul>
		</nav>
		
		

		
		<c:import url="../template/bootStrap_body.jsp"></c:import>
</body>
</html>