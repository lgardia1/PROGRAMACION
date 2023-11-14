/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ajedrez;

/**
 *
 * @author Lucas
 */
public class Tablero {

    char[][] tablero;
    public Tablero() {
        tablero = new char[9][9];
        char numero = '8' + 1;
        char letra = 'a' - 1;
        for (int i = 0; i < tablero.length ; i++) {
            for (int j = 0; j < tablero[i].length ; j++) {
                if ((i == 0 || i == 1 || i == 6 || i == 7)&& j>0){
                    tablero[i][j] = 'p';
                }else if(j==0 && i<8){
                    numero = (char) (numero-1);
                    tablero[i][j] = numero;
                }else if(j>0 && i ==8){
                    letra = (char) (letra+1);
                    tablero[i][j] = letra;
                }else{
                    tablero[i][j] = '-';
                }
            }
        }
    }
    public char[][] actualizarMovimientos(int coordenadaXinicial , int coordenadaYinicial, int coordenadaXfinal , int coordenadaYfinal){
        tablero[coordenadaYinicial][coordenadaXinicial] = '-';
        tablero[coordenadaYfinal][coordenadaXfinal] = 'p';
        return tablero;
    }
    public void imprimirTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
