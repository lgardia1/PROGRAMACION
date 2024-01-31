/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mycollections;

import java.util.ArrayList;

/**
 *
 * @author prolu
 */
public class MyCollections {

    public static void main(String[] args) {
       System.out.println("Arraylist of Products");
        ArrayList<Product> myProducts = new ArrayList<>();
        myProducts.add(new Product("Lemon",1.9,12));
        myProducts.add(new Product("StrawBerry",8,12));
        myProducts.add(new Product("Banana",1.5,12));
        
        System.out.println(myProducts);
        
        System.out.println(myProducts.get(4));
       
    }
    public static void showArray(Product[] myProducts){
        for (Product myProduct : myProducts) {
            System.out.println(myProduct);
        }
        System.out.println("");
        System.out.println("");
    }
}
