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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* 2. Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada 
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores 
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.*/
       Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese 4 valores enteros positivos");
        int a=leer.nextInt();
        int b=leer.nextInt();
        int c=leer.nextInt();
        int d=leer.nextInt();
        System.out.println("el 1er numero ingresado es "+a);
        System.out.println("el 2do numero ingresado es "+b);
        System.out.println("el 3ro numero ingresado es "+c);
        System.out.println("el 4to numero ingresado es "+d);
        int aux=a;
        a=d;
        d=b;
        b=c;
        c=aux;
        System.out.println("el 1er numero queraria "+a);
        System.out.println("el 2do numero quedaria "+b);
        System.out.println("el 3ro numero quedaria "+c);
        System.out.println("el 4to numero quedaria "+d);
    }
    
}
