package rut.parkingmanagement;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Place {

    final private String idPlace;
    final private float width;
    final private float length;
    private boolean disable; // Plaza para discapacitados (no constante)
    private boolean free;
    private boolean hasCharger;
    // No pongo coche ni matrícula porque eso lo gestiono en el ticket

    public Place(String idPlace, float width, float length, boolean disable, boolean free, boolean hasCharger) {
        this.idPlace = idPlace;
        this.width = width;
        this.length = length;
        this.disable = disable;
        this.free = free;
        this.hasCharger = hasCharger;
    }

    public boolean isDisable() {
        return disable;
    }

    public void setDisable(boolean disable) {
        this.disable = disable;
    }

    public void setHasCharger(boolean hasCharger) {
        this.hasCharger = hasCharger;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public void setChargeable(boolean hasCharger) {
        this.hasCharger = hasCharger;
    }

    public static Place[] setPlace(Place[] places) {
        String idPlace;
        float width, length;
        boolean disable, free, hasCharger;
        for (int i = 0, k = 1 ,z = 1; 4 >= z && k <= 10; i++ , k++) {
            if (k >= 10 && z!=4) {
                k = k - 9;
                z++;
            }
            idPlace = "P" + Integer.toString(z) + "S" + Integer.toString(k);
            length = ThreadLocalRandom.current().nextFloat(3.5f, 6.6f);
            width = ThreadLocalRandom.current().nextFloat(1.7f, 2.3f);
            free = true;
            if (ThreadLocalRandom.current().nextInt(1, 6) == 1) {
                hasCharger = true;
            } else {
                hasCharger = false;
            }
            if (ThreadLocalRandom.current().nextInt(1, 11) == 1) {
                disable = true;
            } else {
                disable = false;
            }
            places[i] = new Place(idPlace, width, length, disable, free, hasCharger);
        }
        return places;
    }

    // Más métodos
    // getFloor, getSection, ocuparPlaza(hora de entrada), 
    // liberarPlaza(tiene que devolver los minutos que ha estado)
    public int getSection() {
        int floor = Integer.parseInt(Character.toString(this.idPlace.charAt(2)));
        return floor;
    }

    public int getFloor() {
        int floor = Integer.parseInt(Character.toString(this.idPlace.charAt(0)));
        return floor;
    }

    public String getIdPlace() {
        return idPlace;
    }

    public float getWidth() {
        return width;
    }

    public float getLength() {
        return length;
    }

    public boolean isChargeable() {
        return hasCharger;
    }

    public static int searchPlace(Place[] places, Car car, ArrayList<Ticket> ticket, int nTicket , boolean disAble) {
        for (int i = 0; i < places.length; i++) {
            if(places[i].isFree()!=false && (places[i].getWidth()>=car.getWidth()) && (places[i].getLength()>=car.getLength())){
                System.out.println("Se ha encontrado una plaza");
                return i;
            }
        }
        System.out.println("No se ha encontrado niguna plaza");
        return -1;
    }

    public static int searchPlaceByIdPlace(Place[] places, String idPlace) {
        try {
            for (int i = 0; i < places.length; i++) {
                if (idPlace == places[i].getIdPlace()) {
                    return i;
                }
            }
            throw new idPlaceNotFound("");
        } catch (idPlaceNotFound e) {
            System.out.println("ID de plaza no encontrada");
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Place{" + "idPlace=" + this.idPlace + ", width=" + this.width + ", length="
                + this.length + ", disable=" + this.disable + ", free=" + this.free
                + ", hasCharger=" + this.hasCharger + '}';
    }

}
