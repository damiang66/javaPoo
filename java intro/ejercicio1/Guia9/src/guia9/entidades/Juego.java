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
public class Juego {
    public List<Jugador> jugador;
    public Revolver r;
    //constructores

    public Juego() {
    }

    public Juego(List<Jugador> jugador, Revolver r) {
        this.jugador = jugador;
        this.r = r;
    }
    //mostrar

    @Override
    public String toString() {
        return "Juego{" + "jugador=" + jugador + ", r=" + r + '}';
    }
    
}
