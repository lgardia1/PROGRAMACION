/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mathematicaloperators;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Lucas
 */
public class NumberTernario {
  public static void exampleTernaio(){
  //Decir número aleatorio entre 1 y 100 es par o no
  //usando el operador ELVIS
   
  //Decir si un número, aleatorio entre 1 y 50 es impar o par
  final byte MIN = 1;
  final byte MAX = 50;
  int rnd1 = ThreadLocalRandom.current().nextInt(MIN,MAX);
  //Operador Ternario para valores pares:
  
  String oddness = (rnd1%2==0)?" Odd number":" Even numebr";
          
  System.out.println("Número aleatoro entre 1 y 50 par es" + rnd1 + oddness);
  } 
    
}
