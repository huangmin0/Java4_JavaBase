<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注销成功</title>
</head>
<body>
<%
response.setHeader("refresh", "5;url=login.jsp");
session.invalidate();//让回话失效 
%>
<h3>您已经退出本系统，5秒后将跳转登录页面</h3>
<h4>如果系统没有跳转请单击<a href="login.jsp">这里</a></h4>
</body>
</html>