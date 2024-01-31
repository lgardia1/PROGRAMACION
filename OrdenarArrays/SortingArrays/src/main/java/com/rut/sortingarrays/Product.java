/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rut.sortingarrays;

import java.util.Objects;

/**
 *
 * @author Rut
 */
public class Product implements Comparable {
    private String name;
    private double pvp;
    private double vat;

    public Product(String nombre, double precioCosto, double tipoIva) {
        name = nombre;
        pvp = precioCosto;
        vat = tipoIva;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPvp() {
        return pvp;
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
//        return Objects.equals(this.name, other.name);
        return this.name.equalsIgnoreCase(other.name);
//        
//        return (this.vat == other.vat 
//                && this.pvp == other.pvp );
    }

//    public int compareTo(Product p1){
//        
//    }
    
    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", pvp=" + pvp + ", vat=" + vat + '}';
    }

    @Override
    public int compareTo(Object o) {
        Product p1 = (Product) o;
//        int valueReturn;
//        if (this.pvp < p1.pvp) valueReturn = -1;
//        else if (this.pvp == p1.pvp) valueReturn = 0;
//        else valueReturn = 1;
//        return valueReturn;
        return this.name.compareToIgnoreCase(p1.name);
    }
    
 
    
    
   
}
