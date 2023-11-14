/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.undirlaflota;

/**
 *
 * @author Lucas
 */
public class Barco {
    //Varibales generales para comunicar las funciones.
    int fila;
    private int columna;
    //Aquí se guarda la posicion del barco intrducida
    //Al instanciar esta clase se ejecuta esta funcion automaticamente:
    public Barco(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }
    //Aquí se retorna la poscicion en la columna donde esta el barco.   
    public int getFila(){
    return fila;
    }
    //Aquí se retorna la poscicion en la columna donde esta el barco.   
    public int getColumna(){
    return columna;
    }
    
}
