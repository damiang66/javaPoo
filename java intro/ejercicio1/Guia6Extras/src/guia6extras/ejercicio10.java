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
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*  10. Realice un programa para que el usuario adivine el resultado de una multiplicación entre 
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario 
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir 
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como 
utilizar la función Math.random() de Java*/
      Random aleatorio = new Random();
      Scanner leer = new Scanner(System.in);
        int num,num1,m ;
        num1=aleatorio.nextInt(1+10);
        num=aleatorio.nextInt(1+10);
        m=num*num1;
        int adivinar=10000000;
        System.out.println(num+","+num1+","+m+"");
        while (m!=adivinar){
            System.out.println("adivine el resultado de la division");
            adivinar= leer.nextInt();
            if (adivinar==m){
                System.out.println("felicitaciones!!!!!!!!!!");
            }else
                System.out.println("vuelta a intenarlo nuevamente");
        }
        
    }
    
}
