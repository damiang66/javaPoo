/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2guiarelacion.entidad;

import java.util.List;

/**
 *
 * @author Damian
 */
public class Baraja {
    private List<Carta> carta;

    public Baraja() {
    }

    public Baraja(List<Carta> carta) {
        this.carta = carta;
    }

    public List<Carta> getCarta() {
        return carta;
    }

    public void setCarta(List<Carta> carta) {
        this.carta = carta;
    }

    @Override
    public String toString() {
        return "Baraja{" + "carta=" + carta + '}';
    }
    
}

