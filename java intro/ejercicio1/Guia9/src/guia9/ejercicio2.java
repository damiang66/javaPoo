/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9;

import guia9.Servicio.JuegoS;
import guia9.Servicio.JugadorS;
import guia9.Servicio.RevolverS;
import guia9.entidades.Juego;
import guia9.entidades.Jugador;
import guia9.entidades.Revolver;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        List<Jugador> jugador = new ArrayList();
        Revolver r;
        RevolverS sr = new RevolverS();
        Juego juego;
        JuegoS juegoServicio = new JuegoS();
        r=sr.llenarRevolver();
        
        JugadorS js = new JugadorS();
        System.out.println("Juego Ruleta Rusa");
        System.out.println("-------------------------");
        System.out.println(r.toString());
        System.out.println("ingrese la cantidad de jugadores");
        int cantidad = leer.nextInt();
        if (cantidad>1&& cantidad<6){
            for (int i = 0; i < cantidad; i++) {
               Jugador j=js.crear();
              // js.disparo(r, j);
               jugador.add(j);
               
            }
        }else{
            System.out.println("la cantidad es incorrecta se genera automaticamente en 6 jugadores");
            for (int i = 0; i < 6; i++) {
               Jugador j=js.crear();
              
               jugador.add(j); 
            }
 
        }
        System.out.println("------------------------------");    
        System.out.println("los jugadores son los siguientes");
        for (Jugador aux : jugador) {
            System.out.println(aux);
        }
        System.out.println("el juego empieza");
        juego=juegoServicio.llenarJuego(jugador, r);
            juegoServicio.ronda(juego);
        //System.out.println(valida);
       
        /*
        System.out.println(r);
        boolean validar=sr.mojar(r);
        System.out.println(validar);
        sr.siguienteChorro(r);
        System.out.println(r);
        */
        
        
    }
    
}
