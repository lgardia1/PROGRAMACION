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
        loopWhile();
        loopDoWhile();
        loopFor();
        ejemplo1();
        ejemplo2();
    }

    public static void loopWhile() {
        /*
        Al inciar el bucle while, este verifica la condición, y si es True ejecuta el código y al acabarlo esteverificara la condicion y segun el resultado
        iterara hasta que de false.
        while(CONDICION){CÓDIGO + ACTUALIZACION DE LA CONDICION (importante para evitar bucles infinitos)}
        */
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
        /*
        En esta situación el codigo del bucle se ejecuta antes que la condición, ideal para inicializar variables.
        do{CÓDIGO + ACTUALIZACION}while(condicion);
        */
        byte i = 1;
        System.out.println("Writing from 1 to 10 ");
        do {
            System.out.println(i + "");
            i++;
        } while (i <= 10);
        System.out.println("\nTE END");
    }
    public static void loopFor(){
        /*
        En este tipo de bucle permite inicializar un variable como el do while de primeras y además estableces una actualizacion y la condición,
        es más completo a diferncia de los otros que son mas simples. Es ideal usarlo dentro de bucles ya que el valor de inicializacion que tiene
        al principio hará que se retableczca a los valores predefinidos cuando este bucle se repite y su variable cambia de valor.
        for(INICIALIZACIÓN DE LA VARIABLE;CONDICIÓN;ACTUALIZACION DE LA VARIABLE){CÓDIGO}
        Si puede suprimir la inicializacion y la actualizacion de la varible:
        for(;CONDICION;){CÓDIGO}
        */
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
    public static void ejemplo1(){
        //Imprimimos números del 20 al 2 de 4 en 4.
   
        int i;
        for(i = 20 ; i>=2 ; i = i - 4){
            System.out.println(i+"");
        }
        System.out.println("\nThe END");
       //Del 50 al -50 de 3 en 3.
        for(i = 50 ; i>=-50 ; i = i - 3 ){
            System.out.println(i+"");
        }
        System.out.println("\nThe END");
    }
    public static void ejemplo2(){
        //Imprimir del 6 al 1, de manera sucesiva: 123456 12345 1234 123 12 1
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
        //Como se aprecia hay 2 bucles, el primero itera sobre las la progesion del segundo, siendo este el que dicta cada fila,
        //y el segundo bucle tiene una función en la que dicta sobre sout de cada numero representando las columnas. Este lleva
        //su progesion negativa gracias al bucle que lo contiene.
    }
}
