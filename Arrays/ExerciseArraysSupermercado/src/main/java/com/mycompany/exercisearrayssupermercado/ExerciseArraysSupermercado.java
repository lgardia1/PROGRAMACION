/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercisearrayssupermercado;

/**
 *
 * @author Lucas
 */
public class ExerciseArraysSupermercado {

    public static void main(String[] args) {
        supermercado();
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
        String[] productos = inicializarProductos();
        float[] precios = inicializarPrecios();
        mostrarLista(precios, productos);
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
        for (int i = 0; i < precios.length; i++) {
            System.out.println(productos[i] + " " + precios[i] + " €");
        }
    }

    public static float mostrarTotal(float[] precios) {
        float resultado = 0;
        for (int i = 0; i < precios.length; i++) {
            resultado = resultado + precios[i];
        }
        System.out.printf("Total %.2f €\n", resultado);
        return resultado;
    }

    public static float IVA(float precioTotal) {
        float iva = 1.21f;
        float precioIVA = (iva * precioTotal);
        System.out.printf("Tiene un IVA de: %.2f €", precioIVA);
        return precioIVA;
    }
    /*
    Variante mas dificil:
    Pedir al usuario que introduzca los productos y sus precios respectivamente
     */
}
