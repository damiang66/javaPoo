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
public class ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de 
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad 
de hijos para averiguar la media de edad de los hijos de todas las familias*/
       Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de familias");
        int familia = leer.nextInt();
        int hijos;int edad;int promedio;
        for(int i=0;i<familia;i++){
            promedio=0;
        System.out.println("ingrese la cantidad de hijo de la familia "+i);
         hijos=leer.nextInt();
        for (int j=0;j<hijos;j++){
            System.out.println("ingrese las edades del hijo nro "+j+" de la familia nro "+i);
            edad=leer.nextInt();
            promedio+=edad/hijos;
        }
            System.out.println("el promedio de las edades de los hijos de la familia "+i+ " es "+promedio);
        }
      // int [][]matriz=new int [1][1];
    }
    
}
