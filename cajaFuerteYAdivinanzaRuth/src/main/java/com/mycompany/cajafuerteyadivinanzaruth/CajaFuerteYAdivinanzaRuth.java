/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.cajafuerteyadivinanzaruth;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Lucas
 */
public class CajaFuerteYAdivinanzaRuth {

    public static void main(String[] args) {
//        cajaFuerte();
        cajaFuerteVariable();
//        numeroAdivinanza();
    }

    public static void cajaFuerte() {
        //Tenemos  una caja fuerte que deseamos abrir, bloqueada por un candado de 3 numeros 
        //pedimos al usuario que introduzca la combinacion y si es correcta, ponemos 
        //CAJA DESBLOQUEADA y si no , ponemos HAS FALLADO, SIGUE INTENTANDO
        Scanner input = new Scanner(System.in);
        int number1 = 5, number2 = 7, number3 = 8, answer1, answer2, answer3;
        System.out.println("Introduzca la combinacion de la caja fuerte");
        do {
            answer1 = input.nextInt();
            answer2 = input.nextInt();
            answer3 = input.nextInt();
            if (number1 != answer1 || number2 != answer2 || number3 != answer3) {
                System.out.println("HAS FALLADO, SIGUE INTENTANDO");
            }
        } while (number1 != answer1 || number2 != answer2 || number3 != answer3);

        System.out.println("CAJA DESBLOQUEADA");
    }

    public static void cajaFuerteVariable() {
        //VARIANTES: generar la combinación de la caja fuerte con random y además establecer un número 
        //de intentos, 5 intentos
        Scanner input = new Scanner(System.in);
        int number1, number2, number3, answer1 = -1, answer2 = -1, answer3 = -1, MIN, MAX, attemps; // Incializamos las variables answerX con -1 ya que es un numero que es dificil que se ponga en la entrada de teclado y asi evitamos problemas porque si ponemos un numero igual a la entrada de teclado funciona mal el programa.
        attemps = 0;
        MIN = 0;
        MAX = 9;
        number1 = ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
        number2 = ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
        number3 = ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
        System.out.println("Introduzca la combinacion de la caja fuerte");
        System.out.println("Código generado aleatoriamente por la caja fuerte: "+number1 + " " + number2 + " " + number3);   //Esto es para que veas el codigo que se ha generado aleatoriamente del 0 al 9 incluidos : [0,9]
        do {
            attemps++;
            if (attemps < 6) {   //Si llega a los 6 intentos que no me pida la entrada de teclado 
                answer1 = input.nextInt();
                answer2 = input.nextInt();
                answer3 = input.nextInt();
                if (number1 != answer1 || number2 != answer2 || number3 != answer3) {
                    System.out.println("HAS FALLADO, SIGUE INTENTANDO");
                    System.out.println("Numero de intentos restantes: " + (5 - attemps));
                }
            }
        } while ((number1 != answer1 || number2 != answer2 || number3 != answer3) && attemps < 6); //Es falso si introduces el codigo correctamente o llega al intento 6.
        if (attemps == 6) {
            System.out.println("Números de intentos superado");
        } else {
            System.out.println("Caja fuerte desbloqueada");
        }
    }

    public static void numeroAdivinanza() {
        //generamos un número aleatorio que el usuario debe adivinar, cada vez que el
        //usuario introduzca un número le tenemos que dar una pista diciendo si es mayor 
        //o menor que el número a adivinar. Vamos a parar cuando el usuario introzuca un 0
        Scanner input = new Scanner(System.in);
        int randomNumber, answer = -1;
        randomNumber = ThreadLocalRandom.current().nextInt(1, 21);
        System.out.println("Adivina el numero entre el 1 y el 20");
        for (; randomNumber != answer;) {
            answer = input.nextInt();
            if (answer > randomNumber) {
                System.out.println("ERROR");
                System.out.println("El numero a adivinbar, es menor");
            }
            if (answer < randomNumber) {
                System.out.println("ERROR");
                System.out.println("El numero a adivinar, es mayor");
            }
        }
        System.out.println("Correcto el número es: " + randomNumber);
    }
}
