package com.mycompany.mathematicaloperators;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lucas
 */
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Operators2 {
    public static void main(String[] args){
//postPreIncrements();
//relationalOperator();
randomnumber();
   }
   public static void postPreIncrements(){
//Operator posIncrements; a++ (Decremento): a--
//Operator preIncrements; ++a (Decremento): --a

int a = 8;
int b = 2;
a++;
System.out.println("a contains "+a);
++b;
System.out.println("b contains b "+b);
System.out.println("Postincremento y asignación");
a = 8;
b = 2;
a = b++;
System.out.println("a: "+a);
System.out.println("b: "+b);

System.out.println("Preincremento y asignación");

a = 8;
b = 2;
a = ++b;
System.out.println("a: "+a);
System.out.println("b: "+b);

a = 8;
b= 2;
//NEVER NEVER NEVER NEVER
int c = a+++b-++b-a--;
//BETER DO  a++; a + b;
System.out.print("c: "+c);
   }
   public static void relationalOperator(){
       boolean a = true;
       boolean b = false;
       System.out.println("Operaciones condicionales");
       System.out.println("OR "+ (a||b) );
//       System.out.println("AND "+(ab));
//       System.out.println("NOT "+(ab));
//       System.out.println("XOR "(ab));
   }
 public static void randomnumber(){
 Scanner input = new Scanner(System.in);
 System.out.println("Introduzca el máximo: ");
 int max = input.nextInt();
 System.out.println("Introduzca mínimo: ");
 int min = input.nextInt();
 //Generamos números aleatorios entre 0 y max
 int rnd1 = ThreadLocalRandom.current().nextInt(min,max);
 System.out.println("Random number is: "+rnd1);
 }
}
