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
public class ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        Random aleatorio=new Random();
        System.out.println("ingrese tamaño de fila de la matiz");
        int fila=leer.nextInt();
        System.out.println("ingrese tamaño de columna de la matriz");
        int columna=leer.nextInt();
        int [][] matriz= new int [fila][columna];
        for (int i=0;i<fila;i++){
            for (int j=0;j<columna;j++){
                matriz[i][j]=aleatorio.nextInt(1+10);
            }
        }
        /*for (int[] f:matriz){
            for(int []c:matriz){
                 System.out.print("("+[f]+[c]+")");
            }
           
        }*/
        int suma=0;
        System.out.println("la matriz tiene los siguientes elementos");
        for(int i=0;i<fila;i++){
            for(int j=0;j<columna;j++){
                suma+=matriz[i][j];
                System.out.print("("+matriz[i][j]+")");
            }
            System.out.println("");
        }
        System.out.println("la suma de todos los elementos de la matriz es "+suma);
    }
    
}
