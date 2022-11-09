/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* 15. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los 
muestre por pantalla en orden descendente*/
       Scanner leer= new Scanner(System.in);
       int[] vector= new int[100];
       
       for(int i=0;i<100;i++){
           vector[i]=i+1;
       }
       for (int i=99;i>-1;i--){
           System.out.println("("+vector[i]+")");
       }
    }
    
}
