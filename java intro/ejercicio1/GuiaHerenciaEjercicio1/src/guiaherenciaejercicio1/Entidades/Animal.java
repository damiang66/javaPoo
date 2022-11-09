/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaherenciaejercicio1.Entidades;

/**
 *
 * @author Damian
 */
public class Animal {
    protected String nombre;
  //  protected String alimento;
    protected int edad;
    protected String raza;
    protected String alimento;
    // constructores

    public Animal() {
    }

    public Animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
       this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void alimentar(){
        System.out.println("este animal se alimenta de "+this.alimento);
    }
    //mostrar

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", edad=" + edad + ", raza=" + raza + ", alimento=" + alimento + '}';
    }
    
}
