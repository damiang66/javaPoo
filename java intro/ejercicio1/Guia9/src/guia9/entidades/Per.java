/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.entidades;

/**
 *
 * @author Damian
 */
public class Per {
    private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    private Perro mascota;
    //constructores
public Per(){
    
}
    public Per(String nombre, String apellido, int edad, int dni, Perro mascota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.mascota = mascota;
    }
    //setter & getter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Perro getMascota() {
        return mascota;
    }

    public void setMascota(Perro mascota) {
        this.mascota = mascota;
    }
    //mostrar

  
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni + ", mascota=" + mascota + '}';
    }
    
    
}

