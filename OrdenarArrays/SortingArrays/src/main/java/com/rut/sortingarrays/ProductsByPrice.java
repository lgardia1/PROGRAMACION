/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rut.sortingarrays;

import java.util.Comparator;

/**
 *
 * @author Rut
 */
public class ProductsByPrice implements Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPvp() < o2.getPvp()) return -1;
        else if (o1.getPvp() == o2.getPvp()) return 0;
        else return 1;
    }
    
}
