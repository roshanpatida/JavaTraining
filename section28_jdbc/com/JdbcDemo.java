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
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.sql.*;


/**
 *
 * @author roshan_patidar
 */
public class JdbcDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception { 
        Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_database","root","root");
            Statement stm = con.createStatement();
            ResultSet rs=stm.executeQuery("select * from Customers;");
             int dno;
             String dname;
             while(rs.next()){
             dno=rs.getInt("customers_id");
             dname=rs.getString("first_name");
                 System.out.println(dno+" "+dname);
             
             }
        // TODO code application logic here
    }
    
}
