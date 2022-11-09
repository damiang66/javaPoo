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
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio 
de n números (n>0). El valor de n se solicitará al principio del programa y los números 
serán introducidos por el usuario. Realice dos versiones del programa, una usando el 
bucle “while” y otra con el bucle “do - while”*/
       Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de numeros a ingresar");
        int numero=leer.nextInt();
        int contador =0;
        int menor=1000;
        int mayor=0;
        int promedio=0;
        int []vector=new int [numero];
        System.out.println("Realizado en un bucle While");
        while (contador<numero){
            System.out.println("ingrese numeros en el vector");
            vector[contador]=leer.nextInt();
            contador++;
        }
        for (int elementos:vector){
            promedio+=elementos;
            if (menor>elementos){
            menor=elementos;
            }
            if (mayor<elementos){
                mayor=elementos;
            }
        } 
        System.out.println("El numero mayor es "+mayor);
        System.out.println("El numero menor es "+menor);
        System.out.println("El promedio es "+promedio/contador);
        
        //otro bucle do While
         System.out.println("Realizado en un bucle  Do While");
         contador=0;
         promedio=0;
         menor=1000;
         mayor=0;
       do{
            System.out.println("ingrese numeros en el vector");
            vector[contador]=leer.nextInt();
            contador++;
        } while (contador<numero);
        for (int elementos:vector){
            promedio+=elementos;
            if (menor>elementos){
            menor=elementos;
            }
            if (mayor<elementos){
                mayor=elementos;
            }
        } 
        System.out.println("El numero mayor es "+mayor);
        System.out.println("El numero menor es "+menor);
        System.out.println("El promedio es "+promedio/contador);
    }
    
}
