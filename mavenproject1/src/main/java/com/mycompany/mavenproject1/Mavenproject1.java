/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author lgard
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        
        byte testResult1 = 9;
        byte testResult2 = 10;
        byte testResult3 = 5;
        double percentaje1 = (3.0/5.0);
        double percentaje2 = (1.0/5.0);
        double percentaje3 = (1.0/5.0);
        
        
        double finalResult = testResult1 * percentaje1 + testResult2 * percentaje2 + testResult3 * percentaje3;
        
        System.out.println("Your final result is: " + finalResult);
        System.out.println("Your final result is rounded up: " + Math.ceil(finalResult*10)/10);
        System.out.println("Your final result is rounded down: " + Math.floor(finalResult*10)/10);
        System.out.println("Your final result is rounded: " + Math.round(finalResult*10)/10);
    }
}
