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
public class Guia6Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*   1. Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el 
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*/
     Scanner leer = new Scanner(System.in);
        System.out.println("ingrese los minutos");
        int minutos=leer.nextInt();
       int dia= Math.round(minutos/1440);
         int horas=Math.round((minutos %1440)/60);
//double horas=(minutos % 1400)/70;
        System.out.println ("son "+dia+" dia con "+horas + " HS");
       
        
    }
    
}
