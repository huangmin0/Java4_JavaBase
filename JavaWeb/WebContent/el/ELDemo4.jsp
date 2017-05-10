<%@page import="java.util.HashSet"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
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
List<String> list=new ArrayList<String>();
list.add("abc");
list.add("def");
list.add("ghi");
list.add("jkl");
pageContext.setAttribute("list", list);

Map<String,String> map=new HashMap<String,String>();
map.put("11", "AA11");
map.put("12", "AA12");
map.put("13", "AA13");
map.put("14", "AA14");
pageContext.setAttribute("map", map);

Set<String> set=new HashSet<String>();
set.add("11");
set.add("12");
set.add("13");
set.add("14");
pageContext.setAttribute("set", set);

String[] array={"A001","A002","A003","A004"};
pageContext.setAttribute("array", array);
%>
<p>${'${'}list}:</p>${list }
<p>${'${'}list[0]}:</p>${list[0] }
<p>${'${'}list[3]}:</p>${list[3] }
<p>${'${'}list['1']}:</p>${list['1'] }
<p>${'${'}list[.get(0)}:</p>${list.get(0) }
<hr/>
<p>${'${'}map}:</p>${map }
<p>${'${'}map["11"]}:</p>${map["11"]}
<p>${'${'}map['13']}:</p>${map['13']}
<p>${'${'}map.get("11")}:</p>${map.get("11")}
<hr/>
<p>${'${'}set}:</p>${set }
<%-- <p>${'${'}set[0]}:</p>${set[0]} --%>
<%-- <p>${'${'}set[11]}:</p>${set[11]} --%>
<!-- set目前无法直接获取元素 -->
<hr/>
<p>${'${'}array}:</p>${array }
<p>${'${'}array[0]}:</p>${array[0] }
<%-- <p>${'${'}array.get(0)}:</p>${array.get(0) } --%><!-- 不可以用这种方式获取数组元素 -->



</body>
</html>