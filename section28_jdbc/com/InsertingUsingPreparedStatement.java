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
import java.util.Scanner;
import java.sql.*;
/**
 *
 * @author roshan_patidar
 */
public class InsertingUsingPreparedStatement {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args)throws Exception  {
         Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_database", "root","root"); Statement stm = con.createStatement()) {
           PreparedStatement pstm=con.prepareStatement("insert into Customers values(?,?,?,?,?)");
           Scanner sc=new Scanner(System.in);
            System.out.println("Enter Customer data");
            int id=sc.nextInt();
            String fname=sc.next();
            String lname=sc.next();
            int age=sc.nextInt();
            String country=sc.next();
            pstm.setInt(1, id);
            pstm.setString(2, fname);
            pstm.setString(3, lname);
            pstm.setInt(4, age);
            pstm.setString(5, country);
          
            
            pstm.executeUpdate();
         con.close();
         pstm.close();
        }
   }
}
