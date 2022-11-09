/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapoo.entidades;

/**
 *
 * @author Damian
 */
public class Libro {
    private int numeroLibro;
    private String titulo;
    private String autor;
    private int numeroPagina;
// constructores
    public Libro() {
    }

    public Libro(int numeroLibro, String titulo, String autor, int numeroPagina) {
        this.numeroLibro = numeroLibro;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPagina = numeroPagina;
    }
    // setter & getter

    public int getNumeroLibro() {
        return numeroLibro;
    }

    public void setNumeroLibro(int numeroLibro) {
        this.numeroLibro = numeroLibro;
    }

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

    public int getNumeroPagina() {
        return numeroPagina;
    }

    public void setNumeroPagina(int numeroPagina) {
        this.numeroPagina = numeroPagina;
    }
    // mostrar

    @Override
    public String toString() {
        return "Libro{" + "numeroLibro=" + numeroLibro + ", titulo=" + titulo + ", autor=" + autor + ", numeroPagina=" + numeroPagina + '}';
    }
    
    
}
