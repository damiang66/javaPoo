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
public class ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* 19. Escriba un programa que averigüe si dos vectores de N enteros son iguales (la 
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los 
elementos)*/
       Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de elementos que va a tener los vectores ");
        int c = leer.nextInt();
        int d=0;
        int []vector=new int [c],vector1=new int[c];
        System.out.println("llenamos el vector nro 1");
        llenar(vector,c);
        System.out.println("llenamos el vector nro 2");
        llenar(vector1,c);
        for(int i = 0; i<c ;i++){
            if(vector[i]!=vector1[i]){
                System.out.println("no tienen los elementos iguales");
                d=1;
                break;
            }
        }
       if (d==0){
           System.out.println("los dos vectores son iguales");
       }
    }
    public static void llenar(int []vector,int c){
        Scanner leer= new Scanner(System.in);
        for (int i=0;i<c;i++){
            System.out.println("ingrese el elemento nro "+i);
            vector[i]=leer.nextInt();
        }
        
    }
}
