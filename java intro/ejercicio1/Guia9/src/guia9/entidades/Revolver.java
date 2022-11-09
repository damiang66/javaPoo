/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.entidades;

import java.util.Random;

/**
 *
 * @author Damian
 */
public class Revolver {
    private int posicionActual;
    private int tambor;
    //constructores

    public Revolver() {
    }

    public Revolver(int posicionActual, int tambor) {
        this.posicionActual = posicionActual;
        this.tambor = tambor;
    }
    // setter & getter

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getTambor() {
        return tambor;
    }

    public void setTambor(int tambor) {
        this.tambor = tambor;
    }
    public Revolver llenarRevolver(){
        Random azar = new Random();
        Revolver r;
        int actual=azar.nextInt(5);
       // int tambor=(int)(Math.random()*100);
       int tambor = azar.nextInt(5);
       r= new Revolver(actual, tambor);
        return r;
    }
    public boolean mojar(Revolver r){
        return r.getPosicionActual()==r.getTambor();
    }
    public void siguienteChorro(Revolver r){
        r.setPosicionActual(r.getPosicionActual()+1);
        
    }
    //mostrar

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", tambor=" + tambor + '}';
    }
    
    
}
