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
response.setHeader("refresh", "1"); 
%>
<%
long start=session.getCreationTime();
long end=session.getLastAccessedTime();
long time=(end-start)/1000;
%>
<h3>您已经停留了<%=time %>秒</h3>
</body>
</html>