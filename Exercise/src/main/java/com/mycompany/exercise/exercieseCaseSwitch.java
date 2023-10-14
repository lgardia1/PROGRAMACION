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
public class exercieseCaseSwitch {
    public static void exerciseNino(){
    Scanner input = new Scanner(System.in);
    System.out.println("¿Que dia es?");
    String dia;
    dia = input.next();
    String minusDay = dia.toLowerCase();
    
    switch(minusDay){
        case "lunes" , "jueves":
            System.out.println("Hoy es "+dia+", por lo que toca llevar al niño al palo.");
            break;
        case "martes" , "miercoles":
            System.out.println("Hoy es "+dia+", por lo que toca llevar al niño a natación.");
            break;
        case "viernes":
            System.out.println("Hoy es "+dia+", por lo que toca llevar al niño al cine.");
            break;
        case "sabado" , "domingo":
            System.out.println("Hoy es "+dia+", por lo que toca llevar al niño a la playa.");
            break;
        default: System.out.println("ERROR, escribe de nuevo el día");
            break;
    }
    }
}
