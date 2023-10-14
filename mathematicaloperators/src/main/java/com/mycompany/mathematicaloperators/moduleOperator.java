/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mathematicaloperators;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class moduleOperator{
    public static void moduleOperatorAndComparation(){
        
    float number1, number2;
    Scanner input = new Scanner(System.in);
    
    System.out.println("Escribe 2 números");
    
    number1 = input.nextFloat();
    number2 = input.nextFloat();
    
    float modulo = number1 % number2;
    
    System.out.println("El modulo de entre los 2 números es de " + modulo);
    if (number1==number2){
        System.out.println("Es igual");
        if (number1<number2){
        
        System.out.println("Es igual");}
        if (number1>number2){
        System.out.println("Es igual");}
    }
    else {
        System.out.println("Es igual");
    }
        //Short operators
        //+=, -=, *=, /=, %=
        //a = a + b --> a+=b
        
        double result = 0;
        System.out.println("Number1 before addition: "+number1);
        System.out.println("Result before addition "+result);
        result = number1 += number2;
        System.out.println("Now number1 contains " +number1);
        System.out.println("Now result contains " + result);
        result = number1 *= number2;
        System.out.println("Now number1 contains " +number1);
        System.out.println("Now result contains " + result);
    }
}
