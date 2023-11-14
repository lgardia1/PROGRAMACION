/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.apifechas;

/**
 *
 * @author Lucas
 */
import java.time.LocalDate; //api para fecha
import java.time.LocalDateTime;
import java.time.LocalTime; //api para hora
import java.time.format.DateTimeFormatter;
public class ApiFechas {

    public static void main(String[] args) {

        workingWithDates();
        

    }

    public static void workingWithDates() {
        LocalDate myDate = LocalDate.now();
        LocalTime myTime = LocalTime.now();
        LocalDateTime completeDate = LocalDateTime.now();

        System.out.println("Date " + myDate);
        System.out.println("Time " + myTime);
        System.out.println("Complete date " + completeDate);

        //Formato para fecha y hora completp
        DateTimeFormatter sDate = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        //formato para fecha - otro formato
        DateTimeFormatter formatDay = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter anotherFormatDay = DateTimeFormatter.ofPattern("E, MMM dd yyyy");

        //Usando W
        DateTimeFormatter anotherFormatDay2 = DateTimeFormatter.ofPattern("W");

        //formato para hora
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Spanish date : " + completeDate.format(sDate)); //formato completo
        System.out.println("Only date : " + myDate.format(formatDay));
        System.out.println("Only date spanish : " + myDate.format(anotherFormatDay));
        System.out.println("Only Time " + myTime.format(formatTime));

        System.out.println("Semana nº : " + completeDate.format(anotherFormatDay2));
        
        //Formato para día 
        DateTimeFormatter formatDay3 = DateTimeFormatter.ofPattern("d");
        System.out.println("Day : "+completeDate.format(formatDay3));
       
    }
}
