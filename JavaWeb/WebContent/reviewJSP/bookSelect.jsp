<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="bookReceive.jsp" method="post" >
<span>书名:</span>
<select name="bookName">
<option value="java">Java</option>
<option value="javascript" selected="selected">JavaScript</option>
<option value="jQuery">jQuery</option>
<option value="CSS">CSS</option>
</select>
<br>
<span>数量</span>
<select name="bookNum">
<option value="11">11</option>
<option value="12" selected="selected">12</option>
<option value="13">13</option>
<option value="14">14</option>
</select>
<br/>
<input name="submit" type="submit" value="提交">
<input name="reset" type="reset" value="重置">
</form>

</body>
</html>