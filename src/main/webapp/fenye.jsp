<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>分页</h1>
<c:forEach items="${stus}" var="stu">
<p>${stu.sid} --  ${stu.sname }</p>

</c:forEach>
</body>
</html>