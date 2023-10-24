/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenprojectfunctions;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
class Aclamar {

    public static String leerCadena() {
        Scanner input = new Scanner(System.in);
        String nombre = input.next();
        return nombre;
    }

    public static int leerNumero() {
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        return numero;
    }

    public static void repetirAclamo(String nombre, int numero) {
        while (numero > 0) {
            System.out.println("¡Viva " + nombre + "!");
            numero--;
        }
    }
}

public class funcionAclamar {

    public static void main(String[] args) {
        Aclamar halagos = new Aclamar();

        System.out.println("Introduzca nombre:");
        String nombre = halagos.leerCadena();

        System.out.println("Introduzca un número:");
        int numero = halagos.leerNumero();

        halagos.repetirAclamo(nombre, numero);
    }
}