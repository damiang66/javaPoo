/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaherenciaextra1.entidades;

/**
 *
 * @author Damian
 */
public class Barco {
    protected int matricula;
    protected int eslora;
    protected int año;
    
    //constructotes 

    public Barco() {
    }

    public Barco(int matricula, int eslora, int año) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.año = año;
    }
    // setter & getter
    
}
