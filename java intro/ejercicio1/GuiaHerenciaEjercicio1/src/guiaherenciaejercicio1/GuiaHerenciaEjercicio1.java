/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaherenciaejercicio1;

import guiaherenciaejercicio1.Entidades.Animal;
import guiaherenciaejercicio1.Entidades.Caballo;
import guiaherenciaejercicio1.Entidades.Gatos;
import guiaherenciaejercicio1.Entidades.Perro;

/**
 *
 * @author Damian
 */
public class GuiaHerenciaEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal gato = new Gatos("bosnia","Alimento para gato",1,"callejera");
        Animal perro = new Perro("Neron","Alimento para perro", 3, "obejero Aleman");
        Animal caballo = new Caballo("caballo lindo", "alimento para caballo", 5, "potro");
        System.out.println("el gato de nombre "+gato.getNombre());
        gato.alimentar();
        System.out.println("el perro de nombre "+perro.getNombre());
        perro.alimentar();
        System.out.println("el caballo de nombre "+ caballo.getNombre());
        caballo.alimentar();
    }
    
}
