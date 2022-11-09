/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7;

import guia_7.clases.Circunferencia;

/**
 *
 * @author Damian
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    /*
    2. Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de 
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del 
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Circunferencia c= new Circunferencia();
        c.crearCircunferencia(c);
        double area=c.area();
        double perimetro=c.perimetro();
        System.out.println("el area del circulo es "+area);
        System.out.println("el perimetro del circulo es "+perimetro);
        
    }
    
}
