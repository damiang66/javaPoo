/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.Servicios;

import guia8.Entidades.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Damian
 */
public class Comparatores {
    public static Comparator<Pelicula> ordenPorDuracion=new Comparator<Pelicula>() {
        public int compare(Pelicula a1,Pelicula a2){
            return a1.getDuracion().compareTo(a2.getDuracion());
            
        }
    };
     public static Comparator<Pelicula> duracionMayor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
         return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
      public static Comparator<Pelicula> titulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
         return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
      public static Comparator<Pelicula> director = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
         return t.getAutor().compareTo(t1.getAutor());
        }
    };
    
}
