/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9;

import guia9.Servicio.PerroServicio;
import guia9.Servicio.PersonaP;
import guia9.entidades.Perro;
import guia9.entidades.Per;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Per persona1;
        PerroServicio ps = new PerroServicio();
        PersonaP spersona = new PersonaP();
        Per persona2 ;
        Perro perro1;
        Perro perro2;
        System.out.println("ingrese el primer perro");
       perro1 = ps.crear();
        System.out.println(perro1);
        System.out.println("ingrese el segundo perro");
        perro2=ps.crear();
        System.out.println(perro1);
        System.out.println(perro2);
        System.out.println("ingrese la primer persona");
        persona1= spersona.crear();
        System.out.println("la mascosta asiganada para esta persona es "+perro1.toString());
        persona1.setMascota(perro1);
        System.out.println("ingrese la segunda persona");
        persona2=spersona.crear();
        System.out.println("la mascota asignada a esta persona es "+perro2.toString());
        persona2.setMascota(perro2);
        System.out.println("la primer persona ingreseda tiene estos datos");
        System.out.println(persona1.toString());
        System.out.println("la segunda persona ingresada tiene estos datos");
        System.out.println(persona2.toString());
    }
    
}
