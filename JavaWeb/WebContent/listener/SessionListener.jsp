<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Session Listener Demo</h1>
<%
session.setAttribute("name","zhangsan");
session.setAttribute("name","lisi");
session.removeAttribute("name");

%>
<a href="<%=request.getContextPath() %>/servlet/SessionServlet">手动销毁session</a>
</body>
</html>