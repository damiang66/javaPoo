/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7;

import guia_7.clases.Rectangulo;
import guia_7.servivios.RectanguloS;

/**
 *
 * @author Damian
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RectanguloS rs=new RectanguloS();
         Rectangulo r=rs.crear();
         int superficie = rs.superficie();
         System.out.println("la superficie del rectangulo es "+superficie);
         System.out.println("el perimetro del rectangulo es "+rs.perimetro());
         rs.dibujar();
    }
    
}
