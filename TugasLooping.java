/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.looping;

/**
 *
 * @author LENOVO
 */
public class Looping {
    public static void main(String args[]) {
      int a = 5;
      
      System.out.print("Untuk looping 'while':\n");

      while( a < 10 ) {
         System.out.print(+a);
         a++;
         System.out.print("\n");
      }
      
      System.out.print("\n");
      System.out.print("\n");
      
      System.out.print("Untuk looping 'for':\n");
      
      for(int b = 5; b < 10; b = b + 1) {
         System.out.print(+b);
         System.out.print("\n");
      }
      
      System.out.print("\n");
      System.out.print("\n");
      
      System.out.print("Untuk looping 'do while':\n");
      
      do {
         System.out.print(+a);
         a++;
         System.out.print("\n");
      }while( a < 15 );
   }
}
