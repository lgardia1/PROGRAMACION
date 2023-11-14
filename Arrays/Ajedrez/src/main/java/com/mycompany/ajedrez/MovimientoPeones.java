/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ajedrez;

/**
 *
 * @author Lucas
 */
public class MovimientoPeones {

    private char xInicialCaracter;
    private char yIniclaCaracter;
    private char xFinalCaracter;
    private char yFinalCaracter;

    public MovimientoPeones(String posicionInical, String posicionFinal) {
        char[] posicionCaracterInicial = new char[2];
        posicionCaracterInicial = posicionInical.toCharArray();

        char[] posicionCaracterFinal = new char[2];
        posicionCaracterFinal = posicionFinal.toCharArray();

        if (posicionCaracterInicial.length == 2 && posicionCaracterFinal.length == 2) {

            this.xInicialCaracter = posicionCaracterInicial[0];

            this.yIniclaCaracter = posicionCaracterInicial[1];

            this.xFinalCaracter = posicionCaracterFinal[0];

            this.yFinalCaracter = posicionCaracterFinal[1];

            determinarCoordenada();

        } else {
            xInicial = -1;
            yInicial = -1;
            xFinal = -1;
            yFinal = -1;
        }
    }

    private int xInicial;
    private int yInicial;
    private int xFinal;
    private int yFinal;

    public void determinarCoordenada() {
        xInicial = (int) xInicialCaracter;
        xInicial = xInicial - 96;

        yInicial = Character.getNumericValue(yIniclaCaracter);
        yInicial = 8 - yInicial;

        xFinal = (int) xFinalCaracter;
        xFinal = xFinal - 96;

        yFinal = Character.getNumericValue(yFinalCaracter);
        yFinal = 8 - yFinal;
    }

    public int getXIncial() {
        return xInicial;
    }

    public int getYInicial() {
        return yInicial;
    }

    public int getXFinal() {
        return xFinal;
    }

    public int getYFinal() {
        return yFinal;
    }
}
