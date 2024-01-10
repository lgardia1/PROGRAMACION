package org.example;

public class Persona {
    String nombre , DNI;
    int edad;
    Sexo genero;

    public Persona(String nombre, String DNI, String genero , int edad) {
        setNombre(nombre);
        setDNI(DNI);
        setGenero(genero);
        setEdad(edad);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(String DNI) {
        if(isNumeric(DNI) && (Character.toUpperCase(DNI.charAt(DNI.length()-1)) == calculeLetter(DNI))){
            this.DNI = DNI;
        }else{
            System.out.println("DNI incorrecto");
            this.DNI = "12345678X";
        }
    }

    public void setGenero(String genero) {
        try{
            this.genero = Sexo.valueOf(genero.toUpperCase());
        }catch (Exception ex){
            this.genero = Sexo.OTHER;
        }
    }

    public void setEdad(int edad) {
        if((0 <= edad) && (edad <= 120)){
            this.edad = edad;
        }else{
            System.out.println("Edad es incorrecta");
            this.edad = 0;
        }
    }
    public boolean isNumeric(String DNI){
        try{
            for(int i = 0 ; i < DNI.length()-1 ; i++){
                Integer.parseInt(Character.toString(DNI.charAt(i)));
            }
            return true;
        }catch (Exception ex){
            System.out.println("DNI incorrecto");
            this.DNI = "12345678X";
            return false;
        }
    }
    public char calculeLetter(String DNI){
        int numberDNI = Integer.parseInt(DNI.substring(0,8));
        char[] letter = {'T' , 'R' , 'W' , 'A', 'G' , 'M' , 'Y' , 'F' ,'P' ,'D', 'X', 'B' ,'N' , 'J' , 'Z' , 'S' , 'Q' , 'V', 'H', 'L' , 'C' ,'K' , 'E'};
        int rest = numberDNI%23;
        return letter[rest];
    }
    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public String getGenero() {
        return genero.toString();
    }

    public int getEdad() {
        return edad;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(nombre).append(" ").append(edad).append(" ").append(genero.toString()).append(" ").append(DNI);
        return sb.toString();
    }
}

