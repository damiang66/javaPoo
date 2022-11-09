/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.Servicio;

import guia9.entidades.Revolver;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class RevolverS {
    Scanner leer = new Scanner(System.in);
    Random azar = new Random();
    public Revolver llenarRevolver(){
       int actual;
       int tambor;
        Revolver r;
        do{
         actual=azar.nextInt(5);
       // int tambor=(int)(Math.random()*100);
        tambor = azar.nextInt(6);
      
        
        }while (actual>tambor);
         r= new Revolver(actual, tambor);
        return r;
    }
    public boolean mojar(Revolver r){
        return r.getPosicionActual()==r.getTambor();
    }
    public void siguienteChorro(Revolver r){
        r.setPosicionActual(r.getPosicionActual()+1);
        
    }
}
