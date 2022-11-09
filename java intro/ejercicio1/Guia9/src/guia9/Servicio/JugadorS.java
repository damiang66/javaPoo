/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.Servicio;

import guia9.entidades.Jugador;
import guia9.entidades.Revolver;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class JugadorS {
    Scanner leer = new Scanner(System.in);
    int a=0;
    public Jugador crear(){
        Jugador j= new Jugador();
        j.setId(a++);
        j.setNombre("jugador "+j.getId());
        j.setMojado(false);
        return j;
    }
    public boolean disparo(Revolver r,Jugador j){
       RevolverS rs = new RevolverS();
       boolean mojado=rs.mojar(r);
       rs.siguienteChorro(r);
       if (mojado){
           j.setMojado(mojado);
           return true;
       }else{
           return false;
           
       } 
        
    }
}
