/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercisearrays;

/**
 *
 * @author Lucas
 */
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ExerciseArrays {

    public static void main(String[] args) {
        array1();
//        array2();
//        array4();
//        array5();
    }

    public static void array1() {
        //Crear y rellenar un array de 20 elementos con los primeros 20 impares
        int[] numero = new int[20];
        for (int i = 0; i < numero.length; i++) {
            numero[i] = i * 2 + 1;
        }
        System.out.println(Arrays.toString(numero));
    }

    public static void array2() {
        //Crear y rellenar un array de 8 num aleatorios, mostrarlos por pantalla y mostrar su suma y la media aritmetica
        int min = 0;
        int max = 100;
        int[] numero = new int[8];
        for (int i = 0; i <= numero.length; i++) {
            int number1 = ThreadLocalRandom.current().nextInt(min, max + 1);
            numero[i] = number1;
        }
        System.out.println(Arrays.toString(numero));
    }

    public static void array3() {
        //Crear otro array de 10 números reales aleatorios y contar el numero positivos, negativos.
    }

    public static void array4() {
        //Crear y rellenar un arrat con x elementos con las letras del alfabeto desde la z hasta la A mayúscula
        char[] abecedario = new char[27];
        char letras = 'z';
        for (int i = 0; i < abecedario.length; i++) {
            abecedario[i] = letras;
            letras--;
        }
        System.out.println(Arrays.toString(abecedario));
    }

    public static void array5() {
        //Crear y rellenar un array con los primeros 13 números primos, debiendo usar una función que se llame isLeapPrime que me diga si  un número es primo
        int[] numero = new int[12];
        for (int i = 0; i < numero.length; i++) {
            numero[i] = i * 2;
            System.out.print(numero[i]);
            isLeapPrime(numero[i]);
        }
    }

    /*
    |
    |
    |
    v
     */
    public static void isLeapPrime(int i) {
        if (i % 2 == 0) {
            System.out.printf(" es primo\n");
        }

    }
}
