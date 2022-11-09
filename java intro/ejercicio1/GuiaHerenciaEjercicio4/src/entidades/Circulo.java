/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import interfaces.Calculo;

/**
 *
 * @author Damian
 */
public class Circulo implements Calculo {
    private double radio;
    //constructores

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    //setter & getter

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    //mostrar

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    @Override
    public void calcularArea() {
        System.out.println("el area del circulo es "+3.14*this.getRadio()*this.getRadio());
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("el perimetro del circulo es "+2*3.14*this.getRadio());
    }
    
}
