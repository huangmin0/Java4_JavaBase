<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="image.jsp" flush="true"></jsp:include>
<jsp:include page="introduce.jsp" flush="true">
<jsp:param value="zhangsan" name="name"/>
<jsp:param value="one piece" name="hobby"/>
</jsp:include>
</body>
</html>