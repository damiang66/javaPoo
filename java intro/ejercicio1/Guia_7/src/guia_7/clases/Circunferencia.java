/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7.clases;

import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Circunferencia {
    private double radio;
    //constructores
    
    public Circunferencia() {
    
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }
    //getter & setter

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    /**
     * lo utilizamos para crear circunferencioa
     * @param c 
     */
    public void crearCircunferencia(Circunferencia c){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el radio del circulo");
       c.setRadio(leer.nextDouble());
        System.out.println("");
    }
    /**
     * metodo para calcular el area
     */
    public double area(){
        double a;
        a=3.14*(this.getRadio()*this.getRadio());
        
        return a;
    }
    /**
     * calulamos el perimetro
    **/
    public double perimetro(){
        double p;
        p=(2*3.14*this.getRadio());
        return p;
    }
}

