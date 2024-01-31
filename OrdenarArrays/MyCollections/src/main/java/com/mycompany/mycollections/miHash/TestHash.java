package com.mycompany.mycollections.miHash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class TestHash {
    //HomeWork :
    //Crear un HashMpar<Personas> y un HashSet<Product> y hacer
    //lo mismo que hemos hecho aquí 
    
    //Muy imporante:
    //Intentad borrar elementos de mientras se recorre la coleccion
    //sin el iterador!!
    public static void main(String[] args) {

    }
    public static void workingWithHasMap(){
               //  TODO code application logic here
      //   HASMAP DE CAPITALES DE PAISES
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("Spain", "Madrid");
        capitalCities.put("England", "London");
        capitalCities.put("Italy", "Pekin");
        capitalCities.put("France", "Paris");
        capitalCities.put("Uganda", "Praga");
        

        // Obtengo la capital de Francia
        System.out.println("France capital is " + capitalCities.get("France"));

        // Mostrar tamaño
        System.out.println("Size of capitalCities: " + capitalCities.size());

        //Mostrar el indicie o Key de un elemento
        System.out.println("My countries are: ");
        for (String country : capitalCities.keySet()) {
            System.out.print(country + " ");
        }

        // Borro un elemento situado en la posicion x
        capitalCities.remove("France");

        // Recorro el Hashmap mostrando solo los indices
        System.out.println("My countries are: ");
        for (String country : capitalCities.keySet()) {
            System.out.print(country + " ");
        }

        // Muestro las capitales
        System.out.println("My capital cities are: ");
        for (String capital : capitalCities.values()) {
            System.out.print(capital + " ");
        }

        // Muestro los paises con sus capitales
        for (String country : capitalCities.keySet()) {
            System.out.println("Country: " + country + ". Capital cities are: "
                    + capitalCities.get(country));
        }
        
        //Crear un array con las capitales
        String[] capital = {capitalCities.values().toString()};
        System.out.println(Arrays.toString(capital));
        
        //Crea un array con los paises
        String[] countries = {capitalCities.keySet().toString()};
        System.out.println(Arrays.toString(countries));

    }
    public static void workingWithHasSet() {
        MyHashSet myNumbers = new MyHashSet();
        System.out.println("Size: " + myNumbers.numberSize());

        //ñadiendo alementos
        myNumbers.addNumber(234);
        myNumbers.addNumber(-2);
        myNumbers.addNumber(6);
        myNumbers.addNumber(51);
        myNumbers.showNumber();

        //Intento añadir un numero repetido 234
        System.out.println("Inserrt another 234");
        myNumbers.addNumber(234);
        myNumbers.showNumber();

        //Borrro número
        System.out.println("\nRemove 234....");
        myNumbers.removeNumber(234);
        myNumbers.showNumber();

        //Pregunto por un numero
        if (myNumbers.exitNumber(-2)) {
            System.out.println("\nExist -2");
        } else {
            System.out.println("\n-2 doesn't exist!!");
        }

        //Elimino todos los numeros 
        System.out.println("\nClearing set...");
        myNumbers.removeNumbers();
        myNumbers.showNumber();

        //Uso el iterador para borrar todos lo numeros negativos
        myNumbers.addNumber(234);
        myNumbers.addNumber(-2);
        myNumbers.addNumber(-6);
        myNumbers.addNumber(-51);
        Iterator<Integer> it = myNumbers.numbers.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            if(i<0) {
                System.out.println("");
                it.remove();
            }
        }
        myNumbers.showNumber();
        
        
        //Creo un iterador para borrar todas aquellas capitales que 
        //empiecen por p
        
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("Rrepublica Checa", "Praga");
        capitalCities.put("Italia", "Roma");
        capitalCities.put("Luxemburgo", "Luxemburgo");
        capitalCities.put("Bélgica", "Bruselas");
        capitalCities.put("Grecia", "Atenas");
        capitalCities.put("Finlandia", "Helsinki");
        capitalCities.put("Suecia", "Estocolmo");
        capitalCities.put("Dinamarca", "Copenhague");
        capitalCities.put("China", "Pekin");
        
        Iterator<String> ot = capitalCities.values().iterator();
        while(it.hasNext()){
            String pais = ot.next();
            //Min y Mayus
            if(Character.toUpperCase(pais.charAt(0)) == 'P')it.remove();
        }
    }
}
