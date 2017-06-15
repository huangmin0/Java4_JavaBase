package com.hm.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hm.dao.StudentDao;
import com.hm.factory.StudentDaoFactory;

/**
 * Servlet implementation class DeleteStu
 */
@WebServlet("/DeleteManyStu")
public class DeleteManyStu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteManyStu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] its=request.getParameterValues("gou");
		for (String id1 : its)
		{
			int id=Integer.parseInt(id1);
			StudentDao studentDao=StudentDaoFactory.getStudentDaoInstance();
			studentDao.deleteStudent(id);
		}
		response.sendRedirect("/Student/student/index.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
