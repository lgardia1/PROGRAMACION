/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conditionalstatements;

/**
 *
 * @author Lucas
 */
public class conditionIfElse {
    public static void exampleWithConditionals(){
      boolean isSunny = false;
      boolean isWindness = true;
      boolean isRaining = true;
      String text = "";
        if(isSunny == true){
            if (isWindness==true){
                System.out.println("Voy a navegar");
                System.out.println("Compro monoloto");}
            else{
                System.out.println("Voy a pasear");
                System.out.println("Compro monoloto");
            }
                  
        }
        if(isRaining == true){
            if (isWindness==true){
            System.out.println("Canto bajo la lluvia");
            System.out.println("Me siento triste");}
            else{
            System.out.println("Me voy a ver una pelicula");
            System.out.println("Me siento triste");}
        }
    }
    
}
