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
public class ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*  15. Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, 
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación 
matemática y deben devolver sus resultados para imprimirlos en el main.*/
      Scanner leer= new Scanner(System.in);
        System.out.println("ingrese dos numeros para realizar operaciones matematica");
        int num = leer.nextInt();
        int num1 = leer.nextInt();
        System.out.println("MENU");
        System.out.println("Ingrese que operacion matematica desea realizar");
        System.out.println("1-Sumar");
        System.out.println("2-Restar");
        System.out.println("3-Multiplicar");
        System.out.println("4-Dividir");
        int opcion = leer.nextInt();
        int resultado;
        switch(opcion){
            case 1:
                resultado=sumar(num,num1);
                System.out.println("el resultado de la suma es "+resultado);
                break;
            case 2:
                 resultado=restar(num,num1);
                System.out.println("el resultado de la resta es "+resultado);
                break;
            case 3:
                resultado=m(num,num1);
                System.out.println("el resultado de la multiplicacion es "+resultado);
                break;  
             case 4: 
                resultado=d(num,num1);
                System.out.println("el resultado de la division es "+resultado);
                break;  
        }
        
      
    }
    public static int sumar(int n,int n1){
        int r;
        r=n+n1;
        return r;
    }
    public static int restar(int n,int n1){
        int r;
        r=n-n1;        
        return r;
    }
   public static int m(int n,int n1){
        int r;
        r=n*n1;        
        return r;
    } 
   public static int d(int n,int n1){
        int r;
        r=n/n1;        
        return r;
    } 
}
