<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.javaweb.listener.*"%>
<%@page import="com.javaweb.bean.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Session Bind Demo</title>
</head>
<body>
	<h1>在session中删除对象</h1>
	<%//javabean不能触发监听器 

session.removeAttribute("sbl");
%>
</body>
</html>