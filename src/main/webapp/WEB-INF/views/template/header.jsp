<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand" href="/">Home</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="/border/list">Border List</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/member/list">Member List</a>
        </li>
        <li class="nav-item">
        	<c:if test="${empty login }">
 		    		<a class="nav-link" href = "/member/login">Login</a>
        	</c:if>
        	<c:if test="${not empty login}">
 		    		<a class="nav-link" href = "/member/logout">Logout</a>
        	</c:if>
   		</li>
      </ul>
    </div>
    
  </div>
</nav>