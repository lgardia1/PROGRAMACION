/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exa1eval_23_24_alus;

import java.time.LocalDate;

/**
 *
 * @author Rut y Lucas
 */
public class Exa1Eval_23_24_alus {
    //LUCAS GARCIA DIAZ
    public static void main(String[] args) {
        // Idiomas a los que es traducido cada libro
        String[] tradDime = {"RUSO", "FRANCÉS", "INGLÉS"};
        String[] tradDonQ = {"Inglés", "Francés", "Alemán", "Italiano"};
        String[] tradHistoria = {"Español", "Francés", "Hindi", "Italiano"};
        String[] tradAnillos = {"Español", "Árabe", "Alemán", "Chino"};
        String[] tradHobbit = {"RUSO", "FRANCÉS", "INGLÉS", "Alemán", "urdu" };
        String[] tradCao = {"Chino", "urduli", "PORTUGUÉS", "RUSO"};

        // Creación de la biblioteca
        int numLibros = 6;
        Libro[] biblio = new Libro[numLibros];
        biblio[0] = new Libro("Dime quién soy", "Julia Navarro",  
                "978-5444-234-53-7", "22-12-2020", tradDime);
        
        biblio[1] = new Libro("Don Quijote de La Mancha", 
                                "Miguel de Cervantes Saavedra",  
                "978-84-670-4869-1", "01-01-1605", tradDonQ);
        biblio[2] = new Libro("Historia de dos ciudades", 
                                "Charles Dickens",  
                "978-0-14-143960-0", "01-01-1859", tradHistoria);
        biblio[3] = new Libro("El Señor de los Anillos", 
                                "JRR Tolkien",  
                "978-0-261-10235-4", "11-12-1954", tradAnillos);
        biblio[4] = new Libro("El Hobbit", 
                                "JRR Tolkien",  
                "978-0-395-54421-9", "31-01-1937", tradHobbit);
        biblio[5] = new Libro("Sueño en el pabellón rojo", 
                                "Cao Xueqin",  
                "978-7-119-00066-8", "02-02-1788", tradCao);
        
        // Muestro todos los libros de la biblioteca
        System.out.println("LIBROS EN LA BIBLIOTECA");
        System.out.println("-----------------------");
        
        for (Libro libro : biblio) {
            System.out.println(libro);
        }
        System.out.println("");
        // Ejercicio 5: Mostrar la información de los libros anteriores al siglo x
        mostrarLibros(19, biblio);
    }
    
    // Ejercicio 5: Mostrar la información de los libros anteriores al siglo x
    // 1,5 ptos + 0,8 = 2,3
//   función mostrarLibros
    public static void mostrarLibros(int siglo , Libro[] biblio){
        int[] cualSiglo = verSiglo(siglo , biblio);
        boolean noExiste = true;
        System.out.println("LIBROS ANTERIORES AL SIGLO "+siglo);
        System.out.println("-----------------------");
        for(int i = 0 ; i < biblio.length ; i++){
            if(cualSiglo[i] == 1){
                System.out.println(biblio[i]);
                noExiste = false;
            }
        }
        if(noExiste){
            System.out.println("No existe libros anteriores al siglo " + siglo);
        }
    }
    // 0,8 ptos
//    función verSiglo
    public static int[] verSiglo(int siglo , Libro[] biblio){
        int[] cualSiglo = new int[biblio.length];
        for(int i = 0 ; i < biblio.length ; i++){
            int año = 0;
            año = (int)(((biblio[i].getFecha()).getYear())/100);
            año += 1;
            if(año < siglo){
                cualSiglo[i] = 1;
            }else{
                cualSiglo[i] = 0;
            }
        }
        return cualSiglo;
    }
}
