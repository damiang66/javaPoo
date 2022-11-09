/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7.clases;

/**
 *
 * @author Damian
 */
public class Libro {
    private int ISBN;
    private String titulo;
    private String autor;
    private int numeroPagina;
    //constructores
    public Libro(){
        
    }

    public Libro(int ISBN, String titulo, String autor, int numeroPagina) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPagina = numeroPagina;
    }
    //setter & getter
    public int getISBN(){
        return ISBN;
    }
    public  void setISBN(int ISBN){
        this.ISBN=ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroPagina() {
        return numeroPagina;
    }

    public void setNumeroPagina(int numeroPagina) {
        this.numeroPagina = numeroPagina;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numeroPagina=" + numeroPagina + '}';
    }
    
    
    
}
