<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
	<c:import url="./template/bootStrap_header.jsp"></c:import>
</head>
<body>
<c:import url="./template/header.jsp"></c:import>
<P>  The time on the server is ${serverTime}. </P>

<c:import url="./template/bootStrap_body.jsp"></c:import>
</body>
</html>
