package com.mycompany.rimas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Rimas {

    static Scanner input = new Scanner(System.in);

    public enum rima {
        Consonante, Asonante, Desconocido
    }

    public static void main(String[] args) {
        boolean continuar = true;
        String verso = "";
        ArrayList<String> estrofa = new ArrayList<>();
        for (int i = 0; continuar && i < 4; i++) {
            verso = ((input.nextLine()).toLowerCase()).trim();
            if (!verso.isEmpty()) {
                estrofa.add(verso);
            } else {
                continuar = false;
            }
        }
        char[] rimaFinal = typeRima(estrofa);
        System.out.println("Rimas: ");
        for (int i = 0; i < rimaFinal.length; i++) {
            System.out.println(resultType[i] + " " + rimaFinal[i]);
        }
        

        String art = checkArt(rimaFinal);
        System.out.printf("\n%s\n", art);

        typeEstrofa(rimaFinal, rimaFinal, art);
    }

    public static char[] typeRima(ArrayList<String> estrofa) {
        char[] rimaFinal = new char[estrofa.size()];
        for (int i = 0; i < rimaFinal.length; i++) {
            rimaFinal[i] = ' ';
        }
        if (isMajorArt(estrofa.get(0))) {
            rimaFinal[0] = 'A';
        } else {
            rimaFinal[0] = 'a';
        }
        int[] eliminarCaracter = {0, 0, 0, 0};
        //eliminarCaracter restara una unidad posteriormente a length si contienen el ultimo caracter un punto o puntocoma o una coma.
        for (int i = 0; i < estrofa.size(); i++) {
            if ((estrofa.get(i)).endsWith(",") || (estrofa.get(i)).endsWith(".") || (estrofa.get(i)).endsWith(";")) {
                eliminarCaracter[i] = -1;
            }
        }

        //Toma los primeros versos, lo compara con el siguiente (caso 2 versos), luego con la post-siguiente (caso 3 versos) y luego con los post-post-siguiente (caso 4 versos)
        //Si los caracteres coinciden:
        //Se le asigna la misma rima que la anterior.
        //Ej:Tenmos la primera versos es A y la segunda se le asigna A
        //Si no coinciden los caracteres y ambos tienen letra asignada:
        //No ocurre nada
        //Si no coinciden los caracteres y UNO NO TIENE LETRA ASIGNADA:
        //La primera estrofa que se compara, tiene si o si letra; la segunda que no tiene letra (estamos en el caso) se le asinara la letra 
        //en UNA POSICION ADELANTADA EN EL ALFABETO de la estrofa anterior.
        //Ej: Tenemos en el primer verso es A y la segunda se le asigna B
        for (int i = 0; i < estrofa.size() - 1; i++) {
            for (int j = i + 1; j < estrofa.size(); j++) {
                if ((Character.toString((estrofa.get(i)).charAt((estrofa.get(i)).length() - 1 + eliminarCaracter[i]))).equals(Character.toString((estrofa.get(j)).charAt((estrofa.get(j)).length() - 1 + eliminarCaracter[j])))) {
                    rimaFinal[j] = addLetter(i, j, rimaFinal, estrofa);

                } else {
                    rimaFinal[j] = containLetter(j, rimaFinal, estrofa);
                }
            }
        }
        rima(estrofa, eliminarCaracter);
        return rimaFinal;
    }

    static rima[] resultType;

    //Verifica cada versos si es rima asonante o consonante, lo hace mirando el segundo ultimo caracter si coincide.
    //SOLO ES CAPAZA DE VERIFICA LAS LOS ULTIMOS 2 CARACTARES Y AHI DETRMINA ASONANTE O CONSONANTE
    public static void rima(ArrayList<String> estrofa, int[] eliminarCaracter) {
        rima[] type = new rima[estrofa.size()];
        for (int i = 0; i < estrofa.size() - 1; i++) {
            for (int j = i + 1; j < estrofa.size(); j++) {
                if ((Character.toString((estrofa.get(i)).charAt((estrofa.get(i)).length() - 1 + eliminarCaracter[i]))).equals(Character.toString((estrofa.get(j)).charAt((estrofa.get(j)).length() - 1 + eliminarCaracter[j])))) {

                    if ((Character.toString((estrofa.get(i)).charAt((estrofa.get(i)).length() - 2 + eliminarCaracter[i]))).equals(Character.toString((estrofa.get(j)).charAt((estrofa.get(j)).length() - 2 + eliminarCaracter[j])))) {
                        if (character((estrofa.get(i)).charAt((estrofa.get(i)).length() - 2 + eliminarCaracter[i])) && character((estrofa.get(j)).charAt((estrofa.get(j)).length() - 2 + eliminarCaracter[j]))) {
                            type[i] = rima.Asonante;
                            type[j] = rima.Asonante;
                        } else {
                            type[i] = rima.Consonante;
                            type[j] = rima.Consonante;
                        }
                    }
                } else {
                    if ((Character.toString((estrofa.get(i)).charAt((estrofa.get(i)).length() - 2 + eliminarCaracter[i]))).equals(Character.toString((estrofa.get(j)).charAt((estrofa.get(j)).length() - 2 + eliminarCaracter[j])))) {
                        if (character((estrofa.get(i)).charAt((estrofa.get(i)).length() - 2 + eliminarCaracter[i])) && character((estrofa.get(j)).charAt((estrofa.get(j)).length() - 2 + eliminarCaracter[j]))) {
                            type[i] = rima.Asonante;
                            type[j] = rima.Asonante;
                        } else {
                            type[i] = rima.Desconocido;
                            type[j] = rima.Desconocido;
                        }
                    }else{
                        type[i] = rima.Desconocido;
                        type[j] = rima.Asonante;
                    }
                }
            }
        }
        resultType = type;
    }

    //Se le da el mismo valor a la letra y se identifica cada verso si es arte mayor o menor segun su mayuculao minuscula.
    public static char addLetter(int i, int j, char[] rimaFinal, ArrayList<String> estrofa) {
        if ((isMajorArt(estrofa.get(i)) && isMajorArt(estrofa.get(j))) || (isMajorArt(estrofa.get(i)) && isMajorArt(estrofa.get(j)))) {
            rimaFinal[j] = rimaFinal[i];
        } else {
            if ((isMajorArt(estrofa.get(i))) && (!isMajorArt(estrofa.get(j)))) {
                rimaFinal[j] = Character.toLowerCase(rimaFinal[i]);
            } else if ((!isMajorArt(estrofa.get(i))) && (isMajorArt(estrofa.get(j)))) {
                rimaFinal[j] = Character.toUpperCase(rimaFinal[i]);
            } else {
                rimaFinal[j] = rimaFinal[i];
            }
        }
        return rimaFinal[j];
    }

    static int k = 0;

    //Añade letra si esta vacio, sino, lo deja como esta. Tiene en cuenta si es arte mayor o menor:
    public static char containLetter(int j, char[] rimaFinal, ArrayList<String> estrofa) {
        char[] majorArt = {'B', 'C', 'D'};
        char[] minorArt = {'b', 'c', 'd'};
        if (rimaFinal[j] == ' ') {
            if (isMajorArt(estrofa.get(j))) {
                rimaFinal[j] = majorArt[k];
                k++;
                return rimaFinal[j];
            } else {
                rimaFinal[j] = minorArt[k];
                k++;
                return rimaFinal[j];
            }
        } else {
            return rimaFinal[j];
        }
    }

    //Verifica si es de arte mayor un verso es decir si tiene de nueve o más silabas es de arte mayor, de lo contratio seria de arte menor.
    public static boolean isMajorArt(String verso) {
        int vocal = 0;
        int vocalCounter = 0;
        char[] syllable = {'k', 'k'};

        for (int i = 0; i < verso.length(); i++) {
            if (verso.charAt(i) != ' ') {
                if (character(verso.charAt(i))) {
                    vocal++;
                }
                if (vocalCounter >= 2) {
                    vocalCounter = 0;
                }
                syllable[vocalCounter] = verso.charAt(i);
                vocalCounter++;
                if (character(syllable[0]) && character(syllable[1])) {
                    vocal--;
                }
            }
        }
        if (vocal >= 9) {
            return true;
        } else {
            return false;
        }
    }

    //Veirifica caracteres
    public static boolean character(char a) {
        return a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u';
    }

    //Veirifica el arte en general de toda la estrofa.
    public static String checkArt(char[] rimaFinal) {
        int upperCase = 0, lowerCase = 0;
        String art;
        for (char caracter : rimaFinal) {
            if (Character.isUpperCase(caracter)) {
                upperCase++;
            } else {
                lowerCase++;
            }
        }

        if (lowerCase > upperCase) {
            art = "Es de arte menor la estrofa.";
        } else if (lowerCase < upperCase) {
            art = "Es de arte mayor la estrofa.";
        } else {
            art = "Arte desconocido.";
        }
        return art;
    }

    //Identifica el tipo de estrofa, teniendo en cuenta su rima.
    public static void typeEstrofa(char[] rimaFinal, char[] defaultRimaFinal, String art) {
        for (int i = 0; i < rimaFinal.length; i++) {
            rimaFinal[i] = Character.toUpperCase(rimaFinal[i]);
        }
        if (rimaFinal.length == 2) {
            if ((rimaFinal[0] == rimaFinal[1]) && (resultType[0] == resultType[1] && rima.Consonante == resultType[0])) {
                System.out.println("PAREADO");
            }else{
                System.out.println("DESCONOCIDO");
            }
        } else if (rimaFinal.length == 3) {
            if ((((rimaFinal[0] == rimaFinal[2]) && (resultType[0] == resultType[2])) && (rimaFinal[0] != rimaFinal[1])) && rima.Consonante == resultType[0]) {
                System.out.println("TERCETO");
            }else{
                System.out.println("DESCONOCIDO");
            }
        } else if (rimaFinal.length == 4) {
            if (((resultType[0] == resultType[1]) && (resultType[2] == resultType[3])) && rima.Consonante == resultType[0]) {
                if (rimaFinal[0] == rimaFinal[1] && rimaFinal[2] == rimaFinal[3]) {
                    System.out.println("CUADRENA VÍA");
                } else if ((rimaFinal[0] == rimaFinal[3]) && (rimaFinal[1] == rimaFinal[2])) {
                    System.out.println("CUARTETO");
                } else {
                    System.out.println("CUARTETA");
                }
            } else if ((art.equals("Es de arte menor la estrofa."))) {
                boolean continuar = false;
                int repeat = 0;
                for (int i = 0; i < rimaFinal.length - 1; i++) {
                    for (int j = i + 1; j < rimaFinal.length; j++) {
                        if ((rimaFinal[i] == rimaFinal[j]) && (resultType[i] == resultType[j]) && (resultType[i] == rima.Asonante)) {
                            continuar = true;
                            repeat++;
                        }
                    }
                }
                if (repeat > 2) {
                    continuar = false;
                }
                if (continuar) {
                    System.out.println("Seguidilla");
                } else {
                    System.out.println("DESCONOCIDO");
                }
            } else {
                System.out.println("DESCONOCIDO");
            }
        }
    }
}
