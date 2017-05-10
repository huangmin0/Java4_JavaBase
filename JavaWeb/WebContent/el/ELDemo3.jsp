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
Cookie cookie1=new Cookie("country","china");
cookie1.setMaxAge(120);
response.addCookie(cookie1);
%>
<hr/>
${cookie.country.name }<br/>
${cookie.country.value }<br/>
${cookie['country'].name }<br/>
${cookie['country'].value}<br/>
<hr/>
<span>浏览器信息:</span>${header['User-Agent'] }<br/>
<span>connection信息:</span>${header['Connection'] }<br/>
<span>Host信息：</span>${header['Host'] }<br/>
<span>${'${'}pageContext.session.id }</span>${pageContext.session.id }<br/>
<%-- <span>${'${'}pageContext.session.id }</span>${pageContext.session.new} --%><!-- 在6.0版本可以用，在8.0版本不可以用 -->
<%-- <span>${'${'}pageContext.session.id }</span>${pageContext.session.isNew()} --%><!-- 在8.0版本可以用 -->
<span>${'${'}param.count }</span>${param.count }<br/>
<span>${'${'}param.count+20}</span>${param.count+20 }<br/>
<span>${'${'}cookie.country}</span>${cookie['country'] }<hr/>
${initParam.rri }<br/>
<%=(String)application.getInitParameter("rri")%><br/>
config:<%=config.getInitParameter("rri") %><br/>
</body>
</html>