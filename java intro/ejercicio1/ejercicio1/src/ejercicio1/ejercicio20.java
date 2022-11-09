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
public class ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*  20. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la 
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que 
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. 
El programa deberá comprobar que los números introducidos son correctos, es decir, 
están entre el 1 y el 9*/
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        
        int[] fila = new int[3];
        int[] columna = new int[3];
        int principal = 0;
        int secundaria = 0;
        int numero;
        //ingreso los datos a la matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("ingrese un numero en la fila " + i + " columna " + j);
                numero = leer.nextInt();
                if (numero > 0 && numero < 10) {
                    matriz[i][j] = numero;
                } else {
                    System.out.println("ingrese un numero no valido");
                    j--;
                }

            }

        }
        //muestro los datos de la matriz
        System.out.println("los datos que contienen la matriz son:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("(" + matriz[i][j] + ")");

            }
            System.out.println("");
        }
        principal = diagonalP(matriz);
        secundaria=diagonalS(matriz);
        sumarFilas(fila,matriz);
        sumarColumnas(columna,matriz);
       // System.out.println("diagonal principal");
      //  System.out.println(principal+","+secundaria);
      /*  for(int i:columna){
            System.out.print("("+i+")");
        }
        System.out.println("");
        for(int elementos:fila){
            System.out.print("("+elementos+")");
        }*/
        int verificador=comparar(columna,fila,principal,secundaria);
            if (verificador==3){
                System.out.println("la matriz es magica");
            }else{
                System.out.println("la matriz no es magica");
            }
    }
    public static int comparar(int[]c,int []f,int d, int s){
        int contador=0;
       if (d==15&&s==15){
           for (int i = 0; i < 3; i++) {
               if (c[i]==15&&f[i]==15){
                   contador++;
               }
           }
            
        
           
       }
        return contador;
    }
    public static void sumarColumnas(int[]columna,int [][]m){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                columna[i]+=m[j][i];
            }
        }
    }
    public static void sumarFilas(int []fila,int[][]m){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                fila[i]+=m[i][j];
            }
        }
    }
    public static int diagonalS(int [][]m){
       /* c=cantidad-1
	para f=0 Hasta cantidad-1
		
		d1=d1+m(f,c)
		c=c-1
	FinPara*/
       int c=2;
       int d=0;
        for (int i = 0; i < 3; i++) {
            d+=m[i][c];
            c--;
        }
        return d;
    }
    public static int diagonalP(int[][] m) {
        int p = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    p += m[i][j];
                }
            }
        }

        return p;
    }
}
