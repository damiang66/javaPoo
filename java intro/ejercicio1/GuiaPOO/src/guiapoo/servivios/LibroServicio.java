/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapoo.servivios;

import guiapoo.entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class LibroServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libro crearLibro() {
        System.out.println("ingrese el ISBN");
        int numero = leer.nextInt();
        System.out.println("ingrese el titulo");
        String titulo = leer.next();
        System.out.println("ingrese el autor");
        String autor = leer.next();
        System.out.println("ingrese el numero de paginas");
        int numeroPagina = leer.nextInt();
        return new Libro(numero, titulo, autor, numeroPagina);
    }

    public void mostrar(Libro l) {
        System.out.println(l.toString());
    }
}
