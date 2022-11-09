/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import static java.lang.Math.abs;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int valorDado = Math.floor(Math.random()*10+1);
      /*  16. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al 
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el 
numero y si se encuentra repetid*/
      /*int min_val = 10;
        int max_val = 100;
        Random ran = new Random();
        int x = ran.nextInt(max_val) + min_val;*/
       
      Scanner leer= new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector");
        int longitud = leer.nextInt();
        int [] vector= new int[longitud];
        for(int i=0;i<vector.length;i++){
        int min=1;
       int max=10;
        Random entero = new Random();
        int numero=entero.nextInt(min+max);
        
        vector[i]=numero;
        }
        for (int i=0;i<vector.length;i++){
            System.out.println("("+vector[i]+")");
        }
        System.out.println("ingrese el numero a buscar");
        int buscar =leer.nextInt();
        int contador=0;
         for (int i=0;i<vector.length;i++){
            if (buscar==vector[i]){
                System.out.println("el numero se encontro en la posicion "+i);
                contador++;
                
            }
        }
             System.out.println("el numero se encontro "+ contador + " veces"); 
      
    }
    
}
