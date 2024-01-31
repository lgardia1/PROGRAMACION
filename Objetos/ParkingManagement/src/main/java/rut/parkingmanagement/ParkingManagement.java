package rut.parkingmanagement;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ParkingManagement {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int opcion, elegir, nPlaces = 37, nTicket = 0;
        double total = 0;
        Car myCar = null;
        Place[] places = new Place[nPlaces];
        places = Place.setPlace(places);
        ArrayList<Ticket> tickets = new ArrayList<>(); // Array para llevar la contabilidad
        boolean salir = false, disAble;
        while (!salir) {
            printMenu();
            opcion = input.nextInt(); //1 Meter coche. 2 Sacar coche. 3. Imprimir todos tickets
            if (opcion == 1) {
                printMeterCoche();
                myCar = Car.checkCoche(input.next(), input.next(), input.nextFloat(), input.nextFloat(), input.next());
                System.out.println("¿Eres discapacitado? true/false");
                disAble = input.nextBoolean();
                if (myCar != null) {
                    int place = Place.searchPlace(places, myCar, tickets, nTicket, disAble);
                    if (place != -1) {
                        places[place].setFree(false);
                        tickets.add(new Ticket(nTicket, myCar.getPlate(), places[place].getIdPlace()));
                        nTicket++;
                    }
                };
            } else if (opcion == 2) {
                if (nTicket != 0) {
                    printTickets(tickets);
                    System.out.println("Escriba el id del ticket que quiera sacar");
                    elegir = input.nextInt();
                    for (int i = 0; i < tickets.size(); i++) {
                        if (tickets.get(i).getIdTicket() == elegir) {
                            total = total + tickets.get(i).getAmount();
                            int place = Place.searchPlaceByIdPlace(places, tickets.get(i).getPlateCar());
                            places[place].setFree(true);
                            printTicketExit(tickets.get(i));
                            tickets.remove(i);
                            nTicket--;
                        }
                    }
                }
            } else if (opcion == 3 && myCar!=null) {
                printCoche(myCar);
            } else if (opcion  == 4) {
                printPlaces(places);
            } else if (opcion == 5) {
                printTicket(tickets.get(nTicket-1));
            } else if (opcion == 6) {
                printTickets(tickets);
            }else if (opcion == 7){
                printTicketExit(tickets.get(nTicket-1));
            }else if (opcion == 8){
                System.out.println("Total recaudado: " + total);
            }else if(opcion == 9){
                salir = true;
            }

        }
    }

    public static void printMenu() {
        System.out.println("1 Meter coche");
        System.out.println("2 Sacar coche");
        System.out.println("3 Muestra el coche");
        System.out.println("4 Imprime todas las plazas");
        System.out.println("5 Imprime el ultimo ticket de entrada");
        System.out.println("6 Imprime todos los tickets de entrada");
        System.out.println("7 Imprime del ultimo ticket de entrada, el de salida");
        System.out.println("8 Total recaudado");
        System.out.println("9 Salir\n");
    }

    public static void printMeterCoche() {
        System.out.println("1.-Matricula 1234-LL, L-1234-LL , LL-1234-L , LL-12345");
        System.out.println("2.-País: SPAIN, ITALY, FRANCE, GERMANY, UE, NOTUE");
        System.out.println("3.-Ancho: 1.7/2.2");
        System.out.println("4.-Largo: 3.5/6.5");
        System.out.println("5.-Tipo: HYBRID, ELECTRIC, COMBUSTION");
    }

    public static void printCoche(Car myCar) {
        System.out.println("Matricula:" + myCar.getPlate());
        System.out.println("Pais:" + myCar.getCountry());
        System.out.println("Ancho:" + myCar.getWidth());
        System.out.println("Largo:" + myCar.getLength());
        System.out.println("Tipo:" + myCar.getType());
    }

    public static void printTickets(ArrayList<Ticket> tickets) {
        for (Ticket tick : tickets) {
            System.out.println(tick);
        }
        System.out.println("");
    }

    public static void printTicket(Ticket ticket) {
        System.out.println(ticket+"\n");
    }

    public static void printTicketExit(Ticket ticket) {
        System.out.println(ticket.ticketExit());
    }

    public static void printPlaces(Place[] places) {
        for (Place pl : places) {
            System.out.println(pl);
        }
        System.out.println("");
    }

    public static void printPlace(Place place) {
        System.out.println(place+"\n");
    }
}
