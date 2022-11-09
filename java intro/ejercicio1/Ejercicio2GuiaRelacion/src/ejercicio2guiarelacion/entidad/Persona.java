/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2guiarelacion.entidad;

import java.util.List;

/**
 *
 * @author Damian
 */
public class Persona {
    private String Nombre;
    private int dni;
    private List<Perro> mascota;
    //constructores

    public Persona() {
    }

    public Persona(String Nombre, int dni, List<Perro> mascota) {
        this.Nombre = Nombre;
        this.dni = dni;
        this.mascota = mascota;
    }
    //setter and Getter

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public List<Perro> getMascota() {
        return mascota;
    }

    public void setMascota(List<Perro> mascota) {
        this.mascota = mascota;
    }
    //mostrar

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", dni=" + dni + ", mascota=" + mascota + '}';
    }
    
}
