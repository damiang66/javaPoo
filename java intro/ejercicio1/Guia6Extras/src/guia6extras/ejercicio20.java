/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6extras;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*20. Crear una función rellene un vector con números aleatorios, pasándole un arreglo por 
parámetro. Después haremos otra función o procedimiento que imprima el vector.*/
        System.out.println("Bienvenidos al Sistema para cargar un vector y mostrar sus datos");
        System.out.println("Empecemos");
        System.out.println("desea cargar al vector");
        System.out.println("1-SI");
        System.out.println("2-No");
        Scanner leer= new Scanner(System.in);
        int opcion =leer.nextInt();
        int []vector=new int [4];
        if (opcion==1){
            llenar(vector);
        }else{
            System.out.println("saliendo del sitema");
        }
        System.out.println("desea mostrar el vector");
        System.out.println("1-SI");
        System.out.println("2-No");
      
        opcion=leer.nextInt();
        if (opcion==1){
            mostrar(vector);
        }else
            System.out.println("saliendo del sistema");
        
    }
    public static void llenar (int []v){
        Random entero= new Random();
        int numero;
        for (int i=0;i<4;i++){
           numero=entero.nextInt(1+10);
           v[i]=numero;
        }
    }
    public static void mostrar(int []v){
        for(int elemento:v){
            System.out.print("("+elemento+")");
        }
        System.out.println("");
    }
}
