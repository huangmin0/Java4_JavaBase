<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--设定Page范围属性 --%>
<%
pageContext.setAttribute("name", "zhangsan");
pageContext.setAttribute("birthday", "1980-10-21");
pageContext.setAttribute("location", "hefei",PageContext.APPLICATION_SCOPE);
%>
<%-- 获取Page范围属性 --%>
<%
String userName=(String)pageContext.getAttribute("name");
String userBirth=(String)pageContext.getAttribute("birthday");
String userLocal=(String)application.getAttribute("location");
%>
<p>用户名：</p><%=userName %>
<p>生&nbsp;&nbsp;日：</p><%=userBirth %>
<p>地&nbsp;&nbsp;址：</p><%=userLocal %>
<a href="pageContext2.jsp">跳转</a>
<jsp:forward page="pageContext2.jsp"></jsp:forward>
</body>
</html>