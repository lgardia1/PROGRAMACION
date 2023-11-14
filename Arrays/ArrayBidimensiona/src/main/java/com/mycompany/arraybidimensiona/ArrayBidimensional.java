/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.arraybidimensiona;

/**
 *
 * @author Lucas
 */
public class ArrayBidimensional {

    public static void main(String[] args) {
        int i = 3;
        int[][] matriz = new int[i][i];
        matriz[0][0] = 1;
        matriz[0][1] = 0;
        matriz[0][2] = 0;
        matriz[1][0] = 0;
        matriz[1][1] = 1;
        matriz[1][2] = 0;
        matriz[2][0] = 0;
        matriz[2][1] = 0;
        matriz[2][2] = 1;
        if (checkMatriz(matriz , i)) {
            System.out.println("Es simetrica");

        } else {
            System.out.println("No es simetrica");
        }
    }

    public static boolean checkMatriz(int[][] matriz , int h) {
        boolean simetrica = true;
        int[][] matriz1 = new int[h][h];
        int[][] matriz2 = new int[h][h];
        for (int i = 1 ; i < matriz.length; i++) {
            for (int j = 0; j <= i ; j++) {
                matriz1[i][j] = matriz[i][j];
                for (int z = 0; z < i; z++) {
                matriz1[i][j+z] = matriz[i][j+z];     
                }
                
            }
        }
        return simetrica;
    }
}
