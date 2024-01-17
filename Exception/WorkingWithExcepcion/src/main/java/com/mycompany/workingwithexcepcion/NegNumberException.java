/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.workingwithexcepcion;

/**
 *
 * @author DAW
 */
public class NegNumberException extends Exception{

    public NegNumberException() {
        super("Negative number are forbidden!!");
    }

    public NegNumberException(String message) {
        super(message);
    }
    
}
