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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*  4. Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su 
equivalente en romano*/
      Scanner leer = new Scanner (System.in);
        System.out.println("ingrese un numero del 1 al 10");
        int numero = leer.nextInt();
        String romano;
        int a=1;
        romano="";
        //while(a!=0){
            
        
        switch(numero){
            case 1:
               romano="|";
               break;
            case 2:
               romano="||";
               break;
            case 3:
               romano="|||";
               break;
            case 4:
               romano="|V";
               break;
            case 5:
               romano="V";
               break;
            case 6:
               romano="V|";
               break;
            case 7:
               romano="V||";
               break;
            case 8:
               romano="V|||";
               break;   
            case 9:
               romano="|X";
               break;  
            case 10:
               romano="X";
               break;
            default:
                System.out.println("ingreso un numero incorrecto");
                a=0;
                
        }
       // }
        
        System.out.println("el numero romano es "+romano);
    }
    
}
