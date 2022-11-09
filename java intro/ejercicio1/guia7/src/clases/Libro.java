/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Damian
 */
public class Libro {
    private int numero;
    private String titulo;
    private String autor;
    private int pagina;

    public Libro() {
    }

   public Libro(int numero,String titulo,String autor,int pagina){
       
   }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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

    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }

    @Override
    public String toString() {
        return "Libro{" + "numero=" + numero + ", titulo=" + titulo + ", autor=" + autor + ", pagina=" + pagina + '}';
    }
   
}
