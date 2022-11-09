/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.Servicios;

import guia8.Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class PeliculaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Pelicula p;
    Calendar calendario = new GregorianCalendar();
    List <Pelicula> pelicula = new ArrayList();
    public Pelicula cargar(){
        System.out.println("ingrese el titulo de la pelicula");
        String titulo=leer.next();
        System.out.println("Ingrese el director de la pelicula");
        String director=leer.next();
        System.out.println("ingrese la duracion de la pelicula en horas");
        Integer hora = leer.nextInt();
        p= new Pelicula(titulo,director,hora);
       return p;
    }
    public void cargarLista(Pelicula p){
      pelicula.add(p);
    }
    public List lista(){
        return pelicula;
    }
    /**
     * muestro peliculas como fueron cargadas
     */
    public void mostarLista(){
        for (Pelicula aux : pelicula) {
            System.out.println(aux.toString());
        }
    }
   
       
        
    }
    
