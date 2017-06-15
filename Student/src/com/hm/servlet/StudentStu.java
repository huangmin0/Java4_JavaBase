package com.hm.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hm.bean.Student;
import com.hm.dao.StudentDao;
import com.hm.factory.StudentDaoFactory;

/**
 * Servlet implementation class StudentStu
 */
@WebServlet("/StudentStu")
public class StudentStu extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StudentStu() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext servletContext = getServletContext();// 获得ServletContext
		RequestDispatcher dispatcher = null;
		String id = request.getParameter("id");// 接收学生学号
		String name = request.getParameter("username");// 接收学生姓名
		String age = request.getParameter("age");// 接收学生年龄
		String phone = request.getParameter("phone");// 接收学生电话号码
		if (id == null || "".equals(id)) {
			request.setAttribute("error", "请输入学号");
			response.sendRedirect("/Student/student/student.jsp");
		} else {
			if (name == null || "".equals(name)) {
				request.setAttribute("error", "请输入姓名");
				response.sendRedirect("/Student/student/student.jsp");
			} else {
				if (age == null || "".equals(age)) {
					request.setAttribute("error", "请输入年龄");
					response.sendRedirect("/Student/student/student.jsp");
				} else {
					if (phone == null || "".equals(phone)) {
						request.setAttribute("error", "请输入电话");
						response.sendRedirect("/Student/student/student.jsp");
					} else {

						Student student = new Student();
						student.setId(Integer.parseInt(id));
						student.setName(name);
						student.setAge(Integer.parseInt(age));
						student.setPhone(Integer.parseInt(phone));
						StudentDao studentDao = StudentDaoFactory.getStudentDaoInstance();
						studentDao.addStudent(student);
						response.sendRedirect("/Student/student/index.jsp");
					}
				}
			}
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
