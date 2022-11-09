/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2guiarelacion.entidad;

import ejercicio2guiarelacion.Raza;

/**
 *
 * @author Damian
 */
public class Perro {
    private String nombre;
    private Raza raza;
    private int edad;
    //constructores

    public Perro() {
    }

    public Perro(String nombre, Raza raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }
    //setter & getter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    //mostrar

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + '}';
    }
    
    
}
