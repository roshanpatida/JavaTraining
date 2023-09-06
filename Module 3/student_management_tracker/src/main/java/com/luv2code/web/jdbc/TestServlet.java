package com.luv2code.web.jdbc;

import jakarta.annotation.Resource;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.sql.DataSource;

import com.mysql.cj.xdevapi.Statement;

/**
 * Servlet implementation class TestServlet
 */
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
// Define datasources/connection pool for resource injection
	
	@Resource(name="jdbc/web_student_tracker")

	private DataSource dataSource;  
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//step 1: set upthe printwriter
		PrintWriter out = response.getWriter();
		
		response.setContentType("text/plain");
		
		//step 2: get a connection to the database
		Connection myConn = null;
		Statement myStmt =null;
		ResultSet myRs =null;
		
		try {
			myConn=dataSource.getConnection();
		//step 3: create a SQL statement
		String sql = "select * from student";
		myStmt = (Statement) myConn.createStatement();
		// step 4: Execute SQL query
		
		myRs =((java.sql.Statement) myStmt).executeQuery(sql);
		
		//step 5 : Process the result set
		
		while(myRs.next()) {
			String email = myRs.getString("email");
			out.println(email);
		}
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}
	}

}
