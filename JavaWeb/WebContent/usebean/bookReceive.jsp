<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.javaweb.bean.*" %>
<jsp:useBean id="book" class="com.javaweb.bean.BookBean" scope="page">
<%-- <jsp:setProperty name="book" property="*"/> --%>
<%-- <jsp:setProperty name="book" property="bookName"/>
<jsp:setProperty name="book" property="bookNum"/> --%>
<%-- <jsp:setProperty name="book" property="bookName" value="AAAA"/>
<jsp:setProperty name="book" property="bookNum" value="1111"/> --%>
<jsp:setProperty name="book" property="bookName" param="bookName"/>
<jsp:setProperty name="book" property="bookNum" param="bookNum"/>
</jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<P>订购图书清单</P>
<hr/>
<span>书名：</span><jsp:getProperty property="bookName" name="book"/>
<br/>
<span>数量：</span><jsp:getProperty property="bookNum" name="book"/>
</body>
</html>