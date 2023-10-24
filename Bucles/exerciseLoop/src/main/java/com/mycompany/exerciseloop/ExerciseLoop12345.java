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
//        arbolAsteriscos();
//        numerosPares();
//        cadenaDeCaracteres();
        pedirNumero();
    }

    public static void exercise1() {
        //Imprimir del 1 al 10
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
        //Imprimir del 2 al 20, solamente los números pares.
        byte i;
        System.out.println("Writing from 20 to 2, even number ");
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
        //Del 20 al 2 en número impares.
        byte i;
        System.out.println("Writing from 20 to 2, odd number");
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
        //Cuando escriba el número 3 se cierra el programa.
        byte i;
        System.out.println("Escriba el numero 3 para acabar el programa");
        do {
            Scanner input = new Scanner(System.in);
            i = input.nextByte();
        } while (i != 3);
        System.out.println("\nTE END");
    }

    public static void exercise5() {
        //Hacer una calculadora que permita, sumar, dividir y restar.Después de dar el resultado que indique si quieres continuarusando la calculadora
        JOptionPane.showMessageDialog(null, "Calculadora inicida");
        String end = "";
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
                end = JOptionPane.showInputDialog("Aún asi puedes ¿quieres acabar aquí? FIN");
                end = end.toLowerCase();
            }
        } while (!"fin".equals(end));
        System.out.println("Calculadora acabada finalizada");
    }

    public static void exerciseLoopI() {
        //Un programa que te clacule un factorial y te imprima el prodecimiento que ha hecho para calcularlo.
        Scanner input = new Scanner(System.in);
        System.out.println("Introduca el factorial");
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
            if (attemps < 6) {   //Si llega a los 6 intentos que no me pida la entrada de teclado, como estoy haciendo un do while, no mira la condición antes de ejecutar el codigo 
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

    public static void arbolAsteriscos() {
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
        int maxFilasAsteriscos = input.nextInt();
        int espacio = maxFilasAsteriscos - 1, limiteEspacios = 0, limiteAsteriscos = 2, asteriscos = 1;
        int espacioTronco = maxFilasAsteriscos / 2, asteriscosTronco = maxFilasAsteriscos / 2, maxFilasTronco = maxFilasAsteriscos / 2;
        System.out.println("Introduzca el número de filas que tendra el arbol de asteriscos");
        //Flecha:
        for (int i = 1; maxFilasAsteriscos >= i; i++) {
            while (espacio > limiteEspacios) {
                espacio--;
                System.out.print(" ");
            }
            espacio = maxFilasAsteriscos - 1;
            limiteEspacios++;
            while (asteriscos < limiteAsteriscos) {
                asteriscos++;
                System.out.print("* ");
            }
            asteriscos = 1;
            limiteAsteriscos++;
            System.out.println("");
        }
        //Tronco:
        //La cantidad de espacios y asteriscos del tronco será la mitad de las filas que hay.
        for (int i = 1; maxFilasTronco >= i; i++) {
            while (espacioTronco > 0) {
                espacioTronco--;
                System.out.print(" ");
            }
            espacioTronco = maxFilasAsteriscos / 2;
            while (asteriscos <= asteriscosTronco) {
                asteriscos++;
                System.out.print("* ");
            }
            asteriscos = 1;
            System.out.println("");
        }
    }

    public static void numerosPares() {
        //Dados dos número, escribir todos los números pares entre ellos inclusive
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca 2 números:");
        int a, b, bucleA, bucleB; //Creamos unas variables que valen igual a la entrada de teclado de las variable a y b, se usaran para bucles y
        //la razon de esta separación es porque cuando el bucle acaba a y b con el mismo valor, eso hace que en la parte de 
        //la condicion de while nunca acabe porque no da false, cuando esta condicion esta escrita en el caso que esceibamos
        //el mismo número y nos lleve al inicio para escirbir un número que sea diferente.
        do {
            a = input.nextInt();
            b = input.nextInt();
            bucleA = a;
            bucleB = b;
            if (a == b) {
                System.out.println("Introduzca 2 numeros distintos");
            }
            if (a < b) {
                System.out.println("Los pares entre " + a + " y " + b + " son:");
                while (bucleA != bucleB) {
                    if (bucleA % 2 == 0) {
                        System.out.print(bucleA + " ");
                    }
                    bucleA++;
                }
            }
            if (b < a) {
                System.out.println("Los pares entre " + b + " y " + a + " son:");
                while (bucleB != bucleA) {
                    if (bucleB % 2 == 0) {
                        System.out.print(bucleB + " ");
                    }
                    bucleB++;
                }
            }
        } while (a == b);
        System.out.println("Fin del programa");
    }

    public static void cadenaDeCaracteres() {
        //Concadenamos una cadena de caracteres segun la veces que el usuario dicte
        Scanner input = new Scanner(System.in);
        System.out.println("Cadena de caractéres");
        String cadenaCaracteres = input.next();
        System.out.println("Número de veces que se repite");
        int numero = input.nextInt();
        for (int i = 0; i < numero; i++) {
            System.out.print(cadenaCaracteres + "");
        }
    }

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
        for (number = -1; number != 0; media++) {

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
        System.out.println("Has introducido números positivos: " + positivos);
        System.out.println("Has introducido números negativos: " + negativos);
        System.out.println("La suma aritmetica de todos los números que has introducido es de: " + sumar);
        System.out.println("La media entre todos lo números que has introducido es de: " + mediaFinal);
    }
}
