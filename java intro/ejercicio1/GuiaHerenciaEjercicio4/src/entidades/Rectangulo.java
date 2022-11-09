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
public class Rectangulo implements Calculo{

    private int largo;
    private int ancho;
    //constructores

    public Rectangulo() {

    }

    public Rectangulo(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }
    //setter & getter

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    //mostrar

    @Override
    public String toString() {
        return "Rectangulo{" + "largo=" + largo + ", ancho=" + ancho + '}';
    }

    @Override
    public void calcularArea() {
        System.out.println("el area del rectangulo es "+ this.getAncho()*this.getLargo());
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("el perimetro del rectangulo es "+ (2*this.getAncho()+2*this.getLargo()));
    }
    

}
