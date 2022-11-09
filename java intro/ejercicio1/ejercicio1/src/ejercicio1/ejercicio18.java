/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Random;

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
        int[][]matriz= new int[4][4];
        Random numero = new Random();
        for(int i=0;i<matriz.length;i++){
             for(int j=0;j<matriz.length;j++){
                 
                 matriz[i][j]=numero.nextInt(9);
             
             }
         } 
       for(int i=0;i<matriz.length;i++){
             for(int j=0;j<matriz.length;j++){
                 
                 System.out.print("("+matriz[i][j]+")");
             
             }
             System.out.println("");
         }  
        System.out.println("-----------------");
       matrizB(matriz);
    }
     public static void matrizB(int matriz[][]){
        int[][] matriz1= new int [4][4];
       for (int i=0;i<matriz.length;i++){
           for(int j=0;j<matriz.length;j++){
               matriz1[i][j]=matriz[j][i];

           }
       }
        System.out.println("la matriz trasnpuesta es la siguiente");
       for(int i=0;i<matriz1.length;i++){
             for(int j=0;j<matriz1.length;j++){
                 
                 System.out.print("("+matriz1[i][j]+")");
             
             }
             System.out.println("");
         }  
    }
 }
    

