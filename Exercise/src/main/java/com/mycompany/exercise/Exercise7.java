/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise;

/**
 *
 * @author Lucas
 */
import java.util.Scanner;
public class Exercise7 {
 public static void exercise7(){
 Scanner input = new Scanner(System.in);
 
 int horasTotal = input.nextInt();
 
 int dias = horasTotal/24;
 int semanas = (int) dias/7;
 int restoDias = dias - semanas;
 int restoHoras = horasTotal - (restoDias+semanas);
 
 System.out.println ("Hay en "+horasTotal+", "+semanas+", "+restoDias+", "+restoHoras);
 }
}
