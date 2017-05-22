<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Servlet Context Listener</h1>
<%
this.getServletContext().setAttribute("username","wangwu");
application.setAttribute("password","123456");

this.getServletContext().setAttribute("username","zhaosi");
application.setAttribute("password","654321");

this.getServletContext().removeAttribute("username");
application.removeAttribute("password");
%>
</body>
</html>