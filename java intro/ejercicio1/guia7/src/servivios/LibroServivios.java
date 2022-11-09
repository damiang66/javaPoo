/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servivios;

import clases.Libro;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class LibroServivios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Libro libro = new Libro();

    public Libro cargar() {
        System.out.println("ingrese un numero del libro");
        libro.setNumero(leer.nextInt());
        System.out.println("ingrese un titulo del libro");
        libro.setTitulo(leer.next());
        System.out.println("ingrese el Autor del libro");
        libro.setAutor(leer.next());
        System.out.println("ingrese el total de paginas del libro");
        libro.setPagina(leer.nextInt());
        return libro;

    }

    public String mostrar() {
        return libro.toString();
    }
}
