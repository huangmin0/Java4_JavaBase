<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录界面</title>
</head>
<body>
	<form name="forml" method="post" action="login.jsp">
		<span>用户名:</span> <input name="userName" type="text" size="12">
		<br /> <span>密&nbsp;&nbsp;&nbsp;码:</span> <input name="passWord" type="password"
			size="12"> <br /> <input type="submit" name="Submit"
			value="提交"> <input type="reset" name="Submit" value="重置">
		<%
			String userName = request.getParameter("userName");
			String passWord = request.getParameter("passWord");
			if (null != userName && null != passWord && "zhangsan".equals(userName) && "123456".equals(passWord))
			{
				response.setHeader("refresh", "3;url=loginCorrect.jsp ");
				session.setAttribute("userid", userName);
		%>
		<h1>登录成功，3秒后跳转到登录成功页面</h1>
		<h3>
			如果没有跳转成功请点击<a href="loginCorrect.jsp">这里</a>请手动跳转
		</h3>

		<%
			} else
			{
		%>
		<h1>登录失败请重新登录</h1>
		<%
			}
		%>
	</form>
</body>
</html>