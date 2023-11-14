/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenprojectfunctions;

/**
 *
 * @author Lucas
 */
import java.util.Scanner;

public class FunctionsReturn {

    public static void main(String[] args) {

        Calculadora miCalculadora = new Calculadora(); //Instancia de la clase Calculadora atribuyendo un objeto.

        miCalculadora.sumar(2, 3); //Con el objeto usar el metodo sumar que es la funcion de la clase Calculadora.

        System.out.println(miCalculadora.resultado);//Con el objeto, llamamos a la variable resultado dentro de la clase MiCalculadora.
        
        System.out.println("Escribe 2 cero para acabar el programa");
        int num1, num2;
        int result;
        do {
            num1 = leerNumero();
            num2 = leerNumero();
            if (num1 != 0 && num2 != 0) {
                result = sumar(num1, num2);
                System.out.println("El resultado de sumar ambos números es de: "+result);
            }
        } while (num1 != 0 && num2 != 0);
        System.out.println("END");
    }

    public static int leerNumero() { //Esta funcion permite leer un numero y devolverte ese numero.
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        return num;
    }

    public static int sumar(int a, int b) { //Esta funcion le introduces 2 valores y retorna esos 2 valore sumados.
        return a + b;
    }
}

class Calculadora {

    int resultado; // Esto es una variable general, dentro de esta clase cualquier funcion puede tomarla y modificarla.

    public int sumar(int a, int b) {
        this.resultado = a + b;
        return resultado;
    }

}
