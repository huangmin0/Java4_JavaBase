<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>这是第四个页面</h1>
<p>获取传递的参数</p>
<span>姓名：</span><%=request.getParameter("name") %>
<br/>
<span>年龄：</span><%=request.getParameter("age") %>
</body>
</html>