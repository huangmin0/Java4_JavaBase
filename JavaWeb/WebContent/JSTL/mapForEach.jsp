<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Map map =new HashMap();
map.put("mldn", "www.MLDNjava.cn");
map.put("ixh", "Lixinghua");
pageContext.setAttribute("map", map);
%>
<c:forEach items="${map}" var="name">
<h3>${name.key}-->${name.value}</h3>
</c:forEach>
</body>
</html>