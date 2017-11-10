/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;


import java.util.Arrays;
import java.util.ArrayList;
/**
 *
 * @author macstudent
 */
public class Arraylist {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        //sorting array 
        
        int []a = {10,20,40,50,30};
        System.out.println(a.toString());
        Arrays.sort(a);
        
        System.out.println(Arrays.toString(a));
        
        String[]str = {"hello","a", "hello","b"};
        System.out.println(Arrays.toString(str));
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        
         ArrayList<movie> arrayListMovie = new ArrayList<>();
        movie m1 = new movie(1,"baby boss");
         movie m2 = new movie(2,"zfgxhgdc ");
          movie m3 = new movie(3,"bigg boss");
           movie m4 = new movie(4,"vhghjh");
           
          
        
           arrayListMovie.add(m1);
           arrayListMovie.add(m2);
           arrayListMovie.add(m3);
           arrayListMovie.add(m4);
           
           System.out.println("size :" + arrayListMovie.size());
           System.out.println("\n" + arrayListMovie.get(3));
           
            System.out.println("\n" + arrayListMovie.toString());
           
        
        
                
    }
    
}
