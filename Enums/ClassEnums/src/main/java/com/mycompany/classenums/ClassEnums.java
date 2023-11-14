/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.classenums;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ClassEnums {
//Fuera del main 

    enum Level {
        HIGH, MEDIUM, LOW, NOLEVEL
    }

    enum SpanishFruitAmount {
        UNKILO, MEDIOKILO, UNCUARTO, CUARTOYMITAD, UNPUÑAILLO, UNMANOJILLA, UNAMITITILLA , UNKNOWN
    }
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        exercise1();//Definir y usar una variable de tipo level
        exercise2();//Reccorer las concstantes de  level.
        Level amount = exercise3();//Preguntar al usaurio por un nivel y lo devuelvo
        //correspoendiente al nivel introducido
        //1ª mostrar el cotenido de amount
        System.out.println(amount.toString());
        //2º crear una funcion que me deveuelva a el valor del tipo numerado en forma de String.
        String cadena = translate(amount);
        System.out.println("My level is: " + cadena);
        //HomeWork:
        /*
    Crear las siguente funciones :
    1.-PedirCantidad: pide la cantidad al usuario y la devuelve.
    2.-GuaradarCantidad: traduce la cantidad en de String a un tipo SpanishFruitAmount.
    3.-TranslateAmount: traduce un SpanishAmount a Sring.
    Advanced: Crear una traducción entre un SpanishAmount y otro enum llamado InterAmount.
         */
        String cantidad = pedirCantidad();
        SpanishFruitAmount cant = guardarCantidad(cantidad);
        traducirCantidad(cant);
    }

    public static void exercise1() {
        Level gas = Level.HIGH;
        switch (gas) {
            case HIGH:
                System.out.println("I have gas tank full");
                break;
            case MEDIUM:
                System.out.println("Half of gas. Look for a gas");
                break;
            case LOW:
                System.out.println("Be careful!! You've ran out of gas");
                break;
            default:
                break;
        }
    }

    public static void exercise2() {
        //Para recorrer un enum usamos foreach
        for (Level value : Level.values()) {
            System.out.println("Level: " + value);
        }
    }

    public static Level exercise3() {
        System.out.println("");
        String myGasLevel = input.nextLine();
        myGasLevel = myGasLevel.toUpperCase();
        Level gasLevel;
        switch (myGasLevel) {
            case "BAJO":
                gasLevel = Level.LOW;
                break;
            case "MEDIO":
                gasLevel = Level.MEDIUM;
                break;
            case "LLENO":
                gasLevel = Level.HIGH;
                break;
            default:
                gasLevel = Level.NOLEVEL;
                break;
        }
        return gasLevel;
    }

    public static String translate(Level gas) {
        String cad;
        switch (gas) {
            case LOW:
                cad = "LOW";
                break;
            case MEDIUM:
                cad = "MEDIUM";
                break;
            case HIGH:
                cad = "HIGH";
                break;
            case NOLEVEL:
                cad = "NOLEVEL";
                break;
            default:
                cad = "Valor incorrecto";
                break;
        }
        return cad;
    }

    public static String pedirCantidad() {
        System.out.println("Introduzca la cantidad");
        System.out.println();
        String cantidad = input.nextLine();
        return cantidad;
    }

    public static SpanishFruitAmount guardarCantidad(String cantidad) {
        boolean continuar = false;
        SpanishFruitAmount cant;
        cantidad = cantidad.toUpperCase();
        do {
            switch (cantidad) {
                case "UNKILO":
                    cant = SpanishFruitAmount.UNKILO;
                    break;
                case "MEDIOKILO":
                    cant = SpanishFruitAmount.MEDIOKILO;
                    break;
                case "UNCUARTO":
                    cant = SpanishFruitAmount.UNCUARTO;
                    break;
                case "CUARTOYMITAD":
                    cant = SpanishFruitAmount.CUARTOYMITAD;
                    break;
                case "UNPUÑAILLO":
                    cant = SpanishFruitAmount.UNPUÑAILLO;
                    break;
                case "UNAMANOJILLA":
                    cant = SpanishFruitAmount.UNMANOJILLA;
                    break;
                case "UNAMITITILLA":
                    cant = SpanishFruitAmount.UNAMITITILLA;
                    break;
                default:
                    System.out.println("ERROR,Escribe de nuevo la cantidad");
                    continuar = true;
                    cant = SpanishFruitAmount.UNKNOWN;
                    cantidad = pedirCantidad();
                    break;
            }
        } while (continuar);
        return cant;
    }

    public static void traducirCantidad(SpanishFruitAmount cant) {
        System.out.println("La cantidad es: " + cant);
    }
}
