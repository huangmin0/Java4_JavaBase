<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String userName=(String)application.getAttribute("name");
String userAge=(String)application.getAttribute("age");
%>
<p>用户名:</p><%=userName %>
<p>年龄:</p><%=userAge %>
<P>****************</P>
</body>
</html>