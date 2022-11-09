/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7.clases;

/**
 *
 * @author Damian
 */
public class Operaciones {
    private int numero1;
    private int numero2;
    // constructores

    public Operaciones() {
    }

    public Operaciones(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    // setter & getter

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    // mostrar

    @Override
    public String toString() {
        return "Operaciones{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }
    
    
}
