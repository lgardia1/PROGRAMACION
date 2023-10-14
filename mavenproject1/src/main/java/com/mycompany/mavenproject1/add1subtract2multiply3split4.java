/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author prolu
 */
import java.util.Scanner;
import java.math.BigDecimal;
public class add1subtract2multiply3split4 {
    public static void main( String[] args){
        
    Scanner input = new Scanner(System.in);
    
    
    System.out.println("Escribe un numero A para restar, sumar, multiplicar y dividir ");
    BigDecimal Anumber = new BigDecimal(input.next());
    
    System.out.print("Escribe un número B para restar, sumar, multiplicar y dividir ");
    BigDecimal Bnumber = new BigDecimal(input.next());
   
    
    double add = Anumber.doubleValue() + Bnumber.doubleValue();
    System.out.println("La suma de A y B es de: " + add);
    
    double subtract = Anumber.doubleValue() - Bnumber.doubleValue();
    System.out.println("La resta de A y B es de: " + subtract);
    
    double multiply = Anumber.doubleValue() * Bnumber.doubleValue();
    System.out.println("La multiplicación de A y B es de: " + multiply);
            
    BigDecimal divide = Anumber.divide(Bnumber,2,BigDecimal.ROUND_HALF_UP);
    System.out.print("La división de A y B es de: " + divide);
    }
    
}
