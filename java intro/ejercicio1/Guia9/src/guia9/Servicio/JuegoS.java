/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.Servicio;

import guia9.entidades.Juego;
import guia9.entidades.Jugador;
import guia9.entidades.Revolver;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Damian
 */
public class JuegoS {
    public Juego llenarJuego(List<Jugador>j,Revolver r){
        
        Juego juego = new Juego();
       juego.jugador=j;
       juego.r=r;
       return juego;
    }
    public void ronda(Juego juego){
        Jugador j = new Jugador();
        int e=0;
          do{
        for (int i = 0; i < juego.jugador.size(); i++) {
          
            if(juego.jugador.get(i).isMojado()==false){
                System.out.println("disparo nro"+i);
               boolean mojo =j.disparo(juego.r);
             if (mojo){
                   juego.jugador.get(i).setMojado(true);
                 System.out.println("el jugador que se mojo es " +juego.jugador.get(i));
               
             }
               
            }else{
                System.out.println("el jugador que se mojo es"+juego.jugador.get(i));
            }
                 e=i;
        }
       
            }while(juego.jugador.get(e).isMojado()==true);
    }
    public void mostrar(Juego juego){
        System.out.println(juego.toString());
    }
    
}
