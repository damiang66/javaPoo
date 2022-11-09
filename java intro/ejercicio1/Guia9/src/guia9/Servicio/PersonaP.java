/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.Servicio;

import guia9.entidades.Per;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class PersonaP {
   
   Scanner leer = new Scanner(System.in).useDelimiter("\n");
   public Per crear(){
       Per p = new Per();
       System.out.println("ingrese nombre de la persona");
       p.setNombre(leer.next());
       System.out.println("ingrese apellido de la persona");
       p.setApellido(leer.next());
       System.out.println("ingrese la edad de la persona");
       p.setEdad(leer.nextInt());
       System.out.println("ingrese el dni de la persona");
       p.setDni(leer.nextInt());
       return p;
   }
}
