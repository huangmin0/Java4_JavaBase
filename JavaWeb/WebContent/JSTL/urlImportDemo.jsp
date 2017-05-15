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

<%-- <c:import url="CorePrefixText.jsp"/> --%> <!-- 这样可以引入页面的内容，加上var和scope反而不行 -->
<%-- <c:import var="HelloWorld" url="HelloWorld.jsp" scope="page"></c:import> --%>
<%-- ${HelloWorld } --%><!-- 有var属性时需要单独用EL表达式输出 -->
<%-- <c:import url="http://www.baidu.com" var="baidu" scope="page" charEncoding="UTF-8"></c:import>
${baidu } --%>
<c:redirect url="${HelloWorld }"></c:redirect><!-- 不能转向此处的url的内容不是url而是网页的内容 -->
</body>
</html> 