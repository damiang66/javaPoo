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
public class ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   /*     Simular la división usando solamente restas. Dados dos números enteros mayores que 
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método: 
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este 
resultado es el residuo, y el número de restas realizadas es el cociente. 
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada 
37 – 13 = 24 dos restas realizadas 
24 – 13 = 11 tres restas realizadas 
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3*/
   Scanner leer = new Scanner(System.in);
        System.out.println("ingrese dos numeros mayores que uno para dividir");
        int num = leer.nextInt();
        int num1 = leer.nextInt();
        int resto=num;
        int contador=0;
        if (num1>1 && num>1 && num>num1){
            while(resto>num1){
                resto=resto-num1;
                contador++;
            }
            System.out.println("el recidio es "+resto);
            System.out.println("el cociente es "+contador);
        }else
            System.out.println("error al ingresar los datos");
        
            
   
    }
    
}
