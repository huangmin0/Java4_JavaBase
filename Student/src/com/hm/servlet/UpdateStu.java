package com.hm.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hm.bean.Student;
import com.hm.dao.StudentDao;
import com.hm.factory.StudentDaoFactory;

/**
 * Servlet implementation class UpdateStu
 */
@WebServlet("/UpdateStu")
public class UpdateStu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateStu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		StudentDao studentDao=StudentDaoFactory.getStudentDaoInstance();
		Student student=studentDao.findAllStudent(id);
		request.setAttribute("student", student);
		request.getRequestDispatcher("/student/update.jsp").forward(request, response);
		/*request.getSession().setAttribute("student", student);
		response.sendRedirect("/Student/student/update.jsp");*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
