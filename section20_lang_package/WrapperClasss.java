/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section20_lang_package;

/**
 *
 * @author roshan_patidar
 */



public class WrapperClasss {

    public static void main(String[] args) {
        
        Integer i=new Integer(10);
        Integer a=Integer.valueOf(10);
        Integer b=10;
        
        Byte c=15;
        Byte d=Byte.valueOf("15");
        System.out.println(d);
        
        Short f=Short.valueOf("123");
        System.out.println(f);
        Float g=12.3f;

        
        Double j=Double.valueOf(123.456);
        System.out.println(j);
        Character k=Character.valueOf('A');
        System.out.println(k);
        Boolean l=Boolean.valueOf("true");
        System.out.println(l);
        byte bb=15;
        Byte e=Byte.valueOf(bb);
        System.out.println(e);
        Float h=Float.valueOf("123.5");
        float x=h.floatValue();
        System.out.println(x);
        float y=h;
        
        int m=10;
//        Integer n=Integer.valueOf(m);
        Integer n=m;
//        int p=n.intValue();
        int p=n;
    }
    
}