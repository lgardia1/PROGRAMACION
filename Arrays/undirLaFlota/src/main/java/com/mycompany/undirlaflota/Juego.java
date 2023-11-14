/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.undirlaflota;

/**
 *
 * @author Lucas
 */
import java.util.Scanner;

public class Juego {

    public static void main(String[] args) {
        //Creo una instancoa como objeto barco, ademas meto 2 atributos de la posicion del barco.
        Barco barco = new Barco(2, 4);
        //Creo una instancioa como objeto tablero, además meto 2 atributos de las dimensiones del tablero.
        Tablero tablero = new Tablero(5, 5);
        tablero.imprimirTablero();
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("¿Donde quieres disparar?");
            System.out.print("X:");
            int x = input.nextInt();
            System.out.print("Y:");
            int y = input.nextInt();
            tablero.Disparar(x, y, barco.fila, barco.getColumna());
            tablero.imprimirTablero();
        } while (tablero.Ganar() == false);
    }
}
