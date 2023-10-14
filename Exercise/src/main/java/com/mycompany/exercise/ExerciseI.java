/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise;

/**
 *
 * @author Lucas
 */
import java.util.Scanner;
public class ExerciseI {
    public static void exerciseI(){
    System.out.println("Escribe una nota del 1 al 10");
    Scanner input = new Scanner(System.in);
    int number = Math.round(input.nextFloat());
    
    switch(number){
        case 1,2,3,4:
            System.out.println("Insuficiente");
         break;
        case 5:
            System.out.println("Suficiente");
            break;
        case 6: 
            System.out.println("Bien");
            break;
        case 7:
            System.out.println("Notable bajo");
            break;
        case 8:
            System.out.println("Notable");
            break;
        case 9:
            System.out.println("Sobresaliente");
            break;
        case 10: 
            System.out.println("Sobresaliente alto");
            break;
        default: System.out.println("ERROR, introduce de nuevo el número");
                 break;
    }
}
}
