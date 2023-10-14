/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioubucle;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class EjercicioUBucle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int suma = 0;
        int mayor = 0;
        System.out.println("Escriba 10 sueldos");
        while(i<10){
        i++;
        int sueldo = input.nextInt();
        suma = sueldo+suma;
        if (sueldo>1500){
        mayor++;
        }
        }
        System.out.println("La suma de todos los sueldos es de: "+ suma);
        System.out.println("Hay "+mayor+" sueldo mayores a 1500 sin incluir 1500");
    }
}
