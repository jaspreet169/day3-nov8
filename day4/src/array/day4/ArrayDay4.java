/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.day4;

import java.text.DecimalFormat;

/**
 *
 * @author macstudent
 */
public class ArrayDay4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int a = 10;
         int b = a; 
         long c = 100;
         
         a = (int)c;      //explicit  casting
        
         int d = a * b;
         
         
         short a1 = 10;
         short b1 = 20;
         short c1 = a1; 
         
         short d1 = (short) (a1 * b1);
            
         
        
         int m = 23 ;
         int n = 5;
         int p = m/n;
          System.out.println(p);
         
          
          float p1 = m/n; 
          System.out.println(p1);
         
          
            float f = (float) 4.0;
         float o = (float) .5;
        
        System.out.println(o);
         
        System.out.println(Math.ceil(m/n));   // casted to float 
        System.out.println(Math.ceil(((float) m/n)));
        
        
        int cha1 = 'A';
        System.out.println(cha1);
        
        int cha2 = 'J';
        System.out.println(cha2);
        
        
        
       DecimalFormat fmt = new DecimalFormat("#0.00");
      System.out.println(fmt.format(44444445.897)); 
        
      //string 
       c= 100;
      String s1 = "hello";
      String s2 = " hello".trim(); // string pull create at run time
     System.out.println(s2);
     
     //wrapper class
     
     int x = 10;
     Integer y; //
     
     
   
     
             
             Integer a2 = 100;
             //int a3 = a2;
             int l = Integer.parseInt("12");
             String s = String.valueOf(12); // Imteger to String 
             
             
             Integer u = new Integer(20); // unboxing 
             u.intValue();
             System.out.println(u); 
             
             
             
    
     
        
        
    }
    
}
