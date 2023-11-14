/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.fechasejercicios;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Lucas
 */
public class FechasEjercicios {

    public static void main(String[] args) {
        exercise1Date();
        exercise5Dates();
    }

    public static boolean esBisiesto(int year) {
        boolean condition = Year.of(year).isLeap();
        return condition;
    }

    public static DateTimeFormatter exercise1Date() {
        LocalDate myDate = LocalDate.parse("2023/11/08", DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("E, d 'de' MMM 'de' yyyy");
        System.out.println("Hoy es " + myDate.format(formato));
        return formato;
    }

    public static int[] exercise2Dates() {
        int[] days = new int[31];
        for (int i = 0; i < days.length; i++) {
            days[i] = i + 1;
        }
        return days;
    }

    public static int[] exercise3Dates() {
        int[] months = new int[12];
        for (int i = 0; i < months.length; i++) {
            months[i] = i + 1;
        }
        return months;
    }

    public static int exercise4Dates() {
        int randomYear = ThreadLocalRandom.current().nextInt(1600, 999999999);
        return randomYear;
    }

    public static void exercise5Dates() {
        int indiceDias = ThreadLocalRandom.current().nextInt(1, 32);
        int indiceMes = ThreadLocalRandom.current().nextInt(1, 13);
        int[] days = exercise2Dates();
        int[] months = exercise3Dates();
        int year = exercise4Dates();
        boolean isLeap = esBisiesto(year);
        LocalDate fechaAleatoria = LocalDate.of(year, months[indiceMes], days[indiceDias]);
        System.out.print("La fecha elegida a sido," + fechaAleatoria.format(exercise1Date()));
        if (isLeap) {
            System.out.println(". El año es bisiesto.");
        } else {
            System.out.println(". El año no es bisiesto.");
        }
    }
    //Ejercicios:
/*
    añoBisiesto();

    exercise1Dates(myDate); //Ex 1: Hay que poner "Hoy es Miércoles, 8 de noviembre de 2023"

    exercise2Dates(formatDay3); //Ex2: Creamos un array con los números entre 1 y 31 para los días

    exercise3Dates(); //Ex3: Creamos otro array con los meses (del 1 al 12)

    exercise4Dates(); //Ex4: Generamos un número aleatorios entre 1600 e infinito para los años 

    exercise5Dates(); //Ex5: Generamos dos números aleatorios que serán los índices de los arrays que representan los días y los meses + el año (coge el índice de las funciones anteriores)
    //luego comprobamos que la fecha sea correcta y si es correcta mostramos por pantalla ejemplo: 
    //"La fecha elegida a sido, Martes 6 de Diciembre de 1800. El año es bisiesto (o no...)"

    exercise6Dates(); //si lo podemos hacer sin enum bien, sino pueds usamos los enum que necesitamos
     */
}
