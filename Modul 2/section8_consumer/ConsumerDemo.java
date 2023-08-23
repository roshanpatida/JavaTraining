/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package section8_consumer;

/**
 *
 * @author roshan_patidar
 */

import java.util.function.Consumer;
 class ConsumerDemo
{
public static void main(String[] args)
{
Consumer<String> c=s->System.out.println(s);
 c.accept("Hello");
 c.accept("DURGASOFT");
}
 } 