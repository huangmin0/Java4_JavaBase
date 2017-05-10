<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
request.queryString:${pageContext.request.queryString }<br/>
request.requestURI:${pageContext.request.requestURI }<br/>
request.contextPath:${pageContext.request.contextPath }<br/>
request.localAddr:${pageContext.request.localAddr }<br/>
request.localName:${pageContext.request.localName}<br/>
request.localPort:${pageContext.request.localPort}<br/>
request.pathInfo:${pageContext.request.pathInfo}<br/>
request.method:${pageContext.request.method}<br/>
request.protocal:${pageContext.request.protocol}<br/>
request.remoteAddr:${pageContext.request.remoteAddr}<br/>
request.remoteHost:${pageContext.request.remoteHost}<br/>
request.remoteUser:${pageContext.request.remoteUser}<br/>
<span>request.remotePort</span>${pageContext.request.remotePort }<br/>
<hr/>

</body>
</html>