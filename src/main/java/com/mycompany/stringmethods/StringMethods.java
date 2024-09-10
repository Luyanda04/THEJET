/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stringmethods;

/**
 *
 * @author RC_Student_lab
 */
public class StringMethods {

    public static void main(String[] args) {
        //charAt() => returns  a character
        String name = " Hello hi ";
        String lname = " HelloTwo ";
        char results = name.charAt(0);
        System.out.println(results);
        System.out.println(name.charAt(3));
        
        //CompareTo() => returns integer
        System.out.println(name.compareTo(lname));
        
        //concat() => returns a string
         System.out.println(name.concat(lname));
         
         //contains()
         String email = "jet@gmail.com";
         System.out.println(email.contains("@"));
         
         //Just a comment
         
         //EndsWith => returns boolean
         System.out.println(email.endsWith(".com"));
        
         //equals => returns boolean
         System.out.println(email.equals("jet@gmail.com"));
          System.out.println(email.equalsIgnoreCase("jet@gmail.com"));
          
          //indexOf() => Returns an integer
          System.out.println(email.indexOf("."));
          
          //IsEmpty()
           System.out.println(email.isEmpty());
           
           //length() => Returns integer
             System.out.println(email.length());
}
}