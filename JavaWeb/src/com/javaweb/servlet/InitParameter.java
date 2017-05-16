package com.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InitParameter
 */
@WebServlet(urlPatterns = {"/servlet/InitParameter","/servlet/abc"},loadOnStartup = 1,initParams =
{ @WebInitParam(name = "institute", value = "职业培训学校"), @WebInitParam(name = "major", value = "Java技术"),
		@WebInitParam(name = "count", value = "500") })
public class InitParameter extends HttpServlet
{
	private String myInstitute = null;
	private String myMajor = null;
	private int count = 0;

	public InitParameter()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException
	{
		System.out.println("InitParameter-->init()...");
		super.init(config);
		//依次获取三个初始化参数的值，处理后存放到类的三个私有字段中
		myInstitute = config.getInitParameter("institute");
		if (myInstitute == null)
			myInstitute = "";
		myMajor = config.getInitParameter("major");
		if (myMajor == null)
			myMajor = "";
		String strCount = config.getInitParameter("count");
		try
		{
			count = Integer.parseInt(strCount);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void destroy()
	{
		System.out.println("InitParameter-->destroy()..");
		// TODO Auto-generated method stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("InitParameter-->doGet()..");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>获取初始化参数</TITLE></HEAD>");
		out.println("<body>");
		out.println("<h3>所在学院:" + myInstitute + "</h3>");
		out.println("<h3>所学专业:" + myMajor + "</h3>");
		count++;
		out.println("<h3>此Servlet的访问次数:" + count + "</h3>");
		out.println("</body>");
		out.println("</HTML>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
