/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rut.parkingmanagement;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 *
 * @author Rut
 */
public class Ticket {

    private int idTicket; 
    private String plateCar;   
    private String idPlace;
    private LocalDateTime entryTime;      
    private LocalDateTime exitTime;     
    private double amount, duration;
    private Car car;
    private Place place;

    public Ticket(int idTicket, String plateCar, String idPlace) {
        this.idTicket = idTicket;
        this.plateCar = plateCar;
        this.idPlace = idPlace;
        this.entryTime = LocalDateTime.now();
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setExitTime() {
        this.exitTime = LocalDateTime.now();
        Duration time = Duration.between(entryTime, exitTime);
        setDuration(time);
        setAmount(time.toMinutes() * 0.10);
    }
    public void setDuration(Duration time) {
        this.duration = time.toMinutes();
    }
    public int getIdTicket() {
        return idTicket;
    }
    public String getPlateCar() {
        return plateCar;
    }
    public String getIdPlace() {
        return idPlace;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }
    public LocalDateTime getExitTime() {
        return exitTime;
    }
    public double getAmount() {
        return amount;
    }
    public double getDuration(){
        return duration;
    }
    public String ticketExit() {
        String phrase;
        setExitTime();
        phrase = "Day: " + this.getEntryTime().getDayOfMonth() + "\n";
        phrase += "Month: " + this.getEntryTime().getMonthValue() + "\n";
        phrase += "Year: " + this.getEntryTime().getYear() + "\n";
        phrase += "Plate: " + getPlateCar() + "\n";
        phrase += "Entry time: " + this.getEntryTime().getHour()+" hours with " +this.getEntryTime().getMinute()+ " minutes\n";
        phrase += "Exit time: " + this.getExitTime().getHour()+" hours with " +this.getExitTime().getMinute()+ " minutes\n";
        phrase += "Total time: " + this.getDuration()+ " mins\n";
        phrase += "Amount: " + this.getAmount() + " €\n";
        phrase += "IVA (21%): " +this.getAmount()*0.21 + " €\n";
        phrase += "Total: " + this.getAmount()*1.21 + "\n";
        phrase += "Ticket nº: " + this.getIdTicket();
        return phrase;
    }

    @Override
    public String toString() {
        String phrase;
        phrase = "Day: " + this.getEntryTime().getDayOfMonth() + "\n";
        phrase += "Month: " + this.getEntryTime().getMonthValue() + "\n";
        phrase += "Year: " + this.getEntryTime().getYear() + "\n";
        phrase += "Plate: " + getPlateCar() + "\n";
        phrase += "Entry time: " + this.getEntryTime().getHour()+" hours with " +this.getEntryTime().getMinute()+ " minutes\n";
        phrase += "Ticket nº:" + getIdTicket();
        return phrase;
    }

}
