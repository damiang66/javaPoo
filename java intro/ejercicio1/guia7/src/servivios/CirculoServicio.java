/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servivios;

import clases.Circulo;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class CirculoServicio {
    Circulo circulo= new Circulo();
    Scanner leer = new Scanner(System.in);
    public void crearCirculo(){
        System.out.println("ingrese un radio para el circulo");
      circulo.setRadio(leer.nextDouble());
       
     
    }
    public void area(){
    circulo.setArea(3.14*(circulo.getRadio()*circulo.getRadio()));
    }
    public void perimetro(){
    circulo.setPerimetro(2*3.14*circulo.getRadio());
    }  
    public String mostrar(){
       return circulo.toString();
    }
}
