/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

import servivios.LibroServivios;

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
        LibroServivios ls = new LibroServivios();
        ls.cargar();
        System.out.println(ls.mostrar());
        
    }
    
}
