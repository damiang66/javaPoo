/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7.servivios;

import guia_7.clases.Libro;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class LibroServicios {
    Libro l = new Libro();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
   public Libro crearLibro(){
       System.out.println("ingrese el ISBN del libro");
       l.setISBN(leer.nextInt());
       System.out.println("ingrese el titulo del libro");
       l.setTitulo(leer.next());
       System.out.println("ingrese el autor del libro");
       l.setAutor(leer.next());
       System.out.println("ingrese las cantidad de paginas que tiene el libro");
       l.setNumeroPagina(leer.nextInt());
       return l;
   }
   
}
