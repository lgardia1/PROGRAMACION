/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.car2;

/**
 *
 * @author proluh
 */
public class Car2 {

    public static void main(String[] args) {
        //EL constructor vacío me lo da Java,
        //yo no  lo tengo que hacer
        Car alexCar = new Car("Audi", "R8", "Black", 90);

        //Este método tambien me lo proporciona Java
        
        System.out.println("Destiny Valencia");
        alexCar.setFuel(90);
        int km = 100;
        System.out.println(alexCar.toString());
        
        
        while(alexCar.getKms() <= km){
            alexCar.speedUp(5);
            System.out.println("KMS DONE: " + alexCar.getKms() + "  KM TO ARRIVE: " + (km-alexCar.getKms()) + "FUEL: " + alexCar.getFuel());
        }
        
    }
    //Crear 2 objetos con un constructor y un String
}
