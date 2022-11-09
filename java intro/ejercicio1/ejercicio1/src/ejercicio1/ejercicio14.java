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
public class ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* Crea una aplicación que a través de una función nos convierta una cantidad de euros 
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La 
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será 
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio 
(void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €*/
       Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Euros");
        double euros = leer.nextDouble();
        System.out.println("Ingrese la moneda a convertir");
        String moneda = leer.next();
        cambiar(euros,moneda);
        
    }
    public static void cambiar(double euros, String moneda){
        switch (moneda){
            case "libras":
                System.out.println("en libras es: "+(0.86*euros));
                break;
            case "dolar":
                System.out.println("en dolar es: "+(1.28611*euros));
                break;
            case "yenes":
                System.out.println("en yenes es; "+ (129.852*euros));
                break;
        }
    }
}
