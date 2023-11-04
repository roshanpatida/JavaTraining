package com.luv2code.web.jdbc;
import java.util.*;

import com.mysql.cj.xdevapi.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnectivity {
public static void main(String args[]) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.Driver");
	Connection con= DriverManager.getConnection("jdbc:mysql://mysql.db.server:3306/web_student_tracker","root","root");
    Statement stmt = (Statement) con.createStatement();

	//stmt.executeQuery(stmt);
    ResultSet rs = ((java.sql.Statement) stmt).executeQuery("select * from student order by last_name");

    {		      
        while(rs.next()){
           //Display values
        	 System.out.print("ID: " + rs.getInt("id"));
           System.out.print("FirstName: " + rs.getInt("first_name"));
           System.out.print(", LastNAme: " + rs.getInt("last_name"));
           System.out.print(", email: " + rs.getString("email"));
          
        }
	
}
}
}
