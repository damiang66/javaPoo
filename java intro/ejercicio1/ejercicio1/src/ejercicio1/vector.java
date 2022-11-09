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
public class vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        int[]vector= new int[4];
        for(int i=0;i<4;i++){
            System.out.println("Ingrese un numero ");
             int numero = (int) (Math.random() * 10);
        vector[i]=numero;
        }
       for(int a:vector ){
            System.out.print("("+ a+")");
        }
        System.out.println("");
    }
    
    
}
