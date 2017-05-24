<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录程序</title>
</head>
<body>
<h2>用户登录程序</h2>
<form action="login.jsp" method="post">
用户ID:<input type="text" name="userid">
<input type="submit" value="登录">
</form>
<%
String userid=request.getParameter("userid");//接收用户名
if(!(userid==null || "".equals(userid))){//登录名不能为空 
	session.setAttribute("userid", userid);//设置一个session属性 
	response.sendRedirect("./list.jsp");//跳转到list.jsp
}
%>
</body>
</html>
