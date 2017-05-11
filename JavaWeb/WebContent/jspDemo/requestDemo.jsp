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
String changeSessionId=request.changeSessionId();
/* AsyncContext getAsyncContext=request.getAsyncContext(); */
String AuthType=request.getAuthType();
String CharacterEncoding=request.getCharacterEncoding();
int contentlength = request.getContentLength();
String contentType=request.getContentType();
String contextPath=request.getContextPath();
String QueryString=request.getQueryString();
%>
<span>changeSessionId:</span><%=changeSessionId %>
<br/>
<%-- <span>getAsyncContext:</span><%=getAsyncContext %> --%>
<br/>
<span>AuthType:</span><%=AuthType %>
<br/>
<span>CharacterEncoding:</span><%=CharacterEncoding %>
<br/>
<span>contentlength:</span><%=contentlength %>
<br/>
<span>contentType:</span><%=contentType %>
<br/>
<span>contextPath:</span><%=contextPath %>
<br/>
<span>QueryString:</span><%=QueryString %>
</body>
</html>