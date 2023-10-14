/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mathematicaloperators;

/**
 *
 * @author lgard
 */
import com.mycompany.mathematicaloperators.moduleOperator;
import com.mycompany.mathematicaloperators.IgnoreCase;
import com.mycompany.mathematicaloperators.NumberTernario;
import javax.swing.JOptionPane;
public class Mathematicaloperators {

    public static void main(String[] args) {
        String moduleoperator = JOptionPane.showInputDialog("¿Quieres ver las operaciones con modulos y comparaciones? Si/No");
        String si = "Si";
        if (moduleoperator.equalsIgnoreCase(si)){
        moduleOperator.moduleOperatorAndComparation();}
        
        String ignoreCase = JOptionPane.showInputDialog("¿Quieres ver como ignorar mayúsculas? Si/No");
        if (ignoreCase.equalsIgnoreCase(si)){
        IgnoreCase.equalsIgnoreCase(); 
        } 
        String numberTernario = JOptionPane.showInputDialog("¿Quieres ver la funcion Teernaria? Si/No");
        if (numberTernario.equalsIgnoreCase(si)){
        NumberTernario.exampleTernaio(); 
        } 
    }
}
