/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.decisionmaking;

/**
 *
 * @author LENOVO
 */
public class DecisionMaking {

    public static void main(String[] args) {
        int umur = 18;
        int nilai = 75;
        int a = 70;
        int b = 60;
        String status_finansial = "Mampu";
        
        
        System.out.println("If Statement: ");
        
        if(umur >= 18){
            System.out.println("Silakan buat KTP");
        }
        
        System.out.println("-------------------------------------");
        System.out.println("If... Else Statement: ");
        
        if(nilai >= 60){
            System.out.println("Lulus");
        }else {
            System.out.println("Tidak Lulus");
        }
        
        System.out.println("-------------------------------------");
        System.out.println("Nested If Statement: ");
        
        if(a == 70){
            if(b == 60){
                System.out.println("Oke");
            }
        }
        
        System.out.println("-------------------------------------");
        System.out.println("Switch: ");
        
        switch(status_finansial){
            case "Kaya":
                System.out.println("WOW!!!");
                break;
            case "Mampu": 
                System.out.println("Bagus");
                break;
            case "Miskin":
                System.out.println("Sabar");
                break;
            default:
                System.out.println("?");
        }
        System.out.println("Anda orang "+status_finansial);
    }
}
