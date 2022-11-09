/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapoo;

import guiapoo.entidades.Circunferencia;
import guiapoo.servivios.CircunferenciaServicio;

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
        CircunferenciaServicio cs = new CircunferenciaServicio();
        Circunferencia c = cs.crearCirculo();
        System.out.println("el area de la circunferencia es "+cs.area());
        System.out.println("el perimetro de la circunferencia es "+cs.perimetro());
        System.out.println("el circulo creado es ");
        System.out.println(c);
    }
    
}
