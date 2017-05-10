<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%
pageContext.setAttribute("color", "pink");
%>
</head>
<body bgcolor=${pageScope.color }>
<h1>测试</h1>
<%
pageContext.setAttribute("name", "lisi");
request.setAttribute("name", "zhangsan");
session.setAttribute("name", "wangwu");
application.setAttribute("name", "zhaoer");
%>
<%-- <h3>${name }</h3> --%>
<h3>page属性内容:${pageScope.name}</h3>
<h3>request属性内容:${requestScope.name}</h3>
<h3>session属性内容:${sessionScope.name}</h3>
<h3>application属性内容:${applicationScope.name}</h3>
</body>
</html>