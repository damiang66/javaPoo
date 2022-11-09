/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapoo;

import guiapoo.entidades.Libro;
import guiapoo.servivios.LibroServicio;

/**
 *
 * @author Damian
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LibroServicio ls = new LibroServicio();
        Libro l =ls.crearLibro();
        ls.mostrar(l);
        //System.out.println("menu\nHola\n\tChau");
    }
    
}
