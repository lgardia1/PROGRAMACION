/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.undirlaflota;

/**
 *
 * @author Lucas
 */
public class Tablero {

    //Variables generales para que esten comunicadas las funciones.
    private char[][] mapa;
    private boolean ganar;

    //Aquí se crea el tablero.
    //Al instanciar esta clase, se ejecuta esta funcion automaticamente:
    public Tablero(int filas, int columnas) {
        mapa = new char[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                mapa[i][j] = '-';
            }
        }
    }

    //Esta funcion actualiza el tablero segun donde se ha disparado.
    //Si aciertas reescibe O en una coordenada del tablero.
    //Si fallas reescribe X en una coordenada del tablero.
    //Devuelve un boolean segun si has acertado o no.
    public char[][] Disparar(int coordenadaX, int coordenadaY, int filaBarco, int columnaBarco) {
        if (coordenadaX == filaBarco && coordenadaY == columnaBarco) {
            mapa[coordenadaX - 1][coordenadaY - 1] = 'O';
            ganar = true;
        } else {
            mapa[coordenadaX - 1][coordenadaY - 1] = 'X';
            ganar = false;
        }
        return mapa;
    }

    //Devuelve si has ganado.
    public boolean Ganar() {
        return ganar;
    }

    //Imprime el barco.
    public void imprimirTablero() {
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                System.out.print(mapa[i][j] + " ");
            }
            System.out.println();
        }
    }

}
