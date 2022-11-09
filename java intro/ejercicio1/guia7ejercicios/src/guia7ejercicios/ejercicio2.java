/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicios;

import clases.Circunferencia;
import java.util.Scanner;


/**
 *
 * @author Damian
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circunferencia c = new Circunferencia();
        Scanner leer = new Scanner(System.in);
       
        System.out.println("ingrese el radio de la circunferencia");
       double radio=leer.nextDouble();
        c.crearCircunferencia(radio);
        c.Area(radio);
        c.Perimetro(radio);
        System.out.println(c.toString());
      }
   
}
