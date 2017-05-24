<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>在线用户列表</h2>
	<%
		response.setHeader("refresh", "2");
		//从application中取出所有用户的保存列表
		Set all = (Set) this.getServletContext().getAttribute("online");
		String now = new Date().toLocaleString();
	%>
	<p>
		当前时间为：<%=now %></p>
	<p>
		当前在线的用户数为:<%=all.size() %></p>
	<p>在线的用户为：</p>
	<%
		Iterator iter = all.iterator();//实例化Iterator输出
		while (iter.hasNext())
		{//迭代输出
	%>
			<%=iter.next()%>
	<%
		}
	%>
</body>
</html>