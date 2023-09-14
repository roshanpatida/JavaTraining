/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package two_dimension_array;

import java.util.Arrays;

/**
 *
 * @author roshan_patidar
 */
public class InsertingMain {
    public static void main(String[] args) {
        allProgramBasedOn2DArray  sda=new allProgramBasedOn2DArray(3,3);
        sda.insertValueInTheArray(0, 0, 10);
        System.out.println(Arrays.deepToString(sda.arr));
    }
}
