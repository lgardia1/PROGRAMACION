/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author lgard
 */
public class typeofprint {
    public static void main(String[] args){
    
    System.out.print("Hola mundo"); //No deja guardado un salto de línea.
    System.out.println("Hola mundo");//Deja un salto de línea.
    
    float sumando1 = 18.92735f;
    float sumando2 = 9.89364f;
    double resultado = sumando1 * sumando2;
    
    System.out. printf("El resultado de multiplicar %f por %.2f es %.4f", sumando1, sumando2, resultado); 
    //Poner % y el tipo de texto indica donde va la variable %f, poner un numero hace que se represente con la parte entera capada con la cantidad que se especifique, para numero decimales se pone un punto tal que así: %.4f.
    //Este no tiene salto de línea por lo que se lo aplico.                                                        
    System.out.println();
    
    System.out.println("El resultado de multiplicar "+sumando1+" por "+sumando2+" es "+resultado);
    
    
    float sisterage1 = 18f;
    byte sisterage2 = 13;
    float divide = (float) 18/13;
    String sistername1 = "Lucía"; 
    String sistername2 = "Paula";
    
    System.out.printf("Mi hermana %s y %s tienen %.0f y %d, y el resultado de la división de sus edades es de: %.2f ", sistername1, sistername2, sisterage1, sisterage2,divide);
    
    }
}
