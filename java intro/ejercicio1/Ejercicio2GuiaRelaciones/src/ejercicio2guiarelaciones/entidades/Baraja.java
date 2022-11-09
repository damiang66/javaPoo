/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2guiarelaciones.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Damian
 */
public class Baraja {
    private List<Integer>numero=new ArrayList<>();
    private List<String> palo= new ArrayList<>();

    public Baraja() {
        
    }

    public Baraja(List<Integer> numero, List<String> palo) {
        this.numero = numero;
        this.palo = palo;
    }
    //setter & getter

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
