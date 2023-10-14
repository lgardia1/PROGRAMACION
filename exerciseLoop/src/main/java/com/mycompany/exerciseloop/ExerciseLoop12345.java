/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exerciseloop;

/**
 *
 * @author Lucas
 */
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

public class ExerciseLoop12345 {

    public static void main(String[] args) {
//        exercise1();
//        exercise2();
//        exercise3();
//        exercise4();
//        exercise5();
//        exerciseLoopI();
//        pedirNumero();
//        cajaFuerte();
//        cajaFuerteVariable();
//        numeroAdivinanza();
arbolAsteriscos();
//pedirNumero();
    }

    public static void exercise1() {
        byte i;
        System.out.println("Writing from 1 to 10 ");
        i = 10;
        while (i >= 1) {
            System.out.println(i + "");
            i--;
        }
        System.out.println("\nTE END!");
    }

    public static void exercise2() {
        byte i;
        System.out.println("Writing from 1 to 10 ");
        i = 2;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i + "");
            }
            i++;
        }
        System.out.println("\nTE END!");
    }

    public static void exercise3() {
        byte i;
        System.out.println("Writing from 1 to 10 ");
        i = 20;
        while (i >= 2) {
            if (i % 2 != 0) {
                System.out.println(i + "");
            }
            i--;
        }
        System.out.println("\nTE END!");
    }

    public static void exercise4() {
        byte i;
        System.out.println("Escriba el numero 3 para acabar el programa");
        do {
            Scanner input = new Scanner(System.in);
            i = input.nextByte();
        } while (i != 3);
        System.out.println("\nTE END");
    }

    public static void exercise5() {
        JOptionPane.showMessageDialog(null, "Calculadora inicida");
        String end;
        Scanner input = new Scanner(System.in);
        do {
            String option = JOptionPane.showInputDialog("¿Que quires hacer? SUMAR/RESTAR/MULTIPLICAR/DIVIDIR");
            option = option.toLowerCase();
            if (option == "sumar" || option == "restar" || option == "dividir" || option == "multiplicar") {
                System.out.println("Escriba el primer número");
                float number1 = input.nextFloat();
                System.out.println("Escriba el segundo número");
                float number2 = input.nextFloat();
                float result = 0;
                switch (option) {
                    case "sumar":
                        result = number1 + number2;
                        JOptionPane.showMessageDialog(null, "El resultado es:" + result);
                        break;
                    case "restar":
                        result = number1 - number2;
                        JOptionPane.showMessageDialog(null, "El resultado es:" + result);
                        break;
                    case "multiplicar":
                        result = number1 * number2;
                        JOptionPane.showMessageDialog(null, "El resultado es:" + result);
                        break;
                    case "dividir":
                        result = number1 / number2;
                        JOptionPane.showMessageDialog(null, "El resultado es:" + result);
                        break;
                }
                end = JOptionPane.showInputDialog("¿Quieres acabar? FIN");
                end = end.toLowerCase();
            } else {
                JOptionPane.showMessageDialog(null, "ERROR, escribe bien la cadena de caractes");
                end = JOptionPane.showInputDialog("¿Aún asi puedes acabar aquí? FIN");
                end = end.toLowerCase();
            }
        } while (end != "fin");
        System.out.println("hola");
    }

    public static void exerciseLoopI() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int i = a;
        int result = 1;
        System.out.printf(a + "!\n");
        while (i >= 1) {
            result = result * a;
            System.out.print(i + " * ");
            a--;
            i--;
        }
        System.out.println("= " + result);
    }

    public static void cajaFuerte() {
        //Tenemos  una caja fuerte que deseamos abrir, bloqueada por un candado de 3 numeros 
        //pedimos al usuario que introduzca la combinacion y si es correcta, ponemos 
        //CAJA DESBLOQUEADA y si no , ponemos HAS FALLADO, SIGUE INTENTANDO
        Scanner input = new Scanner(System.in);
        int number1 = 5, number2 = 7, number3 = 8, answer1, answer2, answer3;
        System.out.println("Introduzca la combinacion de la caja fuerte");
        do {
            answer1 = input.nextInt();
            answer2 = input.nextInt();
            answer3 = input.nextInt();
            if (number1 != answer1 || number2 != answer2 || number3 != answer3) {
                System.out.println("HAS FALLADO, SIGUE INTENTANDO");
            }
        } while (number1 != answer1 || number2 != answer2 || number3 != answer3);

        System.out.println("CAJA DESBLOQUEADA");
    }

    public static void cajaFuerteVariable() {
        //VARIANTES: generar la combinación de la caja fuerte con random y además establecer un número 
        //de intentos, 5 intentos
        Scanner input = new Scanner(System.in);
        int number1, number2, number3, answer1 = -1, answer2 = -1, answer3 = -1, MIN, MAX, attemps; // Incializamos las variables answerX con -1 ya que es un numero que es dificil que se ponga en la entrada de teclado y asi evitamos problemas porque si ponemos un numero igual a la entrada de teclado funciona mal el programa.
        attemps = 0;
        MIN = 0;
        MAX = 9;
        number1 = ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
        number2 = ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
        number3 = ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
        System.out.println(number1 + " " + number2 + " " + number3);   //Esto es para que veas el codigo que se ha generado aleatoriamente del 0 al 9 incluidos : [0,9]
        do {
            attemps++;
            if (attemps < 6) {   //Si llega a los 6 intentos que no me pida la entrada de teclado 
                answer1 = input.nextInt();
                answer2 = input.nextInt();
                answer3 = input.nextInt();
                if (number1 != answer1 || number2 != answer2 || number3 != answer3) {
                    System.out.println("HAS FALLADO, SIGUE INTENTANDO");
                    System.out.println("Numero de intentos restantes: " + (5 - attemps));
                }
            }
        } while ((number1 != answer1 || number2 != answer2 || number3 != answer3) && attemps < 6);
        if (attemps == 6) {
            System.out.println("Números de intentos superado");
        } else {
            System.out.println("Caja fuerte desbloqueada");
        }
    }

    public static void numeroAdivinanza() {
        //generamos un número aleatorio que el usuario debe adivinar, cada vez que el
        //usuario introduzca un número le tenemos que dar una pista diciendo si es mayor 
        //o menor que el número a adivinar. Vamos a parar cuando el usuario introzuca un 0
        Scanner input = new Scanner(System.in);
        int randomNumber, answer = -1;
        randomNumber = ThreadLocalRandom.current().nextInt(1, 21);
        for (; randomNumber != answer;) {
            answer = input.nextInt();
            if (answer > randomNumber) {
                System.out.println("ERROR");
                System.out.println("El numero a adivinbar, es menor");
            }
            if (answer < randomNumber) {
                System.out.println("ERROR");
                System.out.println("El numero a adivinar, es mayor");
            }
        }
        System.out.println("Correcto el número es: " + randomNumber);
    }

    public static void arbolAsteriscos(){
    //Hacer un arbol de asteriscos
    /*
            *
           * *
          * * *
         * * * *
       * * * * * *
          * * *
          * * *
          * * *  
   */
    Scanner input = new Scanner(System.in);
    int cantidadAsterisco = input.nextInt();
    int espacio = cantidadAsterisco - 1 , limiteEspacio = 0 , limiteAsterisco = 2 , asterisco = 1;
    
    for(int i = 1;(cantidadAsterisco)>=i ; i++){
        while(espacio>limiteEspacio){
            espacio--;
            System.out.print(" ");
        }
        espacio = cantidadAsterisco - 1;
        limiteEspacio++;
        while(asterisco<limiteAsterisco){
            asterisco++;
            System.out.print("* ");
        }
        asterisco = 1; 
        limiteAsterisco++;
        System.out.println("");
    }
    }
   
//Dados dos número, escribir todos los números pares esntre ellos inclusive

//Concadenamos una cadena de caracteres segun la veces que el usuario dicte
  
    public static void pedirNumero() {
        /*
    Pedir al usaurio que introduzca números enteros hasta que ponga 0, el programa debe de mostrar:
    1.-Cuantos número negativos introducidos
    2.-Numeros positivos
    3.-La suma aritmetica de todos los números 
    4.-Y la media que hay entre todos.
         */
        Scanner input = new Scanner(System.in);
        int sumar, number, positivos, media, negativos;
        negativos = 0;
        media = 0;
        positivos = 0;
        sumar = 0;
        System.out.println("Introduzca números: ");
        for (number = 0; number != 0; media++) {

            number = input.nextInt();

            if (number < 0) {
                negativos++;
            }
            if (number > 0) {
                positivos++;
            }
            sumar = number + sumar;

        }
        float mediaFinal = (float) (sumar / media);
        System.out.println("Has introducido números: " + positivos);
        System.out.println("Has introducido números: " + negativos);
        System.out.println("La suma aritmetica de todos los números que has introducido es de: " + sumar);
        System.out.println("La media entre todos lo números que has introducido es de: " + mediaFinal);
    }
}
