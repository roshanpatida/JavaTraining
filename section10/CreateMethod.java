/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section10;

/**
 *
 * @author roshan_patidar
 */
public class CreateMethod {
    
        static void inc(int x,int y){
        int c = x+y;
            System.out.println("is " + c);
    }
        void hello(int f,int j){
           int k=f-j;
            System.out.println(""+ k );
            //return 0;
        }
        
    public static void main(String[] args) {
        CreateMethod sc = new CreateMethod();
       int a=10,b=11;
      
      inc(a,b);
     sc.hello(a,b);
        
    }
   
    }

