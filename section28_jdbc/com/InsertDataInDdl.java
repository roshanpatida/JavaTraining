/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section28_jdbc.com;

/**
 *
 * @author roshan_patidar
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author roshan_patidar
 */

import java.sql.*;
/**
 *
 * @author roshan_patidar
 */
public class InsertDataInDdl {
    public static void main(String[] args)throws Exception  {
         Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_database", "root","root"); 
                Statement stm1 = con.createStatement(); 
            
            stm1.executeUpdate("insert into Persons values(1,'Patidar','Roshan','Indore','Maheshwar'),(2,'Ranawat','harshit','Jhabua','Ratlam'),(3,'Sarathe','Sarika','Bhopal','Bhopal')");
          
stm1.close();
            con.close();
        }
   }

