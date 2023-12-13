/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exa1eval_23_24_alus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 *
 * @author Rut
 */
enum Idioma {
    ALEMÁN, INGLÉS, FRANCÉS, ESPAÑOL, ITALIANO, ÁRABE, CHINO, URDU, PORTUGUÉS,
    RUSO, HINDI, OTHER
}

public class Libro {

    private String titulo;
    private String autor;
    private String isbn;
    private LocalDate fecha;
    private Idioma[] idiomas;

    public Libro(String titulo, String autor, String isbn, String fecha,
            String[] lenguas) {
        this.titulo = titulo;
        this.autor = autor;
        setIsbn(isbn);
        setFecha(fecha);
        setIdiomas(lenguas);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if (isbnValido(isbn)) {
            this.isbn = isbn;
        } else {
            this.isbn = "978-PA-12345-67-X";
        }
    }

// Ejercicio 1: El ISBN siempre estará formado por el prefijo 978-país-editorial-publicación-dc
// De estas 5 partes sólo el prefijo 978 y el dígito de control tienen un número 
// fijo de dígitos (4 en total). Los otros grupos tienen un número variable
// de dígitos pero lo que importa es que entre todos ellos debe haber exactamente
// 9 dígitos. Así el ISBN13 siempre está formado por 13 dígitos.
    // 1,5 ptos
//    función isbnValido
    public boolean isbnValido(String isbn) {
        isbn = isbn.trim();
        String[] myIsbn = isbn.split("-");
        for (int i = 0; i < myIsbn.length; i++) {
            if (!(isNumeric(myIsbn[i]))) {
                return false;
            }
        }
        if ((isbn.startsWith("978") && myIsbn[myIsbn.length - 1].length() == 1) && isbn.length() == 17) {
            return true;
        } else {
            return false;
        }
    }

    // Función auxiliar para trabajar en isbnValido
    public boolean isNumeric(String cad) {
        try {
            Integer.parseInt(cad);
        } catch (NumberFormatException error) {
            return false;
        }
        return true;
    }

    // Ejercicio 2: convertir el String fecha en una fecha válida 
    // El String tiene que tener la forma "dd-mm-yyyy" 
    // Si no se puede convertir, se pondrá la mínima fecha posible 
    // proporcionada por Java
    // 2 ptos
//    función setFecha
    public void setFecha(String fecha) {
          DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
          //Si la fecha esta incorrecta, le meto la fecha de hoy.
          LocalDate fechaActual = LocalDate.now();
        try {
            this.fecha =  LocalDate.parse(fecha, formato);
        } catch (DateTimeParseException ex) {
            System.out.println("Los valores de la fecha no son invalidos");
             this.fecha =  fechaActual;
        } catch (Exception ex) {
            System.out.println("Ha habido algun error...");
            this.fecha =  fechaActual;
        }
        
    }

    public Idioma[] getIdiomas() {
        return idiomas;
    }

    // Ejercicio 3:Convertir el array de String a un array Idioma 
    // (lo usa en el constructor)
    // 1,7 ptos
//    función setIdiomas
    public void setIdiomas(String[] lenguas) {
        this.idiomas = new Idioma[lenguas.length];
        for (int i = 0; i < lenguas.length; i++) {
            try {
                this.idiomas[i] = Idioma.valueOf((lenguas[i].toUpperCase()));
            } catch (IllegalArgumentException ex) {
                System.out.println("El formato del idioma no es correcto o no esta incluido en el enum");
                this.idiomas[i] = Idioma.OTHER;
            } catch (Exception ex) {
                System.out.println("Ha habido algun error... el formato no es correcto o no esta incluido el enum");
                this.idiomas[i] = Idioma.OTHER;
            }
        }
    }

    // Convierte la fecha inglesa a fecha española en forma de String
    // (lo usa el toString) 
    // 0,9 ptos
//   función convierteFechaASp
    public String convierteFechaASp() {
        StringBuilder sb = new StringBuilder();
        sb.append("").append(this.fecha.getDayOfMonth() + "-" + this.fecha.getMonthValue() + "-" + this.fecha.getYear());
        return sb.toString();
    }

// Convierte el array de idiomas a un String
// (lo usa el toString)
// 1,3 ptos
//    función getIdiomasString 
    public String getIdiomasString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < (this.idiomas.length-1) ; i++){
            sb.append("").append(this.idiomas[i].toString()).append(", ");
        }
        sb.append("").append(this.idiomas[this.idiomas.length-1].toString());
        return sb.toString();
    }   
// Ejercicio 4: Mostrar los atributos de Libro de la siguiente forma
// 0,3 + 1,3(getIdiomasString) + 0,9(convierteFechaASp) = 2,5 ptos
@Override
public String toString() {
    String titulo = getTitulo();
    String autor = getAutor();
    String isbn = getIsbn();
    String fechaEsp = convierteFechaASp();
    String idiomas = getIdiomasString();
    StringBuilder sb = new StringBuilder();
    sb.append(titulo).append(", de ").append(autor).append("\n").append("Publicado el: ").append(convierteFechaASp()).append(" con un ISBN ").append(isbn + ".").append("Traducido al ").append(idiomas);
    return sb.toString();
    }

}
