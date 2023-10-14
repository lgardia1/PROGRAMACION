/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mathematicaloperators;

/**
 *
 * @author Lucas
 */
public class IgnoreCase {
    public static void equalsIgnoreCase(){
    //Ignora la mayúscula y la minúsculas
    //Comparación de cadena de caracrteres
    //cad1.equalsIgnoreCase
    String cad1 , cad2;
        
    cad1 = "Water";
    cad2 = "water";
    if (cad1.equalsIgnoreCase(cad2)){
    System.out.println("Strings are equals");
    }else{
     System.out.println("Strings aren't equals");
    }
    }
}
