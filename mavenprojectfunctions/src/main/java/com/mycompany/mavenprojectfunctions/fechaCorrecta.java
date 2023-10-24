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
public class fechaCorrecta {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        System.out.println("Introduzca el día que quiere");
        byte day = input.nextByte();
        System.out.println("Introduzca el mes que quiere");
        byte month = input.nextByte();
        System.out.println("Introduzca el años que quiere");
        int year = input.nextByte();
        if(fechaCorrecta(day , month , year)){
            System.out.println(""); 
        }else{
            System.out.println("");
        }}
    public static boolean fechaCorrecta(byte day, byte month, int year){
        boolean fechaCorrecta = false;
        boolean monthCondition = false , dayCondition = false , yearCondition = false;
        if ((checkDayBisiesto(year)) && (0<day && day<=29) && (month==2)){
            if (checkMonth(month)){
            monthCondition = true;
        }
            if (checkDayBisiesto(day)){
            dayCondition = true;
        }
             if (checkYear(year)){
            yearCondition = true;
        }
        }else{
            fechaCorrecta = true;
        }
        if (yearCondition && monthCondition && dayCondition){
            
        }
    }        
    public static boolean checkYearBisiesto(int year){
       boolean result = false;
       if (year%4==0){
           result = true;
       }
       return result;
    }
    public static boolean checkMonth(byte month){
        boolean result = false;
        if (month<=12){
            result = true;
        }
        return result;
    }
    public static boolean checkDay(byte month , byte day){
        boolean result = false;
        switch (month){
            case 1 , 3 , 5 , 7 , 8 , 10 , 12:
                if (1<=day && day<=31){
                    result = true;
                }
                break;
            case 4 , 6 , 9 , 11:
                if (1<=day && day<=30){
                    result = true;
                }
                break;
            case 2:
                if (1<=day && day<=28){
                    result = true;
                }
                break;
            default:
                break;
                
        }   
    }
    public static boolean checkYear(int year){
        boolean result = false;
        if(year>=0){
            result = true;
        }
        return result;
    }
}
