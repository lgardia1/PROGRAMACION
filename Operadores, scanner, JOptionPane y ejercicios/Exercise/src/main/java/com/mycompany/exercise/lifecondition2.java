/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise;

/**
 *
 * @author lgard
 */
import javax.swing.JOptionPane;
public class lifecondition2 {
    public static void lifeCondition2(){
       
     int edad = edades();
        
    if (edad>=18){
        party();
    }else {
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

    float money = Float.parseFloat(JOptionPane.showInputDialog("¿Cuanto dinero tienes?"));
    if (money>=15){
        JOptionPane.showMessageDialog(null, "Vas a la discoteca");
        float resto = (float) money - 15;
            if (resto>=3){
                JOptionPane.showMessageDialog(null, "Te compras una cola");
           }else {
                JOptionPane.showMessageDialog(null, "No puedes comprate una cola");
    }
    }else{
        JOptionPane.showMessageDialog(null, "No vas a la discoteca");
        JOptionPane.showMessageDialog(null, "Vuelves a tu casa y te acuestas");
        System.exit(0);
    }
    
    boolean dj = Boolean.parseBoolean(JOptionPane.showInputDialog("¿El DJ ha puesto a Tiësto? True/false"));
            
    if (dj){
        JOptionPane.showMessageDialog(null, "Te pones a bailar toda la noche");
        JOptionPane.showMessageDialog(null,"Despues de una noche movidita te acuestas");
    }else {
        JOptionPane.showMessageDialog(null, "No bailas en toda la noche");
        JOptionPane.showMessageDialog(null,"Despues de una noche penosa te acuestas");
        }
     
    }
    
    public static void cinema(){
    boolean avatar = Boolean.parseBoolean(JOptionPane.showInputDialog("¿Esta Avatar 2?"));
    
    float money = Float.parseFloat(JOptionPane.showInputDialog("¿Cuanto dinero tienes?"));
    
    if (avatar == true & money>=8){
        JOptionPane.showMessageDialog(null, "Te ves Avatar 2");
        JOptionPane.showMessageDialog(null, "Te tomas un helado");
        JOptionPane.showMessageDialog(null, "Se hace de noche y te vas a casa a dormir");
    }else if (money>15){
        JOptionPane.showMessageDialog(null, "Te ves Avatar 2");
        JOptionPane.showMessageDialog(null, "Te tomas un helado");
        JOptionPane.showMessageDialog(null, "Se hace de noche y te vas a casa a dormir");    
    }else{
            JOptionPane.showMessageDialog(null, "Se hace de noche y te vas a casa a dormir");
            JOptionPane.showMessageDialog(null, "Se hace de noche y te vas a casa a dormir");
    }
    }
    }
    
