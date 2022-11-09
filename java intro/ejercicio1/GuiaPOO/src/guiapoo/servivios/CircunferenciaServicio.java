/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapoo.servivios;

import guiapoo.entidades.Circunferencia;
import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class CircunferenciaServicio {
    Scanner leer= new Scanner(System.in);
    Circunferencia c;
    public Circunferencia crearCirculo(){
        System.out.println("ingrese el radio");
        double radio = leer.nextDouble();
        c=new Circunferencia(radio);
        return c;
    }
    public double area(){
        return PI*Math.pow(c.getRadio(), 2);
    }
    public double perimetro(){
        return 2*PI*c.getRadio();
    }
    
    
}
