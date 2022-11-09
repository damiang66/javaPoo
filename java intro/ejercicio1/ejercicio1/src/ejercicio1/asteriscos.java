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
public class asteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int numero;
        for(int i=0;i<5;i++){
        System.out.println("Ingrese un numero");
        numero=leer.nextInt();
        for(int j=0;j<numero;j++){
            System.out.print("*");
            
        }
            System.out.println("");
        }
    }
    
}
