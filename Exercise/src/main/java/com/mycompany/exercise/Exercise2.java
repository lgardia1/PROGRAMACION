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
public class Exercise2 {
    public static void exercise2(){
    Scanner input = new Scanner(System.in);
    
    System.out.print("¿Cuanto dinero tiene Guillermo? ");
    
    float moneyGillermo = input.nextFloat();
    float moneyLuis, moneyJuan;
    moneyLuis = moneyGillermo/2;
    moneyJuan = (moneyLuis+moneyGillermo)/2;
    
    System.out.println();
    System.out.println("Si Luis tiene la mitad de Gillermo y Juan la mitad de Luis y Guillermo juntos tendremos:");
    System.out.println("Luis: "+ moneyLuis);
    System.out.println("Juan: "+ moneyJuan);
}
}
