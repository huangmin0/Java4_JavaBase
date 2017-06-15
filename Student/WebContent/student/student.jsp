<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/StudentStu" method="get">
<label>学号</label><input name="id" type="text"><br/>
<label>姓名</label><input name="username" type="text"><br/>
<label>年龄</label> <input name="age" type="text"><br/>
<label>电话</label> <input name="phone" type="text"><br/>
<p>
<input name="submit" type="submit" value="增加信息" >
</form>

</body>
</html>