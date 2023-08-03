/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section28_jdbc.com;

import java.sql.*;
/**
 *
 * @author roshan_patidar
 */
public class DmlUpdateQuery {
    public static void main(String[] args)throws Exception  {
         Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_database", "root","root"); Statement stm = con.createStatement()) {
            stm.executeUpdate("update Customers set first_name='Jay' where first_name='Kruti'");
            
            
            
        }
   }
}
