/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author lgard
 */
import java.util.Scanner;
public class scanneruse {
    public static void main(String[] args) {
        
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Introduzca un número entero");
    int number = keyboard.nextInt();
    System.out.println("Numero seleccionado: " + number);
    
    System.out.println("Introduzca un numero real:");
    double number1 = keyboard.nextDouble();
    System.out.println("Numero seleccionado: " + number1);
    
    keyboard.nextLine(); // Hay que meterlo antes de meter un input de String tipo cadena de caracteres con espacios (nextLine), para poder aztualizar la cache de los ateriores input, porque se queda el enter en la cache y esto hace que se introduzca el enter automaticamente y no se puede introducir una palabra.
    
    System.out.println("Introduzca una frase");
    String sentence = keyboard.nextLine();
    System.out.println("Palabra seleccionada: " + sentence);
    
    System.out.println("Introduzaca una palabra");
    String word = keyboard.next();
    System.out.println("Palabra seleccionada: " + word);
    
    System.out.println("Introduzca un caracter");
    char character =  keyboard.next().charAt(1); // El numero 1 indica la posición del caracter que toma.
    System.out.println("Caracter introducido: " + character);
    }
}
