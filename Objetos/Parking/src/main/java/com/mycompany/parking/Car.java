/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parking;

/**
 *
 * @author proluh
 */
enum CarType{
        HYBRID , ELECTRIC , COMBUSTION , OTHER
}
public class Car {
    private String plate;
    private float length;
    private float width;
    private float height;
    private CarType type;
    private boolean disabled;
    
    //Métodos
    //Constructor 

    public Car(String plate, float length, float width, float height, CarType type, boolean disabled) {
        this.plate = plate;
        this.length = length;
        this.width = width;
        this.type = type;
        this.disabled = disabled;
    }

    public String getPlate() {
        return plate;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public CarType getType() {
        return type;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    
    public void setType(CarType type) {
        this.type = type;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    @Override
    public String toString() {
        return "Car{" + "plate=" + plate + ", length=" + length + ", width=" + width + ", type=" + type + ", disabled=" + disabled + '}';
    }
    
}
