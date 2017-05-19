package com.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ChineseEncoding
 */
@WebServlet("/servlet/ChineseEncoding")
public class ChineseEncoding extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChineseEncoding() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out=response.getWriter();
		out.println("<HTML>");
		out.println("<head><title>解决中文乱码问题</title></head>");
		out.println("<body>");
		out.println("<h3>调用了doGet()方法</h3><p>");
		out.println("<font size=4>用户输入信息:</font>");
		
		String info=request.getParameter("information");
		//String newinfo=new String(info.getBytes("iso8859_1"),"UTF-8");
		//out.println("<h3>"+newinfo+"<h3>");
		out.println("<h3>"+info+"<h3>");
		out.println("</body>");
		out.println("</HTML>");
		out.close();
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");//设置响应对象的字符集，解决页面中文乱码问题。
		//response.setCharacterEncoding("UTF-8");//这种方法也可以解决中文乱码问题
		PrintWriter out=response.getWriter();
		out.println("<HTML>");
		out.println("<head><title>解决中文乱码问题</title></head>");
		out.println("<body>");
		out.println("<h3>调用了doPost()方法</h3><p>");
		out.println("<font size=4>用户输入信息:</font>");
		
		//request.setCharacterEncoding("UTF-8");//设置请求对象的字符集，解决请求参数的中文乱码问题，必须设置在参数前面。
		String info=request.getParameter("information");
		String newinfo=new String(info.getBytes("iso8859_1"),"UTF-8");
		out.println("<h3>"+newinfo +"<h3>");
		//out.println("<h3>"+info +"<h3>");
		out.println("</body>");
		out.println("</HTML>");
		out.close();
	
	}

}
