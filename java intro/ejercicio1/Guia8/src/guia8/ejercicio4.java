/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8;

import guia8.Entidades.Pelicula;
import guia8.Servicios.Comparatores;
import guia8.Servicios.PeliculaServicio;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para
esto, tendremos una clase Pelicula con el titulo, director y duración de la película (en
horas). Implemente las clases y métodos necesarios para esta situación, teniendo en
cuenta lo que se pide a continuación:
19
En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si
quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo 
en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo 
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla
        */
        Scanner leer = new Scanner(System.in);
        PeliculaServicio ps = new PeliculaServicio();
        String opcion="";
        do{
           Pelicula p= ps.cargar();
           ps.cargarLista(p);
            System.out.println("desea cargar otra pelicula ingrese si o cualquier tecla para parar");
            opcion=leer.next();
            opcion=opcion.toUpperCase();
        }while(opcion.equals("SI"));
        System.out.println("las peliculas cargadas son");
        ps.mostarLista();
        List pelicula = ps.lista();
        //ordenadas por clase Comparator
        Collections.sort(pelicula, Comparatores.ordenPorDuracion);
        System.out.println("ordena pelicula de menor a mayor");
        for (Object aux : pelicula) {
            System.out.println(aux);
        }
        Collections.sort(pelicula, Comparatores.duracionMayor);
        System.out.println("ordena pelicula de mayor a menor");
        for (Object aux : pelicula) {
            System.out.println(aux);
        }
        //ordenadas directamente desde la clase
       //ordenar por titulo
        Collections.shuffle(pelicula);
        System.out.println("Muestro desordenada");
        for (Object aux : pelicula) {
            System.out.println(aux);
        }
        Collections.sort(pelicula, Comparatores.titulo);
        System.out.println("ordeno por titulo");
        for (Object aux : pelicula) {
            System.out.println(aux);
        }
        System.out.println("ordeno por autor");
        Collections.sort(pelicula, Comparatores.director);
        for (Object aux : pelicula) {
            System.out.println(aux);
        }
    }
    
}
