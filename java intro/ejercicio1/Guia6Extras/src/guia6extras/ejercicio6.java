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
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*  Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por 
debajo de 1.60 mts. y el promedio de estaturas en general*/
      Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas que va a ingresar");
        int cantidadPersonas=leer.nextInt();
        double [] altura= new double[cantidadPersonas];
        double estaturaBaja,promedio;
        int c=0;
        estaturaBaja=0;
        promedio=0;
        
        for(int i=0;i<cantidadPersonas;i++){
            System.out.println("Ingrese estatura de la persona "+i);
            altura[i]=leer.nextDouble();
        }
        for(double elementos:altura){
            promedio+=elementos;
            if (elementos<1.60){
            estaturaBaja+=elementos;
            c++;
        }
        }
        System.out.println("El promedio de las personas con estaturas menor a 1,60 es "+estaturaBaja/c);
        System.out.println("El promedio de todas las estaturas ingresadas es "+promedio/cantidadPersonas);
    }
    
}
