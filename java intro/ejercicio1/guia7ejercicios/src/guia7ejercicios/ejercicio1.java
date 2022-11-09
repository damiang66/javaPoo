/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicios;

import clases.Libro;
import java.util.Scanner;

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
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese ISBN del libro");
        int ISBN=leer.nextInt();
        System.out.println("ingrese titulo del libro");
        String titulo=leer.next();
               // leer.nextLine();
        System.out.println("ingrese el autor del libro");
        String autor = leer.next();
        
        System.out.println("ingrese la cantidad de paginas que tiene el libro");
        int paginas=leer.nextInt();
        Libro libro1 = new Libro(ISBN,titulo,autor,paginas);
        System.out.println(libro1.ISBN+" - "+libro1.titulo+" - "+libro1.autor+" - "+libro1.numeroPagina);
       
    }
    
}
