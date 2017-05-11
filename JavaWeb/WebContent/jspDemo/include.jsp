<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! int x=100;%>
<p><%=x %></p>
<%-- <%@include file="include1.jsp" %> --%><!-- 静态包含 -->
<jsp:include page="include1.jsp"></jsp:include><!-- 动态包含 -->
</body>
</html>