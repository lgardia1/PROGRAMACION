/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package rut.exa2_nov_23_24_alus;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Rut
 */
public class EXA2_Nov_23_24_ALUS {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
//LUCAS GARCIA DIAZ
        // ***********  EL MAIN NO SE TOCA *****************
        ejercicio1();
        ejercicio2();
        // Ejercicio 3
        int[] misNums = creaArray();
        System.out.println(Arrays.toString(misNums));
        // Ejercicio 4
        int[][] miEjer = divideArray(misNums);
        recorreArrayBidi(miEjer);
    }

    //40'
    // Hacer un bucle en el que meta números y sólo salga de él si meto dos 
    // números pares repetidos. 
    public static void ejercicio1() {
        System.out.println("Introduce números y sal del bucle sólo si repites "
                + "dos números pares seguidos");
        int suma = 0, i = 1;
        int[] repetidos = new int[2];
        repetidos[0] = -1;
        repetidos[1] = -1;
        boolean continuar = true;
        while (continuar) {
            System.out.println("Introduce un número: ");
            int numero = entrada.nextInt();
            suma += numero;
            if (i % 2 == 0) {
                repetidos[0] = numero;
            } else {
                repetidos[1] = numero;
            }
            if (repetidos[0] == repetidos[1]) {
                continuar = false;
            }
            i++;
        }
        System.out.println("Programa finalizado;");
    }

// 20'
// Buscar un número en un array
    public static void ejercicio2() {
        int[] miArray = {2, 4, 23, 8, 13, 9, 10, 5};
        System.out.println(Arrays.toString(miArray));
        int encontrar = ThreadLocalRandom.current().nextInt(1, 26);
        boolean esta = buscaNum(miArray, encontrar);
        if (esta) {
            System.out.println("El número " + encontrar + " está en el array");
        } else {
            System.out.println("El número " + encontrar + " NO está en el array");
        }
    }

    public static boolean buscaNum(int[] miArray, int encontrar) {
        boolean resultado = false;
        int i = 0;
        while (i < miArray.length) {
            if (miArray[i] == encontrar) {
                resultado = true;
            }
            i++;
        }

        return resultado;
    }

    // 20'
    // Crear una función creaArray que pregunte al usuario 
    // por el tamaño del Array (presuponemos que el usuario va
    // a meter un número mayor de 1) y cree un array con la mitad
    // de números positivos y la mitad de números negativos.
    // Si el array tiene un tamaño impar, se meterá un número 
    // negativo más que de positivos
    public static int[] creaArray() {
        System.out.println("Por favor, introduzca un tamaño: ");
        int longitud = entrada.nextInt();
        int[] array = new int[longitud];
        int cantidad = (int) longitud / 2;
        for (int i = 0; i < array.length; i++) {
            if (i < cantidad) {
                array[i] = ThreadLocalRandom.current().nextInt(1, 101);
            } else {
                array[i] = ThreadLocalRandom.current().nextInt(-100, 0);
            }
        }

        return array;
    }

    // 20'    
    // Crear la función divideArray que, dado un array de
    // enteros, devuelva otro de la siguiente forma:
    // en la primera posición tendremos un array con los números 
    // negativos y en la segunda tendremos otro array con los
    // números positivos.
    // Este array, evidentemente, será bidimensional.
    // En este ejercicio habrá que usar la función del 
    // ejercicio3 creaArray para crear el array inicial.
    public static int[][] divideArray(int[] misNums) {
        int longuitud = (int) misNums.length / 2;
        int[] arrayPositivos = new int[longuitud];
        int[] arrayNegativos;
        if (misNums.length % 2 != 0) {
            arrayNegativos = new int[longuitud+1];
        } else {
            arrayNegativos = new int[longuitud];
        }
        for (int i = 0 , z = 0; i < misNums.length; i++) {
            if (i < longuitud) {
                arrayPositivos[i] = misNums[i];
            } else {
                arrayNegativos[z] = misNums[i];
                z++;
            }
        }
//        System.out.println(arrayPositivos.length);
//        System.out.println(arrayNegativos.length);
//        System.out.println(Arrays.toString(arrayPositivos));
//        System.out.println(Arrays.toString(arrayNegativos));

        int[][] PositivosNegativos = new int[2][arrayNegativos.length];
        
            for (int j = 0; j < arrayPositivos.length; j++) {
                PositivosNegativos[0][j] = arrayPositivos[j];
            }
            for (int j = 0; j < arrayNegativos.length; j++) {
                PositivosNegativos[1][j] = arrayNegativos[j];
            }
            int[] array = Arrays.copyOfRange(arrayPositivos,0 ,arrayPositivos.length-1);
            int[] array2 = Arrays.copyOfRange(arrayNegativos,0 ,arrayNegativos.length-1);


   

        return PositivosNegativos;
    }

    // Esta función no se toca
    public static void recorreArrayBidi(int[][] miArray) {
        for (int[] is : miArray) {
            for (int i : is) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}
