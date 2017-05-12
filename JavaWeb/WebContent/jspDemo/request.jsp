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
request.setAttribute("name", "zhangsan");
request.setAttribute("age", "25");
%>
<%
String userName=(String)request.getAttribute("name");
String userAge=(String)request.getAttribute("age");
%>
<p>用户名:</p><%=userName %>
<p>年龄:</p><%=userAge %>
<hr/>
<!-- <a href="request2.jsp">跳转</a> -->
<jsp:forward page="request2.jsp"></jsp:forward>
<%-- ${pageContext.forward("request2.jsp") } --%>
<%-- ${response.setHeader("refresh","1;request2.jsp") } --%>
</body>
</html>