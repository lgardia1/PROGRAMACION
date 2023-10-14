/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise;

/**
 *
 * @author prolu
 */
import javax.swing.JOptionPane;

public class lifeconditions {

    public static void exerciseLifeConditions() {
      
        int edad = edades();

        if (edad >= 18) {
            party();
        } else {
            cinema();
        }
    }

    public static int edades() {
        int edad = 0;

        while (true) {
            String input = JOptionPane.showInputDialog("¿Cual es su edad? 1 al 100");

            try {
                edad = Integer.parseInt(input);

                if (edad >= 1 && edad <= 100) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "La edad no es válida");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingresa una edad válida.");
            }
        }

        return edad;
    }

    public static void party() {

        boolean money = Boolean.parseBoolean(JOptionPane.showInputDialog("¿Tienes dinero? True/false"));
        if (money) {
            JOptionPane.showMessageDialog(null, "Te tomas una cola");
        } else {
            JOptionPane.showMessageDialog(null, "No te tomas una cola");
        }

        boolean dj = Boolean.parseBoolean(JOptionPane.showInputDialog("¿El DJ ha puesto a Tiësto? True/false"));

        if (dj) {
            JOptionPane.showMessageDialog(null, "Te pones a bailar toda la noche");
            JOptionPane.showInputDialog("Despues de una noche movidita te acuestas");
        } else {
            JOptionPane.showMessageDialog(null, "No bailas en toda la noche");
            JOptionPane.showInputDialog("Despues de una noche penosa te acuestas");
        }

    }

    public static void cinema() {
        boolean avatar = Boolean.parseBoolean(JOptionPane.showInputDialog("¿Esta Avatar 2? True/false"));
        if (avatar) {
            JOptionPane.showMessageDialog(null, "Me veo Avatar 2");
            JOptionPane.showMessageDialog(null, "Te tomas un helado");
            JOptionPane.showMessageDialog(null, "Se hace de noche y te vas a casa a dormir");
        } else {
            JOptionPane.showMessageDialog(null, "Me voy a la bolera");
            JOptionPane.showMessageDialog(null, "Se hace de noche y te vas a casa a dormir");
        }
    }
}
