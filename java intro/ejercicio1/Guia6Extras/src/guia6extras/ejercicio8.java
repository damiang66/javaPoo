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
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*8. Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe 
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y 
la cantidad de números impares. Al igual que en el ejercicio anterior los números 
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.*/
        Scanner leer= new Scanner(System.in);
       int numero=1;
       int contador=0;
       int par=0;int inpar=0;
        while (numero % 5!=0){
            System.out.println("ingrese numeros enteros positivos");
         numero= leer.nextInt();
         if (numero>0){
         if (numero %5==0){
             break;
         }
         if (numero %2==0){
             par++;
         }else{
             inpar++;
         }
      
             
         contador++;
         }
        }
        System.out.println("la cantidad de numeros ingresados es "+contador);
        System.out.println("la cantidad de numeros pares ingresados es "+par);
        System.out.println("la cantidad de numeros inpares ingresados es "+inpar);
        
    }
    
}
