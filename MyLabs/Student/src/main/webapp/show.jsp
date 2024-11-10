<%@page import="com.mahesh.StudentModel"%>
<%@page import="com.mahesh.StudentController"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Hello my friend</h2>
<%
StudentModel sm= (StudentModel)request.getAttribute("student1");
out.println(sm);



%>
</body>
</html>