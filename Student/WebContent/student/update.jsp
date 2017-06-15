<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<center>
		<h2>更新用户信息</h2>
		<%-- <font color="pink">${requestScope.Error }</font><br /> <font
			color="red">${requestScope.error }</font> --%>
		<form action="<%=request.getContextPath()%>/UpdageUserStu"
			method="get">
			<table>
				<tr>
					<td>需要更新的学号：</td>
					<td><input type="text" name="id" value="${student.id }"
						readonly="readonly"/></td>
				</tr>
				<tr>
					<td>更新后的姓名：</td>
					<td><input type="text" name="name" value="${student.name }"/></td>
				</tr>
				<tr>
					<td>更新后的年龄：</td>
					<td><input type="text" name="age" value="${student.age }"/></td>
				</tr>
				<tr>
					<td>更新后的电话：</td>
					<td><input type="text" name="phone" value="${student.phone }"/></td>
				</tr>
			</table>
			<input type="submit"> <input type="reset">
		</form>
	</center>
</body>
</html>