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
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* 11. Escribir un programa que lea un número entero y devuelva el número de dígitos que 
componen ese número. Por ejemplo, si introducimos el número 12345, el programa 
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador 
de división. Nota: recordar que las variables de tipo entero truncan los números o 
resultados*/
        // TODO code application logic here
        Scanner leer =new Scanner(System.in);
        System.out.println("ingrese un numero y le dire cuantos digitos tiene");
        int num=leer.nextInt();
        int resultado=digitos(num);
        System.out.println("la cantidad de digitos que tiene el numero ingresado es "+resultado);
    }
    public static int digitos(int num){
        int d;
        d=0;
        int dividir;
        dividir=num;
        while(dividir>0){
           
            dividir=dividir/10;
            d++;
           
        }
        return d;
    }
}
