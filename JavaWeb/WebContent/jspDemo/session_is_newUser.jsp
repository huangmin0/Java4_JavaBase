<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>判断是否为新用户</title>
</head>
<body>
<%
if(session.isNew()){
%>
<h3>欢迎新用户</h3>
	<%
}else{
	%>
	<h3>您是老用户</h3>
	<%
}
	%>
</body>
</html>