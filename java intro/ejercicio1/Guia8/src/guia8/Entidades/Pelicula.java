/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.Entidades;

import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author Damian
 */
public class Pelicula implements Comparable<Pelicula> {
    private String titulo;
    private String autor;
    private Integer duracion;
    // contructores

    public Pelicula() {
    }

    public Pelicula(String titulo, String autor, Integer duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
    }
    // setter & getter

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }
    //comparator
    
            
            
            
    //mostrar

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", autor=" + autor + ", duracion=" + duracion + '}';
    }

    public int compararTitulo(Pelicula t) {
       return this.titulo.compareTo(t.getTitulo());
    }

    @Override
    public int compareTo(Pelicula t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
    

