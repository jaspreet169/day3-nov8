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
public class lambton {
    
    
    
     int i = 0 ;
   
    int sumOfN(int n)     // 1+2+3+....+ N
    { 
        int sum = 0;
        
        for (int i = 1; n > i ; i++)
        {
            sum = sum + 1 ;
        }
        return sum; 
   }

 String reverseTheString(String str)
 {
     //String rev = new String();
    
     char s[] = str.toCharArray();
      char temp [] = new char[s.length];
      
     int j = 0; 
     for (int i = s.length - 1; i >=0; i--)
     {
         temp[j++] = s[i];
     }
   return  new String(temp) ;    
 }
 
  String reverseString(String str)   // array of string 
{
    StringBuilder sb = new StringBuilder();
    sb.append(str);
    sb.reverse();
    
     return sb.toString();
    
}
   void findMax(double a, double b , double c)
   {
       
       if(a > b)
       {
           System.out.println(a + " is max");
       }
       
   }
   void findmax(float a, float b , float c)
   {
       if (a > b &&  a > c)
       {
           System.out.println(a + "is max");
       }
       else if (b > a && b > c)
       {
            System.out.println(b + "is max");
        }
       else if (c > a && c > b )
       {
           System.out.println(c + "is max");
       }
   }
  
}