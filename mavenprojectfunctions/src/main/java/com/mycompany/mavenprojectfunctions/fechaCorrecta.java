/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenprojectfunctions;

/**
 *
 * @author Lucas
 */
import java.util.Scanner;

public class fechaCorrecta { //Este ejercicio seria aplicando funciones.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca el día que quiere");
        byte day = input.nextByte();
        System.out.println("Introduzca el mes que quiere");
        byte month = input.nextByte();
        System.out.println("Introduzca el años que quiere");
        int year = input.nextInt();
        if (fechaCorrecta(day, month, year)) {
            System.out.println("La fecha es correcta");
        } else {
            System.out.println("La fecha es incorrecta");
        }
    }

    public static boolean fechaCorrecta(byte day, byte month, int year) {
        boolean fechaCorrecta = true;

        if ((checkYearBisiesto(year)) && (day == 29) && (month == 2)) {
            return true;
        }
        if (!checkDay(month, day)) {
            fechaCorrecta = false;
        }
        if (!checkMonth(month)) {
            fechaCorrecta = false;
        }
        if (!checkYear(year)) {
            fechaCorrecta = false;
        }
        return fechaCorrecta;
    }

    public static boolean checkYearBisiesto(int year) {
        boolean result = false;
        if (year % 4 == 0 && (year >= 0 && year <= 2024)) {
            result = true;
        }
        return result;
    }

    public static boolean checkMonth(byte month) {
        boolean result = false;
        if (0 < month && month <= 12) {
            result = true;
        }
        return result;
    }

    public static boolean checkDay(byte month, byte day) {
        boolean result = false;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                if (1 <= day && day <= 31) {
                    result = true;
                }
                break;
            case 4, 6, 9, 11:
                if (1 <= day && day <= 30) {
                    result = true;
                }
                break;
            case 2:
                if (1 <= day && day <= 28) {
                    result = true;
                }
                break;
            default:
                break;

        }
        return result;
    }

    public static boolean checkYear(int year) {
        boolean result = false;
        if (year >= 0 && year <= 2024) {
            result = true;
        }
        return result;
    }
}
