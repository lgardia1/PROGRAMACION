 
package com.mycompany.workingwithexcepcion;

import java.util.Scanner;

public class WorkingWithExcepcion {
    static int MIN = 2;
    static int MAX = 9;
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
       try{
           myOwnException2();
       }catch(NegNumberException e){
           System.out.println(e.getMessage());
       }
    }
    //Esta es la segunda forma
    public static void myOwnException2() throws NegNumberException{
        System.out.println("Working with myOwnException2");
        System.out.println("Type a number between " + MIN + " " + MAX);
        int n = input.nextInt();
        try{
            if (n < MIN || n> MAX){
                //Lanzo excepcion personalizada
            throw new NumberOutOfBoundsException();
            }
        }catch(NumberOutOfBoundsException error){
            System.out.println(error.getMessage());
        }try{
            if(n<0) {throw new NegNumberException();}
        }catch(NegNumberException error){
            System.out.println(error.getMessage());
        }
    }
}
