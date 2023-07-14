/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section22_iostreams;


/**
 *
 * @author roshan_patidar
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value={ElementType.METHOD})
@interface MyAnno55
{
    String name();
    //String project();
    String date() default "today";
    String version() default "13";
            }

//@MyAnno(name="Ajay",project="Bank")
public class NewClass
{
    //@MyAnno(name="Ajay")
    int data;

    @MyAnno55(name="Ajay")
    public static void main(String[] args)
    {
        //@MyAnno(name="Ajay")
        int x;
    }
}