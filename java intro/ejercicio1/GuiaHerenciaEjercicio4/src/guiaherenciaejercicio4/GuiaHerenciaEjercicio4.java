/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaherenciaejercicio4;

import entidades.Circulo;
import entidades.Rectangulo;

/**
 *
 * @author Damian
 */
public class GuiaHerenciaEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Rectangulo r = new Rectangulo(10, 5);
       r.calcularArea();
       r.calcularPerimetro();
       Circulo c = new Circulo(25);
       c.calcularArea();
       c.calcularPerimetro();
    
}
}