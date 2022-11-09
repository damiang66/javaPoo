/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.entidades;

import java.util.List;

/**
 *
 * @author Damian
 */
public class Cartas {
    private List<Integer> numero;
    private List<String>palo;
    //constructores

    public Cartas() {
    }

    public Cartas(List<Integer> numero, List<String> palo) {
        this.numero = numero;
        this.palo = palo;
    }
    //setter & gette

    public List<Integer> getNumero() {
        return numero;
    }

    public void setNumero(List<Integer> numero) {
        this.numero = numero;
    }

    public List<String> getPalo() {
        return palo;
    }

    public void setPalo(List<String> palo) {
        this.palo = palo;
    }
    //mostrar

    @Override
    public String toString() {
        return "Carta{" + "numero=" + numero + ", palo=" + palo + '}';
    }
    
    
}
