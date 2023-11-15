/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.propuesto1array;

/**
 *
 * @author Lucas
 */
import java.lang.String;
import java.util.concurrent.ThreadLocalRandom;

public class Propuesto1Array {

    public static void main(String[] args) {
        int personas;
        String cadena, cadenaDev, pelicula = "";
        int dev, max = 0, sala = 0;
        String[] peliculas = {"Avatar 2", "IT", "Spiderman", "Harry Poter", "Oppenheimer", "Toy Story", "Los vengadores",
            "Hitman", "Fast and Furious", "DR.Strange", "Señor de los anillo", "8 apellidos bascos", "Five Night's at Freddy",
            "Barbie", "Termineitor"
        };
        String[][] peliculaPersona = new String[14][15];
        for (int i = 0; i < peliculaPersona.length; i++) {
            for (int j = 0; j < peliculaPersona[i].length; j++) {
                if (i % 2 != 0 && i != 0) {
                    personas = ThreadLocalRandom.current().nextInt(1, 101);
                    cadena = String.valueOf(personas);
                    peliculaPersona[i][j] = cadena;
                } else {
                    peliculaPersona[i][j] = peliculas[j];
                }
            }
        }

        for (int i = 0; i < peliculaPersona.length; i++) {
            if (i == 0 || i % 2 == 0) {
                System.out.println("\nSala " + Math.ceil((i + 1) / 2f) + ":\n");
            }
            for (int j = 0; j < peliculaPersona[i].length; j++) {
                System.out.print(peliculaPersona[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < peliculaPersona.length; i++) {
            for (int j = 0; j < peliculaPersona[i].length; j++) {
                if (i % 2 != 0 && i != 0) {
                    cadenaDev = peliculaPersona[i][j];
                    dev = Integer.parseInt(cadenaDev);
                    if (dev > max) {
                        max = dev;
                        sala = i;
                        pelicula = peliculaPersona[i - 1][j];
                    }
                }
            }

        }
        System.out.println();
        System.out.println("La pelicula " + pelicula + " de la sala " + (sala + 1) / 2 + " ha tenido el mayor numero de espectadores, con: " + max);
    }
}
