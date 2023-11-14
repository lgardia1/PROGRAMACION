/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciosstring;

/**
 *
 * @author Lucas
 */
import java.util.Scanner;
public class EjerciciosString {
enum comida{
patatas , galletas , napolitana , bocadillo , cacahuetes , manzana
}
static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        input();
    }
    public static String input(){
        System.out.println("¿Que esta comiendo Lucas?");
        String food = input.nextLine();
    return food;
    }
    public static void check(){
    
    }
       //HomeWork:
        //Voy a pedir a l usuatio que introduzca una cadena de tipo.
        //Lucas come galletas en clase, tengo que mostrar por pantalla que come Lucas.
        //Lucas, si  no come nada, también se pone.
}
