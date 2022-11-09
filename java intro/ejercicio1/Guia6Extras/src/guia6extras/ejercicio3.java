/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6extras;

import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* 3. Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String*/
       Scanner leer= new Scanner(System.in);
        System.out.println("ingrese una vocal");
       String vocal=leer.next();
       vocal = vocal.toLowerCase();
        //System.out.println(vocal);
        if (vocal.equals("a")||vocal.equals("e")||vocal.equals("i")||vocal.equals("o")||vocal.equals("u")){
            System.out.println("Ingreso una vocal");
            
            
        }else
            System.out.println("error al ingresar una vocal");
    }
    
}
