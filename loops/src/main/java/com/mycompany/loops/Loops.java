/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.loops;

/**
 *
 * @author Lucas
 */
public class Loops {

    public static void main(String[] args) {
//        loopWhile();
//        loopDoWhile();
//        loopFor();
        ruthPensar();
    }

    public static void loopWhile() {
        byte i;
        System.out.println("Writing from 1 to 10 ");
        i = 1;
        while (i <= 10) {
            System.out.println(i + "");
            i++;
        }
        System.out.println("\nTE END!");
    }

    public static void loopDoWhile() {
        byte i = 1;
        System.out.println("Writing from 1 to 10 ");
        do {
            System.out.println(i + "");
            i++;
        } while (i <= 10);
        System.out.println("\nTE END");
    }
    public static void loopFor(){
        int i;
        for(i = 1 ; i<=10 ; i++ ){
            System.out.println(i+"");
        }
        System.out.println("\nThe END");
    
        for(i = 10 ; i>=10 ; i-- ){
            System.out.println(i+"");
        }
        System.out.println("\nThe END");
    }
//Escribimos del 20 al 2 de 4 en 4.
    public static void positivoRuth(){
        int i;
        for(i = 20 ; i>=2 ; i = i - 4){
            System.out.println(i+"");
        }
        System.out.println("\nThe END");
// Del 50 al 50 en 3
        for(i = 50 ; i>=-50 ; i = i - 3 ){
            System.out.println(i+"");
        }
        System.out.println("\nThe END");
    }
    public static void ruthPensar(){
        byte filas , columnas , menosColumnas;
        menosColumnas = 6;
        for (filas = 1 ; filas<=6 ; filas++){
            columnas = 1;
            while (columnas <= menosColumnas){
                System.out.print(columnas+" ");
                columnas++;
            }
            System.out.println();
            menosColumnas--;
        }
    }
}
