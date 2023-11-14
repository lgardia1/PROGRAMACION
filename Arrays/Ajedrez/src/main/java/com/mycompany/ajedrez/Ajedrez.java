/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ajedrez;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Ajedrez {

    public static void main(String[] args) {
        Tablero tablero = new Tablero();
        tablero.imprimirTablero();
        int xInicial = -1 , yInicial = -1 , xFinal = -1 , yFinal = -1;
        do{
        Scanner input = new Scanner(System.in);
        System.out.println("Mover peon: ");
        String posicionInicial = input.next();
        System.out.println("Hacia la casilla: ");
        String posicionFinal = input.next();
        MovimientoPeones peon = new MovimientoPeones(posicionInicial, posicionFinal);
        xInicial = peon.getXIncial();
        yInicial = peon.getYInicial();
        xFinal = peon.getXFinal();
        yFinal = peon.getYFinal();
        }while((xInicial != xFinal) || (yInicial != yFinal+1));
        tablero.actualizarMovimientos(xInicial, yInicial, xFinal, yFinal);
        tablero.imprimirTablero();
    }
}
