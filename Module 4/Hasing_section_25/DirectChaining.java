/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hasing_section_25;

import java.util.LinkedList;

/**
 *
 * @author roshan_patidar
 */
public class DirectChaining {
    LinkedList<String>[]  hashTable;
    int maxChainSize = 5;
    
    DirectChaining(int size){
        hashTable = new LinkedList[size];
        
    }
    public int modASCIIHashFunction(String word, int m){
        char ch[];
        ch= word.toCharArray();
        int i,sum;
        for(sum =0,i=0;i<word.length();i++){
            sum = sum + ch[i];
        }
        return sum%m;
    }
    public void inserHashTable(String word){
        int newIndex = modASCIIHashFunction(word, hashTable.length);
        
        if(hashTable[newIndex] == null){
            hashTable[newIndex]= new LinkedList<String>();
            hashTable[newIndex].add(word);
        }else{
            hashTable[newIndex].add(word);
        }
            
        
    }
    
    public void displayHashTable(){
        if(hashTable == null){
            System.out.println("Error");
            return;
        }
        else{
            System.out.println("------HashTable---------");
            for(int i =0;i<hashTable.length;i++){
                System.out.println("index" + i + "key" + hashTable[i]);
            }
        }
    }
    // Search Method
    
    public boolean searchHashTable(String word){
       int newIndex = modASCIIHashFunction(word, hashTable.length);
       if(hashTable[newIndex] != null && hashTable[newIndex].contains(word) ){
           System.out.println("Successfull");
           return true;
       }else{
           System.out.println("Error");
           return false;
       }
    }
    //Delete Chaining 
    
    public void deleteKeyHashTable(String word){
        int newIndex = modASCIIHashFunction(word, hashTable.length);
        boolean result = searchHashTable(word);
        if(result == true){
            hashTable[newIndex].remove(word);
            System.out.println(word + " Deleted successfully");
        }
    }
    public static void main(String[] args) {
        DirectChaining ss = new DirectChaining(5);
        ss.inserHashTable("Hel");
        ss.inserHashTable("bro");
        ss.inserHashTable("how");
        ss.inserHashTable("are");
        ss.inserHashTable("you");
        ss.displayHashTable();
        ss.deleteKeyHashTable("bro");
        ss.searchHashTable("are");
        ss.displayHashTable();
        
    }
}
