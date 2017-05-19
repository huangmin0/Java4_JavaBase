package com.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyLoginServletDemo
 */
@WebServlet("/servlet/MyLoginServlet2")
public class MyLoginServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyLoginServletDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");//设置生成文档类型,解决乱码问题
		//response.setCharacterEncoding("UTF-8");//也可以解决乱码问题
		PrintWriter out=response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>用servlet测试get/post方法</TITLE></HEAD");
		out.println("<BODY>");
		out.println("<h2>调用了doGet()方法</h2>");
		out.println("<h2>用户输入信息如下：</h2>");
		
		String username=request.getParameter("username");
		//String username=new String(usename.getBytes("iso8859_1"), "UTF-8");//在doGet()里面设置此方法会出现输入参数中文乱码，但是将iso8859_1换成UTF-8就不会出现乱码
		if(username==null||username=="")
			username="未输入";
		String userpwd=request.getParameter("password");
		if(userpwd==null||userpwd=="")
			userpwd="未输入";
		out.println("<h2>用户名:"+username+"</h2>");
		out.println("<h2>密    码:"+userpwd+"</h2>");
		out.println("<HTML>");
		out.println("</BODY>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");//设置生成文档类型,解决乱码问题
		//response.setContentType("UTF-8");//也可以解决乱码问题
		PrintWriter out=response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>用servlet测试get/post方法</TITLE></HEAD");
		out.println("<BODY>");
		out.println("<h2>调用了doPost()方法</h2>");
		out.println("<h2>用户输入信息如下：</h2>");
		//request.setCharacterEncoding("UTF-8");//解决请求中午乱码问题。要写在请求参数之前。此为方式一
		String usename=request.getParameter("username");
		String username=new String(usename.getBytes("iso8859_1"), "UTF-8");//new一个新的字符串，此为方式二。
		if(username==null||username=="")
			username="未输入";
		String userpwd=request.getParameter("password");
		if(userpwd==null||userpwd=="")
			userpwd="未输入";
		out.println("<h2>用户名:"+username+"</h2>");
		out.println("<h2>密    码:"+userpwd+"</h2>");
		out.println("<HTML>");
		out.println("</BODY>");
		out.close();
	}

}
