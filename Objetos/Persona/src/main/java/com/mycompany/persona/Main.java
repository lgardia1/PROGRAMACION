/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.persona;

/**
 *
 * @author prolu
 */
public class Main {

    public static void main(String[] args) {
        String[] nombre = {"Ruth" , "Rafa" , "Marcos" , "Thomas" , "Angela"};
        String[] DNI = {"00918029F" , "72438182G" , "16493509W" , "08965378R" , "96914412W"};
        String[] genero = {"femenino","masculino" ,"masculino","masculino","masculino", "femenino"};
        int[] edad = { 22 , 17 ,18 , 20 , 50};
        Persona[] personas = {
                new Persona(nombre[0] , DNI[0] , genero[0], edad[0]),
                new Persona(nombre[1] , DNI[1] , genero[1], edad[1]) ,
                new Persona(nombre[2] , DNI[2] , genero[2], edad[2]),
                new Persona(nombre[3] , DNI[3] , genero[3], edad[3]) ,
                new Persona(nombre[4] , DNI[4] , genero[4], edad[4])
        };
        for(int i = 0 ; i < personas.length ; i++){
            System.out.println(personas[i]);
        }
    }
}
