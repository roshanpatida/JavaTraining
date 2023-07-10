/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section11;

/**
 *
 * @author roshan_patidar
 */
class Hiding1{
private double length;
private double breadth;

public double getLength(){
    return length;
}
public double getBreadth(){
    return breadth;
}
public void setLength(double l)
{
    if(l>=0)length=l;
    else length=0;
}
public void setBreadth(double b){
    if(b>=0)breadth = b;
    else breadth = 0;
}
public double area(){
    return getLength()*getBreadth();
}

        }
public class Hinding {
    public static void main(String[] args) {
        
      Hiding1 sc = new Hiding1();
      sc.setBreadth(10.5);
      sc.setLength(5.5);
        System.out.println("Area " + sc.area()); 
        System.out.println("Length" + sc.getLength());
        System.out.println("Breadth" + sc.getBreadth());
    }
}
