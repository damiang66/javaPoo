/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8;

import java.util.ArrayList;
import java.util.List;
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
        // TODO code application logic here
        /*
        . Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList
        */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        List<String>raza= new ArrayList();
        int opcion=0;
        while (opcion!=1){
            System.out.println("ingrese una raza de perro");
            raza.add(leer.next());
            System.out.println("desea salir con el 1 se sale");
            opcion=leer.nextInt();
        }
        System.out.println("la razas que ingreso son");
        for (String aux : raza) {
            System.out.println(aux);
            
        }
        
    }
    
}
