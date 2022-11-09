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
public class ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* 16. Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de 
las personas ingresadas por teclado e indique si son mayores o menores de edad. 
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
mostrando personas y frenar cuando el usuario ingrese la palabra “No”*/
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de personas que desea ingresar los datos");
        int personas = leer.nextInt();
        int edad = 0;
        String nombre = "";
        String opcion;
        for (int i = 0; i < personas; i++) {
            if (i == 0) {
                pedirDatos(nombre, edad);
            } else {
                System.out.println("desea seguir cargando datos con 'NO' sale del sistema ");
                opcion = leer.next();
                if (opcion.equals("NO")) {
                    break;
                } else {
                    pedirDatos(nombre, edad);
                }
            }

        }
    }

    public static void pedirDatos(String n, int e) {
        System.out.println("Ingrese su nombre");
        Scanner leer = new Scanner(System.in);
        n = leer.nextLine();
        System.out.println("ingrese su edad");
        e = leer.nextInt();
        if (e >= 18) {
            System.out.println("usted es mayor de edad");
        } else {
            System.out.println("usted es menor de edad");
        }
    }

}
