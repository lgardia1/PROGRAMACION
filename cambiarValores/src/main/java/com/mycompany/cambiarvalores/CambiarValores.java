/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.cambiarvalores;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class CambiarValores {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca un número");
        BigInteger num = input.nextBigInteger();
        int digitos = 0;
        while(!num.equals(BigInteger.valueOf(0))){
        digitos++;
        num = num.divide(BigInteger.valueOf(10));
            System.out.println(num);
        }
        System.out.println("Tiene "+digitos+" digitos");
    }
    }
