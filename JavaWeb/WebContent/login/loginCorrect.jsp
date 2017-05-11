<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录成功</title>
</head>
<body>
	<%
		String userid = (String) session.getAttribute("userid");
	%>
	<%
		if (null != userid)
		{
	%>
	<h2>
		<%=userid%>
		您好，欢迎登陆此页面!
	</h2>
	<hr />
	<a href="loginError.jsp">注销</a>
	<%
		} else
		{
	%>
	<h2>
		请先进入登录系统<a href="login.jsp">登录</a>
	</h2>
	<%
		}
	%>
</body>
</html>