/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

/**
 *
 * @author macstudent
 */
public class commandLine {
    public static void main(String[] args) {
    // print first name and last name 
     System.out.println("welcome to command line");
    System.out.println("total no of argu"  + args.length);
    
    
    if (args.length > 0)
    {
    
    for(String s : args)
    {
        
        
    ///System.out.println("First name : "  + args[0]);
    System.out.println("last name : " + s);
    //demo test 
    
    }
    }
    }
    static String concatString(String[] arrStr){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < arrStr.length; i++ )
        {
            s.append(arrStr[i]);
        }
        return s.toString();
    }
    
    static String resverseString(String[] arrStr){
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < arrStr.length; i++ )
        {
            s1.append(arrStr[i]);
            
        }
        return s1.toString();
    }
    
   
}
    
    
    
    