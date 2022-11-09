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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*  Una obra social tiene tres clases de socios: 
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en 
todos los tipos de tratamientos. 
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para 
los mismos tratamientos que los socios del tipo A. 
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos 
tratamientos. 
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor 
real que represente el costo del tratamiento (previo al descuento) y determine el 
importe en efectivo a pagar por dicho socio*/
      Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tipo de socio");
        String socio=leer.next();
        System.out.println("Ingrese el monto del tratamiento");
        double tratamiento = leer.nextDouble();
        socio= socio.toUpperCase();
        System.out.println(tratamiento);
        double precio;
        switch(socio){
                case "A":
                    precio=tratamiento*50/100;
                    System.out.println("el monto del tratamiento es "+precio);
                    break;
                case "B":
                    precio=tratamiento*35/100;
                    System.out.println("el monto del tratamiento es "+precio);
                    break;
                case "C":
                    precio=tratamiento;
                    System.out.println("el monto del tratamiento es "+precio);
                    break;
                default:
                    System.out.println("ingrese un socio valido");
        }
    }
    
}
