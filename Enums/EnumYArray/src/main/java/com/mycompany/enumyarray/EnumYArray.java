/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.enumyarray;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class EnumYArray {

    enum note {
        MuyDeficiente, Deficiente, Insuficente, Suficiente, Bien, Notable, Sobresaliente, MatriculaHonor ,
        UNKNOWN
    }
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        float[] nota = pedirNota();
        int[] porcentaje = pedirPorcentaje();
        float notaFinal = calcularNota(nota, porcentaje);
        resultado(notaFinal);
    }

    public static float[] pedirNota() {
        System.out.println("Introduce las notas: ");
        float[] nota = new float[3];
        for (int i = 0; i < nota.length; i++) {
            float pedir = input.nextFloat();
            nota[i] = pedir;
        }

        return nota;
    }

    public static int[] pedirPorcentaje() {
        System.out.println("Introduce los porcentajes: ");
        int[] porcentaje = new int[3];
        for (int i = 0; i < porcentaje.length; i++) {
            int pedir = input.nextInt();
            porcentaje[i] = pedir;
        }

        return porcentaje;
    }

    public static float calcularNota(float[] nota, int[] porcentaje) {
        float notaFinal = 0;
        float porcentajeFloat;
        for (int i = 0; i < nota.length; i++) {
            porcentajeFloat = porcentaje[i]/100f;
            notaFinal = (nota[i] * porcentajeFloat + notaFinal);
        }

        return notaFinal;
    }

    public static void resultado(float nota) {
        note resultado;
        int notaFinal;
        boolean continuar;
        do {
            continuar = false;
            notaFinal = (int) (Math.round(nota));

            switch (notaFinal) {
                case 0, 1, 2:
                    resultado = note.MuyDeficiente;
                    break;
                case 3:
                    resultado = note.Deficiente;
                    break;
                case 4:
                    resultado = note.Insuficente;
                    break;
                case 5:
                    resultado = note.Suficiente;
                    break;
                case 6, 7:
                    resultado = note.Bien;
                    break;
                case 8:
                    resultado = note.Notable;
                    break;
                case 9:
                    resultado = note.Sobresaliente;
                    break;
                case 10:
                    resultado = note.MatriculaHonor;
                    break;
                default:
                    System.out.println("EROOR\n Introdce de nuevo la Nota:");
                    resultado = note.UNKNOWN;
                    nota = (float)(calcularNota(pedirNota(), pedirPorcentaje()));
                    continuar = true;
                    break;
            }
        } while (continuar);
        System.out.println("Tienes un " + resultado);
    }
}
