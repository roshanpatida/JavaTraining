/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section28_jdbc.com;
import java.sql.*;
import java.util.Scanner;
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
public class PreparedStatment1 {
    public static void main(String[] args)throws Exception { 
        Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_database","root","root");
            PreparedStatement stm = con.prepareStatement("select * from Customers where first_name=?");
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter firstname");
            String firstname=sc.nextLine();
            stm.setString(1, firstname);
            
            ResultSet  rs=stm.executeQuery();
                    
            
             
             while(rs.next()){
                 System.out.println(rs.getInt("customers_id")+" ");
                 System.out.println(rs.getString("first_name")+" ");
                 System.out.println(rs.getString("last_name")+" ");
                 System.out.println(rs.getString("country")+"");
                 System.out.println(rs.getInt("age")+" ");
                 
             
             
             }
        // TODO code application logic here
    }}
    



    

