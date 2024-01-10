package com.mycompany.testbill;

import java.time.LocalDate;

/**
 *
 * @author antho
 */
enum Products{TORNILLOS,TUERCAS,PINTURA,BOMBILLAS,TALADROS,ALAMBRE}
public class Bill {
    
    //Atributos
 
    private Products[] productos;
    private float[] precios;
    private float[] pvpUnitario; // (Advanced)
    private int[] cantidad; // (Advanced)
    private float[] subtotal; // (Advanced)
    private LocalDate fecha;

    // constructor normal
    public Bill(Products[] productos, float[] precios, LocalDate fecha) {    
        this.productos = productos;
        this.precios = precios;
        this.fecha = fecha;
    }

    // Constructor con Enum
    public Bill(Products[] productos, float[] precios, String fechaStr) {
        try {
            this.productos = productos;
            this.precios = precios;
            this.fecha = LocalDate.parse(fechaStr, java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            // (Advanced)
            this.pvpUnitario = new float[productos.length];
            this.cantidad = new int[productos.length];
            this.subtotal = new float[productos.length];
            for (int i = 0; i < productos.length; i++) {
                this.pvpUnitario[i] = obtenerPrecioUnitario(productos[i]);
                this.cantidad[i] = 3; // Se asume inicialmente una cantidad de 1
                this.subtotal[i] = this.pvpUnitario[i] * this.cantidad[i];
            }
        } catch (Exception e) {
            System.out.println("Error al crear la factura: " + e.getMessage());
        }
    }

    // Constructor con String
    public Bill(String[] productosStr, float[] precios, String fechaStr) {
        try {
            this.productos = new Products[productosStr.length];
            for (int i = 0; i < productosStr.length; i++) {
                this.productos[i] = Products.valueOf(productosStr[i].toUpperCase()); // Convertir a Enum
            }
            this.precios = precios;
            this.fecha = LocalDate.parse(fechaStr, java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            // (Advanced)
            this.pvpUnitario = new float[productos.length];
            this.cantidad = new int[productos.length];
            this.subtotal = new float[productos.length];
            for (int i = 0; i < productos.length; i++) {
                this.pvpUnitario[i] = obtenerPrecioUnitario(this.productos[i]);
                this.cantidad[i] = 1; // Se asume inicialmente una cantidad de 1
                this.subtotal[i] = this.pvpUnitario[i] * this.cantidad[i];
            }
        } catch (Exception e) {
            System.out.println("Error al crear la factura: " + e.getMessage());
        }
    }

    // (Advanced) Método para obtener el precio unitario de un producto
    private float obtenerPrecioUnitario(Products producto) {
        // Implementa la lógica para obtener el precio unitario de cada producto según sea necesario
        // Puedes cambiar esto según tus necesidades
        switch (producto) {
            case TORNILLOS:
                return 1.0f;
            case TUERCAS:
                return 0.7f;
            case PINTURA:
                return 10.0f;
            case BOMBILLAS:
                return 2.0f;
            case TALADROS:
                return 30.0f;
            case ALAMBRE:
                return 7.0f;
            default:
                return 0.0f;
        }
    }

    // Getters y setters controlando errores (por simplicidad, aquí solo se muestra un getter)
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(String fechaStr) {
        try {
            this.fecha = LocalDate.parse(fechaStr, java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        } catch (Exception e) {
            System.out.println("Error al establecer la fecha: " + e.getMessage());
        }
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Factura:\n");
        sb.append("Fecha: ").append(fecha).append("\n");
        sb.append("Productos:\t" +"Cantidad\t"+ "PVP UNITARIO\t" + "SUBTOTAL \n");
        for (int i = 0; i < productos.length; i++) {
            sb.append("").append(productos[i]).append("\t: \t");
            sb.append("").append(cantidad[i]).append("\t");
            sb.append("\t").append(pvpUnitario[i]).append("\t");
            sb.append("\t").append(subtotal[i]).append("\n");
        }
        sb.append("Total: ").append(calcularTotal()).append("\n");
        return sb.toString();
    }

    // (Advanced) Método para calcular el total de la factura
    private float calcularTotal() {
        float total = 0;
        for (int i = 0; i < productos.length; i++) {
            total += subtotal[i];
        }
        return total;
    }
}
            
