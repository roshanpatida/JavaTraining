/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section21_annotation;

/**
 *
 * @author roshan_patidar
 */

/** @author Abdul Bari
 *  @version 2.0
 *  @since 2015
 **/



/**
 * 
 * @author roshan patidar
 * 
 * Class for Library Book
 */


public class Documentation
{ 
    
    /**
     * @value 10 default value
     */
    static int val=10;
    
    
    /**
     * Parametrized Constructor
     * @param s Book Name
     */
    
    public Documentation(String s){
    }
  
    /**
     * Issue a Book to a Student
     * @param roll roll number of a Student
     * @throws Exception if book is not available, throws Exception
     */
    public void issue(int roll) throws Exception{
    }
    
    /**
     * Check if book is available
     * @param str Book Name
     * @return if book is available returns true else false
     */
    public boolean available(String str){
        return true;
    }
    
    /**
     * Get Book name
     * @param id book id
     * @return returns book name
     */
    public String getName(int id){       
        return "";
    }
}
