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
public class ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*18. Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño 
N, con los valores ingresados por el usuario*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elmentos que va a tener el vector");
        int c=leer.nextInt();
        int suma=0;
        int []vector=new int [c];
        for(int i=0;i<c;i++){
            System.out.println("ingrese el elemento nro "+i+" del vecto");
            vector[i]=leer.nextInt();
        }
        for(int elemento:vector){
            suma+=elemento;
            
        }
        System.out.println("la suma de todos los elementos del vector es "+ suma);
    }
    
}
