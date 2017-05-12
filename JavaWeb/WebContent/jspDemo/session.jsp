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
session.setAttribute("name", "zhangsan");
session.setAttribute("age", "25");
%>
<%
String userName=(String)session.getAttribute("name");
String userAge=(String)session.getAttribute("age");
%>
<p>用户名:</p><%=userName %>
<p>年龄:</p><%=userAge %>
<hr/>
<%-- <a href="session2.jsp">跳转</a>
<jsp:forward page="session2.jsp"></jsp:forward> --%>
 
 
 
</body>
</html>