/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenprojectfunctions;

/**
 *
 * @author lgard
 */
import java.util.Scanner;

public class Mavenprojectfunctions {

    public static void main(String[] args) {
        workingWithScanner();//Las funciones sirven para ejecutar subprocesos, este es un ejemplo de uno.
        workingWithPrintf();//Las funciones pueden ser estaticas, no habra que hacer una instnacia, lo malo que no podremos tener varios obketos con diferentes valores.
                            //Tambien puedene ser void, en caso de serlo, este retorna no retorna un valor, y de lo contrario lo hace, alfinal retornando una varibale.
                            //Cada variable de cada funcion es independiente, la manera de comuncar funciones seria poniendo valores entre los parentesis o haciendo variables generales.
    }
    public static void workingWithScanner (){ //Proceso
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
    char character =  keyboard.next().charAt(0); // El numero 1 indica la posición del caracter que toma.
    System.out.println("Caracter introducido: " + character);
    }
    public static void workingWithPrintf(){
    
    
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
