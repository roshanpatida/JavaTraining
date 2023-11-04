package com.luv2code.web.jdbc;
import com.luv2code.web.jdbc.*;
import jakarta.annotation.Resource;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import javax.sql.DataSource;

/**
 * Servlet implementation class StudentControllerServlet
 */
@WebServlet("/StudentControllerServlet")// add servlet as welcome file 
public class StudentControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
private StudentDbUtil studentDbUtil;

@Resource(name="jdbc/web_student_tracker")
private DataSource dataSource;


	@Override
public void init() throws ServletException {
	// TODO Auto-generated method stub
	super.init();

//create our student fb util... and pass in the conn pool / datasource 
	try {
		studentDbUtil = new StudentDbUtil(dataSource);
	}
	 catch(Exception exe) {
		 throw new ServletException(exe);
	 }
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try {	
	//list the students... in MVC fashion 
		listStudents(request, response);
	}
	catch(Exception exe) {
		throw new ServletException(exe);
	}
	
	}
		private void listStudents(HttpServletRequest request, HttpServletResponse response)
		throws Exception {
		
			// get students fron db util
			List<Student> students = studentDbUtil.getStudents();
			
			//add students to the request 
			
			request.setAttribute("STUDENT_LIST",students);
			// send to jsp page (view) 
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/list=students.jsp");
			dispatcher.forward(request, response);
			
	}

}
