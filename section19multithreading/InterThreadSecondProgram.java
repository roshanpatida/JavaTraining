/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section19multithreading;

/**
 *
 * @author roshan_patidar
 */
class Data{
   int  value;
   boolean flag = true;
   synchronized public void set(int v){
       while(flag!=true){
           try{
               wait();
           }
           catch(Exception e)
           {
               System.out.println(e);
           }
           
       }
          
       this.value=v;
       this.flag=false;
      notify();
   }
   synchronized public int get(int count){
           int x=0;
       while(flag!=false){
           try{
               wait();
           }catch(Exception e){System.out.println(e);}
       }
       flag = true;
      x = value;
      notify();
           return x;
       }
}
class Roshan extends Thread{
        Data data;
        public Roshan(Data d){
            data=d;
        }
        public void run(){
            int count = 1;
            while(true){
                data.set(count);
                System.out.println("Roshan Patidar"+count);
                count++;
                
            }
           
        }
   }
class Harshit extends Thread{
    Data data;
    public Harshit(Data d){
        data=d;
    }
    public void run(){
        int count = 1;
//    int value;
    while (true){
        data.get(count);
        System.out.println("Harshit Ranawat"+ count);
        
    }
    } 
    
    
}
public class InterThreadSecondProgram {
    public static void main(String[] args) {
        Data d=new Data();
        Roshan r= new Roshan(d);
        Harshit h = new Harshit(d); 
        r.start();
        h.start();
   }
}
