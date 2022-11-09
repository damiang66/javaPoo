/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.Servicio;

import guia9.entidades.Perro;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class PerroServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
    public Perro crear(){
         Perro p = new Perro();
        System.out.println("ingrese nombre de perro");
        p.setNombre(leer.next());
        System.out.println("ingrese la raza del perro");
        p.setRaza(leer.next());
        System.out.println("ingrese la edad del perro");
        p.setEdad(leer.nextInt());
        System.out.println("ingrese tamaño del perro");
        p.setTamaño(leer.next());
        return p;
    }
}
