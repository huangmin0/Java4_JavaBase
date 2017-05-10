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
application.setAttribute("name", "zhangsan");
application.setAttribute("age", "25");
%>
<%
String userName=(String)application.getAttribute("name");
String userAge=(String)application.getAttribute("age");
%>
<p>用户名:</p><%=userName %>
<p>年龄:</p><%=userAge %>
<hr/>
<!-- <a href="application2.jsp">跳转</a> -->
<jsp:forward page="application2.jsp"></jsp:forward>
</body>
</html>