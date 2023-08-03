/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section28_jdbc.com;

/**
 *
 * @author roshan_patidar
 */

import java.sql.*;
/**
 *
 * @author roshan_patidar
 */
public class DdlQueryUsingJdbc {
    public static void main(String[] args)throws Exception  {
         Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_database", "root","root"); 
                Statement stm1 = con.createStatement(); 
            
            stm1.executeUpdate("CREATE TABLE Persons (\n" +
"    PersonID int,\n" +
"    LastName varchar(255),\n" +
"    FirstName varchar(255),\n" +
"    Address varchar(255),\n" +
"    City varchar(255)\n" +
");");
          
stm1.close();
            con.close();
        }
   }

