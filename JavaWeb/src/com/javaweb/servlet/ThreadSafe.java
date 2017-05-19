package com.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.print.resources.serviceui_zh_TW;

/**
 * Servlet implementation class ThreadSafe
 */
@WebServlet("/servlet/ThreadSafe")
public class ThreadSafe extends HttpServlet {
      String name="";//实例变量，多线程共享
      private final Lock lock = new ReentrantLock();
       private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThreadSafe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
		//public synchronized void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out =response.getWriter();
		out.println("<html>");
		out.println("<head><title>Servlet线程安全问题</title></head>");
		out.println("<body>");
		lock.lock();
		String username=request.getParameter("name");
		//String name=request.getParameter("name");
		 name=new String(username.getBytes("UTF-8"), "UTF-8");
		try {
			Thread.sleep(10000);//休眠10秒
		} catch (Exception e) {
			e.printStackTrace();
		}
		out.println("<h3>您好,"+name+"!</h3>");
		out.println("</body>");
		out.println("</html>");
		out.close();
		lock.unlock();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
