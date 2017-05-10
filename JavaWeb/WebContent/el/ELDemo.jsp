<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
<td>或</td>
<td>${'${'}true or true }</td>
<td>${true or true}</td>
</tr>
<tr>
<td>或</td>
<td>${'${'}true || false }</td>
<td>${true || false}</td>
</tr>
<tr>
<td>非</td>
<td>${'${'}not true }</td>
<td>${not true}</td>
</tr>
<tr>
<td>非</td>
<td>${'${'}!false}</td>
<td>${false}</td>
</tr>

</table>
</body>
</html>