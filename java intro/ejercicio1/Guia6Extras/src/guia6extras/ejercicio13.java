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
public class ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Crear un programa que dibuje una escalera de números, donde cada línea de números 
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al 
usuario al comenzar. Ejemplo: si se ingresa el número 3: 
1
12
123*/
        int num=1;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamaño de la escalera");
        int t = leer.nextInt();
        for(int i =0;i<(t+1);i++){
            num=1;
            for(int j=0;j<i;j++){
                System.out.print(num);
                 num++;
            }
        
           System.out.println(""); 
        }
        
    }
    
}
