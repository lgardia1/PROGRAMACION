/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conditionalstatements;

/**
 *
 * @author Lucas
 */
import java.util.Scanner;
public class caseSwitch1 {
    
    public static void exampleCaseSwitch(){
    Scanner input = new Scanner(System.in);
    String month = "";
    System.out.println("Please, type a numeber between 1 and 12");
    int number = input.nextInt();
    
    switch (number){
        case 1: month = "January";
                break;
        case 2: month = "February";
                break;
        case 3: month = "March";
                break;
        case 4: month = "April";
                break;
        case 5: month = "May";
                break;
        case 6: month = "June";
                break;
        case 7: month = "July";
                break;
        case 8: month = "August";
                break;
        case 9: month = "September";
                break;
        case 10: month = "October";
                break;
        case 11: month = "November";
                break;
        case 12: month = "Dicember";
                break;
        default: System.out.println("ERROR, escibre de nuevo el mes");
    }
    System.out.println("Has introducido "+ number +"por lo que es"+ month);
}
}
