/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7;

import guia_7.clases.Libro;
import guia_7.servivios.LibroServicios;

/**
 *
 * @author Damian
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    /*
    1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un 
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
numero de páginas
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro l;
        LibroServicios ls = new LibroServicios();
        
       l= ls.crearLibro();
        System.out.println(l);
            
      
    }
    
}
