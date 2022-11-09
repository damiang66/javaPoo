/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapoo.entidades;

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
        return "Circunferencia{" + "radio=" + radio + '}';
    }
    
}
