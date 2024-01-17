/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exceptionexercise;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class ExceptionExercise {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
       try{
          myException();
       }catch(NumberGreaterException e){
           System.out.println(e.getMessage());
       }
    }
    public static void myException() throws NumberGreaterException{
        int n = input.nextInt();
        try{
            if(n>=500) throw new GiantNumberException();
        }catch(GiantNumberException ex){
            System.out.println(ex.getMessage());
        }try{
            if(n>=200) throw new NumberGreaterException();
        }catch(NumberGreaterException ex){
            System.out.println(ex.getMessage());
    }
    } 
}
