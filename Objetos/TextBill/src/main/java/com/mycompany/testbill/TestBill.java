package com.mycompany.testbill;

import java.util.Scanner;

/**
 *
 * @author antho
 */
public class TestBill {

    static Scanner keyboard = new Scanner(System.in);

    /*Hay que crear una clase Bill (factura) en la que tengamos los siguientes atributos:
            -Un array con los nombres de los productos comprados
            -Otro array con el precio total de cada uno de los productos
            -llevar de alguna forma un contador de la cantidad comprada de cada uno de los productos
            -Otro que sea la fecha de la factura.
    Advance2 : Guardar también de alguna forma la fecha en la que se compró cada producto
    Pedir fecha para saber cuando se compró.
    
    Programa principal:
    Solo tiene que crear una factura  y mostrarla de la siguiente forma:
            -Tornillo 23,78€
            -Ratón    11,77€
    
                Subtotal  -----
                Iva 21%
                Total = ---
            Granada, a XX de XXX de 2023*/
    public static void main(String[] args) {
        // Ejemplo de uso
        Products[] productos = fillProducts();
        
        float[] precios = {10.0f, 20.0f, 30.0f, 30.0f, 30.0f};
        String fechaStr = "09-12-2023";

        // Crear factura con constructor de Enum
        Bill facturaEnum = new Bill(productos, precios, fechaStr);
        System.out.println(facturaEnum);

       

//        Products[] productos = fillProducts();
//        System.out.println(Arrays.toString(productos));

    }

    public static Products[] fillProducts() {
        Products[] arrayProductos = new Products[5];
        for (int i = 0; i < arrayProductos.length; i++) {

            System.out.println("Ingresa un Producto: ");
            String userInput = keyboard.nextLine();
            userInput = userInput.toUpperCase(); // Convertir a mayúsculas para hacer coincidir con el enum
            try {
                arrayProductos[i] = Products.valueOf(userInput);

                System.out.println("Producto ingresado: " + userInput);

            } catch (IllegalArgumentException e) {
                System.out.println("Error: Valor ingresado no válido");
                i--;

            }
        }

        return arrayProductos;

    }

}
