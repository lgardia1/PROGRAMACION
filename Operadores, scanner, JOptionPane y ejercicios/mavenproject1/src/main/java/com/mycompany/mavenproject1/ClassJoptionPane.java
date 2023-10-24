package com.mycompany.mavenproject1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lgard
 */
import javax.swing.JOptionPane;
public class ClassJoptionPane {
    public static void main(String[] args){
    
    String textstring = JOptionPane.showInputDialog("Introduce a text string: ");
    char character = JOptionPane.showInputDialog("Introduce a character"). charAt(0);
    float decimal = Float.parseFloat(JOptionPane.showInputDialog("Introduce a decimal number"));
    int whole = Integer.parseInt(JOptionPane.showInputDialog("Introduce a whole decimal number"));
    double real = Double.parseDouble(JOptionPane.showInputDialog("Introduce a real number"));
    System.out.println("Text written: "+textstring);
    System.out.println("Character written.: "+character);
    System.out.println("Decimal number written: "+decimal);
    System.out.println("Whole number written "+whole);
    System.out.print("Real number: "+real);
    }
}
