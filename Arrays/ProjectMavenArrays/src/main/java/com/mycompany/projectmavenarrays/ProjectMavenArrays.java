/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projectmavenarrays;

import java.util.Arrays;


public class ProjectMavenArrays {

    public static void main(String[] args) {
        //Funiones:
        arraysUno();
        
    }
    public static void arraysUno(){
        /**
         * Declaro un array de 6 elementos (cadenas de texto) 0,1,3
         */
        String[] names = new String[6];
        names[0]="Pepa";
        names[1]="Pig";
        names[3]="Pepita";
        names[2]=" ";
        
        System.out.println(names[1]);
        
        /**
         * Recorremos todo el array para mostrar por pantalla todos
         * los elementos
         */
        for (String myName : names) {
            System.out.println(myName);
        }
        //Otra forma de mostrar todo en un array
        System.out.println(Arrays.toString(names));
        
        //Formas de inicializar los valores
        String[] friends = {"Silvia" , "Luis" ,"" , "Vicente"};
        System.out.println("I have "+friends.length + " fiends :");
        
        for (int i = 0; i < friends.length; i++) {
            System.out.println(friends[i]);
        }
        //Rellenar los arrays con bucles 
        int[] evenNumbers = new int [10];
        int num=0;
        for (int i = 0; i < evenNumbers.length; i++) {
            evenNumbers[i]=num;
            num = num+2;
        }
        System.out.println(Arrays.toString(evenNumbers));
    }

}
