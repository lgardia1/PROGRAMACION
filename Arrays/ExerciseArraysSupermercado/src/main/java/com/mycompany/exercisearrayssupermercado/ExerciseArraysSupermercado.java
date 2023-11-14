/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercisearrayssupermercado;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ExerciseArraysSupermercado {

    public static void main(String[] args) {
//        supermercado();
        varianteSupermercado();
    }

    public static void supermercado() {
        /*SUPERMERCADO
        Estamos en un supermercado.Tenemos que hacer lo para cada cliente que entra, tenemmos que:
        Mostrar su lista de la compra con los precios 
        Mostrar finalmente en total
        Debajo ponemos el 21% de IVA
        Por ultimo, 
        Para eso tenemos a siguient lista de precios 
        Aceitunas....2€
        Patatitas....1.80€
        Detergente....3€
        Whiskey....15.20€
        Coca cola....4.33€
        Lechuga....0.90€
        Tomate....8€
         */

        //Inicializar los arrays de productos y precios:
        String[] productos = inicializarProductos();
        float[] precios = inicializarPrecios();
        //Muestra lista:
        mostrarLista(precios, productos);
        //Muestra total sin IVA y con IVA, además devuelve el valor que muestra:
        float total = mostrarTotal(precios);
        float totalIVA = IVA(total);
    }

    public static String[] inicializarProductos() {
        String[] productos = new String[7];
        productos[0] = "Aceitunas";
        productos[1] = "Patatitas";
        productos[2] = "Detergente";
        productos[3] = "Whiskey";
        productos[4] = "Coca cola";
        productos[5] = "Lechuga";
        productos[6] = "Tomate";
        return productos;
    }

    public static float[] inicializarPrecios() {
        float[] precios = new float[7];
        precios[0] = 2f;
        precios[1] = 1.8f;
        precios[2] = 3f;
        precios[3] = 15.2f;
        precios[4] = 4.33f;
        precios[5] = 0.9f;
        precios[6] = 8f;
        return precios;
    }

    public static void mostrarLista(float[] precios, String[] productos) {
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + " " + precios[i] + " €");
        }
    }

    public static float mostrarTotal(float[] precios) {
        float resultado = 0;
        for (int i = 0; i < precios.length; i++) {
            resultado = resultado + precios[i];
        }
        System.out.printf("Total sin IVA %.2f €\n", resultado);
        return resultado;
    }

    public static float IVA(float precioTotal) {
        float iva = 0.21f;
        float precioIVA = iva * precioTotal;
        float totalIVA = precioTotal + precioIVA;
        System.out.printf("Total con IVA: %.2f €\nIVA es de: %.2f €", totalIVA, precioIVA);
        return totalIVA;
    }

    public static void varianteSupermercado() {
        /*
    Variante mas dificil:
    Pedir al usuario que introduzca los productos y sus precios respectivamente
         */

        pedirProductosPrecios();
        mostrarListaAjustada(preciosAjustados, productosAjustados);
        float total = mostrarTotalAjustado(preciosAjustados, productosAjustados);
        float totalIVA = IVA(total);
    }
    //Inicializar varibales de manera generalizada:
    static ArrayList<String> productosAjustados;
    static ArrayList<Float> preciosAjustados;

    public static void pedirProductosPrecios() {
        Scanner input = new Scanner(System.in);
        boolean z = true;
        productosAjustados = new ArrayList();
        preciosAjustados = new ArrayList();
        for (int i = 0; i < 7 && z; i++) {
            System.out.println("Intoduzca producto: ");
            String entradaProductos = input.nextLine();
            if (entradaProductos.isEmpty()) {
                z = false;
            } else {
                productosAjustados.add(entradaProductos);
                System.out.println("Inroduzca precio: ");
                float entradaPrecios = input.nextFloat();
                preciosAjustados.add(entradaPrecios);
            }
        }
    }

    public static void mostrarListaAjustada(ArrayList<Float> precios, ArrayList<String> productos) {
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i) + " " + precios.get(i) + " €");
        }
    }

    public static float mostrarTotalAjustado(ArrayList<Float> precios, ArrayList<String> productos) {
        float resultado = 0;
        for (int i = 0; i < productos.size(); i++) {
            resultado = resultado + precios.get(i);
        }
        System.out.printf("Total sin IVA %.2f €\n", resultado);
        return resultado;
    }
}
