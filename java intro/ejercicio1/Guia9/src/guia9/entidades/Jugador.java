/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.entidades;

import guia9.Servicio.RevolverS;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Jugador {
    private Integer id;
    private String nombre;
    private boolean mojado;
    //constructores

    public Jugador() {
    }

    public Jugador(Integer id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }

   
    //setter & getter

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    //metodos
      Scanner leer = new Scanner(System.in);
    int a=0;
    public Jugador crear(){
        Jugador j= new Jugador();
        j.setId(a++);
        j.setNombre("jugador "+j.getId());
        j.setMojado(false);
        return j;
    }
    public boolean disparo(Revolver r){
       RevolverS rs = new RevolverS();
       boolean mojado=rs.mojar(r);
       rs.siguienteChorro(r);
       if (mojado==true){
           this.setMojado(mojado);
           return true;
       }else{
           return false;
           
       } 
        
    }
    
    //mostrar

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }

    
    
}
