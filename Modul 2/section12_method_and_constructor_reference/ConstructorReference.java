/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section12_method_and_constructor_reference;

/**
 *
 * @author roshan_patidar
 */


// in this program we create test class object and then call get method thruogh the help of constructor reference
// get method internally refer Test class constructor 
// then we use ofT est class object and then call constructor. 
class Test{
    Test(){
        System.out.println("Test class constructor execution & object creation");
    }
}
interface InterF{
    public Test get();
}
public class ConstructorReference {
    public static void main(String[] args) {
        InterF i=Test::new;
        Test s=i.get();
    }
}
