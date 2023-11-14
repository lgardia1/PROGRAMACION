/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.workingWithString;

/**
 *
 * @author Lucas
 */
public class WorkingWithString {

    public static void main(String[] args) {
        String cadena = "El gato se sube a la farola";

        //Metodos String
        int longuitud = cadena.length();
        System.out.println("La cadena tiene " + longuitud + " caracteres");
        if (cadena.startsWith("El") && cadena.endsWith("la")) {
            System.out.println("Empieza por El y acaba por la");
        }

        //Sacamos la primera posicion y la última donde haya una 'a'
        int pos = cadena.indexOf('a');
        int lastpos = cadena.lastIndexOf('a');
        System.out.printf("La primera ocurrencia esta en la posición %s y la ultima en la posición %s\n", pos, lastpos);

        //Sacara el carácter que hay en una determinada posción 
        pos = cadena.indexOf('u');
        System.out.println("La posición " + pos + " contiene el carárcter " + cadena.charAt(pos));

        //Compración de cadenas
        String cad2 = "El gato se sube a la farola";
        //Comprar dirección de memoria:
        if (cadena == cad2) {
            System.out.println("Son los mismo objetos");
        } else {
            System.out.println("Son objetos distintos");
        }
        
        //Compara las cadenas:
        if (cadena.equals(cad2)) {
            System.out.println("Las cadenas son iguales");
        } else {
            System.out.println("No son iguales");
        }
        //Comparar cadenas ignorando mayísculas
        cad2 = "EL GATO SE SUBE A LA FArola";
        if (cadena.equalsIgnoreCase(cad2)) {
            System.out.println("Son la misma cadena");
        } else {
            System.out.println("No son iguales la cadenas");
        }
        
        cadena = "Alejandro";
        cad2 = "alejandro";
        
        int result = cadena.compareTo(cad2);
        System.out.println("El resultado de compareTo es: " + result);
        if(result<0){
            System.out.println(cadena + " es menor que " + cad2);
        }else if (result == 0){
            System.out.println("Las cadenas son iguales");
        }else{
            System.out.println(cadena + " es mayot que " + cad2);
        }
    }
}
