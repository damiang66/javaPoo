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
    public int ISBN;
    public String titulo;
    public String autor;
    public int numeroPagina;
    public Libro(){

}
    public Libro(int ISBN,String titulo,String autor,int numeroPagina){
        this.ISBN=ISBN;
        this.titulo=titulo;
        this.autor=autor;
        this.numeroPagina=numeroPagina;
}
}


