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
public class employee {

    int employeeID;
    int a,b ;
    {
        // variable will not be access inside any method
         a = 10;
        System.out.println("i am outside the main["+ a +"]"); //  block
    }
    
    {
        b = 200;
        //employeeID = 100; 
        System.out.println("i am in block [" + b +"]");
    }
    
   
    
    
    
    int c; 
    {
       // int c = 20; 
        System.out.println("i am in block[" + c +"] ");
    }
    
    
//    public  static void main(String[] args)
//    {
//        System.out.println(" i am inside the main()");
//    }
     void getID()
     {
         //this.employeeID = 1;
         System.out.println("getID() called - " + employeeID);
     }
    
    
}
