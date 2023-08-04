/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section28_jdbc.com;
import java.util.Scanner;
import java.sql.*;
/**
 *
 * @author roshan_patidar
 */
public class CheckValidation {
    public static void main(String[] args) {
        



   
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_database","root","root");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Your CustomerID");
            String customer_id=sc.nextLine();
            System.out.println("Enter Your First Name");
            String fname=sc.nextLine();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from Customers where customers_id='"+customer_id+"'and first_name='"+fname+"'");
            if(rs.next()){
                System.out.println("Account is Valid ");
            }
            else{
                System.out.println("Invalid UserName");
            }
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}



