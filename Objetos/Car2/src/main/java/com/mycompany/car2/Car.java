/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.car2;

import java.util.Scanner;

/**
 *
 * @author proluh
 */
public class Car {
    Scanner input = new Scanner(System.in);
    
    //Creando una plantilla/molde de Coche
    //Atributos
    private String brand;
    private String model;
    private String colour;//Hacerlo enum
    private final double FUELDEPOSITYCAPACITY;
    private double speed, fuelLevel, kms; //Hacerlo enum el fueLlEVEL

    //Crear el método constructor
    //Es el único elemento que no especifica lo que devuelve
    //distintos parámetros o no tener parámetros
    public Car() {
        brand = "";
        model = "";
        colour = "";
        FUELDEPOSITYCAPACITY = 50;
    }

    public Car(String myBrand, String newModel, String newColour, int fdc) {
        brand = myBrand;
        model = newModel;
        colour = newColour;
        FUELDEPOSITYCAPACITY = fdc;
    }

    //Sobreescritura de metodos (Overreading)
    //Significa sobreescribir un metodo ya existente de java
    //para que haga lo que yo quiero
    @Override
    public String toString() {
        return ("My car is a " + colour + " " + brand + " " + model + " with " + kms + ".It's got " + fuelLevel + " with a capacity of " + FUELDEPOSITYCAPACITY);
    }

    public void setSpeed(double sp) {
        float maxSpeed = 400;
        float minSpeed = 0;
        if (sp <= minSpeed) {
            sp = minSpeed;
        } else if (sp >= maxSpeed) {
            sp = maxSpeed;
        }
        speed = sp;
    }

    public void speedUp(double increase) {
        double newSpeed = speed + increase;
        newSpeed = (newSpeed / 3.6) / 1000;
        double km = kms + newSpeed;
        fuelLevel = fuelLevel - 0.005 * newSpeed;
        if (fuelLevel > 5.9) {
            setSpeed(newSpeed);
        } else {
            setSpeed(0);
            System.out.println("Repostar la gasolina");
            setFuel(input.nextDouble());
        }
        setKms(km);
    }

    public void setKms(double newKms) {
        if (newKms > 0) {
            kms = newKms;
        } else {
            kms = 0;
        }
    }

    public void setFuel(double fuel) {
        if(fuel >= FUELDEPOSITYCAPACITY){
            fuel = FUELDEPOSITYCAPACITY;
        }else if(fuel <0){
            fuel = 0;
        }
        fuelLevel = fuel;
    }

    public double getKms() {
        return kms;
    }

    public double getSpeed() {
        return speed;
    }

    public double getFuel() {
        return fuelLevel;
    }
}
