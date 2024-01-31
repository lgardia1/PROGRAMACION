/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.rut.sortingarrays;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Rut
 */
public class SortingArrays {

    public static void main(String[] args) {
        final int NUMPRODUCTS = 5;
        Product[] products = new Product[NUMPRODUCTS];
        
        products[0] = new Product("Screw", 1.5, 10);
        products[1] = new Product("Nut", 0.9, 3.2);
        products[2] = new Product("Hammer", 9.5, 10);
        products[3] = new Product("Screwdriver", 2.5, 15);
        products[4] = new Product("Frying pan", 25, 18);
        
        showArray(products);
        
        // Ordenamos el array ASC
        Arrays.sort(products);
        
        System.out.println("ORDERED ARRAY BY NAME\n");
        showArray(products);
        
        System.out.println("ORDERED ARRAY DESC\n");
        Arrays.sort(products,Collections.reverseOrder());
        showArray(products);
        
        // Ordenamos por precio
        // Para ello tenemos que usar una nueva clase que implemente
        // Comparator
        System.out.println("ORDERED PRODUCTS BY PRICE\n");
        Arrays.sort(products,  new ProductsByPrice());
        showArray(products);
        System.out.println("ORDERED PRODUCTS BY PRICE DESC\n");
        Arrays.sort(products,Collections.reverseOrder(new ProductsByPrice()));
        showArray(products);
        
        // Ordenamos arrays de enteros
        int[] myMarks = {7,4,3,2,10};
        Arrays.sort(myMarks);
        System.out.println("Marks asc: "+ Arrays.toString(myMarks));
        
        // DESC. 
        // Collections sólo trabaja con objetos
        Integer[] myMarks2 = {7,4,3,2,10};
        Arrays.sort(myMarks2, Collections.reverseOrder());
        System.out.println("Marks asc: "+ Arrays.toString(myMarks));
        
        //Ordenación ascendente de parte del array
       String[] nombres2 = {"María","Zelda", "José", "Pepe", "Ana" , "Joaquín"};
       // Ordena desde la tercera posición a la quinta incluida, la 6 no se incluye
       Arrays.sort(nombres2,3,6, Collections.reverseOrder());
       System.out.println(Arrays.toString(nombres2));
    }
    
    public static void showArray(Product[] myProducts){
        for (Product myProduct : myProducts) {
            System.out.println(myProduct);
        }
        System.out.println("");
        System.out.println("");
    }
}
