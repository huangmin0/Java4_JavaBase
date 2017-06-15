<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.hm.bean.Student"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
table {
	text-align: center;
}

h2 {
	text-align: center;
}

.one {
	margin-left: 700px;
}

tr td {
	border: 1px solid #000;
	text-align: center
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		ArrayList<Student> list = new ArrayList<Student>();
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root2");
		String sql = "select * from stu;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Student student = new Student();
			student.setId(rs.getInt("id"));
			student.setName(rs.getString("name"));
			student.setAge(rs.getInt("age"));
			student.setPhone(rs.getInt("phone"));
			list.add(student);
			pageContext.setAttribute("list", list);
		}
	%>
	<center>
		<a href="student.jsp" class="one">添加学生用户</a>
		<form action="<%=request.getContextPath()%>/DeleteManyStu"
			method="get">
			<input style="margin-left: 700px;" type="submit"
				value="删除多项"/>
			<table align="center" style="border-collapse: collapse"
				align="center">
				<tr>
					<td colspan="6"><h2>用戶列表</h2></td>
				</tr>
				<tr>
					<td>批量操作</td>
					<td width="100px;">ID</td>
					<td width="150px;">姓名</td>
					<td width="100px;">年龄</td>
					<td width="200px;">手机号</td>
					<td width="100px;">批量删除</td>
				</tr>

				<c:forEach var="student" items="${list}">

					<tr>
						<td><input type="checkbox" name="gou" value="${student.id}"></td>

						<td>${student.id}</td>
						<td>${student.name}</td>
						<td>${student.age}</td>
						<td>${student.phone}</td>
						<td><a
							href="<%=request.getContextPath() %>/DeleteStu?id=${student.id}">删除</a>
							<a
							href="<%=request.getContextPath() %>/UpdateStu?id=${student.id}">更新</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</form>
	</center>
</body>
</html>