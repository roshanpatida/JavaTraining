/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package two_dimension_array;

/**
 *
 * @author roshan_patidar
 */
public class SearchingTwoDimesinalMain {
    public static void main(String[] args) {
          allProgramBasedOn2DArray  sda=new allProgramBasedOn2DArray(3,3);
        sda.insertValueInTheArray(0, 0, 10);
        sda.insertValueInTheArray(0, 1, 20);
        sda.insertValueInTheArray(0, 2, 10);
        sda.insertValueInTheArray(1, 0, 20);
        sda.insertValueInTheArray(1, 1, 10);
        sda.insertValueInTheArray(1, 2, 20);
        sda.insertValueInTheArray(2, 0, 10);
        sda.insertValueInTheArray(2, 1, 20);
        sda.insertValueInTheArray(2, 2, 20);
        sda.searchingValue(10);
    }
}
