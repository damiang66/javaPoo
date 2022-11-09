/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Damian
 */
public class Alumno {
    private String nombre;
   private int nota;
   private int nota1;
   private int nota2;

   public Alumno(){
       
   }
    public Alumno(String nombre, int nota, int nota1, int nota2) {
        this.nombre = nombre;
        this.nota = nota;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", nota=" + nota + ", nota1=" + nota1 + ", nota2=" + nota2 + '}';
    }
    
    
    
}

