/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise;

/**
 *
 * @author Lucas
 */

import java.util.concurrent.ThreadLocalRandom;
public class randomExercise {
    public static void RandomExercise(){
   //Hacer el 2 y 7
    int min = 2;
    int max = 7;
    int rnd = ThreadLocalRandom.current().nextInt(min , max +1);
        System.out.println("Un valor aleaotiro entre 7 y 2 es de: "+rnd);    
    }
}
