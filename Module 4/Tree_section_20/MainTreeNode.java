/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tree;

/**
 *
 * @author roshan_patidar
 */
public class MainTreeNode {
    public static void main(String[] args) {
         TreeNode drinks = new TreeNode("Drinks");// its just parent node of tree
         TreeNode hot = new TreeNode("Hot");//it is child node of drink node
         TreeNode cold = new TreeNode("Cold");//it is child node of drinks node
         TreeNode tea = new TreeNode("Tea");// it is child node of hot node 
         TreeNode coffee = new TreeNode("Coffee");// child of hot node
         TreeNode wine = new TreeNode("Wine");// child of cold node
         TreeNode beer = new TreeNode("Beer");// child of cold node
        drinks.addChild(hot);
        drinks.addChild(cold);
        hot.addChild(tea);
        hot.addChild(coffee);
        cold.addChild(wine);
        cold.addChild(beer);
             
         
         System.out.println(drinks.print(0));
    }
 
}

//OUTPUT - //run:
//Drinks
// Hot
//  Tea
//  Coffee
// Cold
//  Wine
//  Beer
//
//BUILD SUCCESSFUL (total time: 0 seconds)
