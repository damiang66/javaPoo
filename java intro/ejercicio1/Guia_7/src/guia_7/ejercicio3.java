/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7;

import guia_7.servivios.OperacionesServicios;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    /*
    3. Crear una clase llamada Operacion que tenga como atributos privados numero1 y 
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en 
los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si 
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si 
no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar 
una división por cero, el método devuelve 0 y se le informa al usuario el error se le 
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.

     */
    public static void main(String[] args) {
        // TODO code application logic here
        OperacionesServicios os = new OperacionesServicios();
        os.crearOperaciones();
        Scanner leer = new Scanner(System.in);
        //int sumar,restar,multiplicar,dividir;
        int opcion = 0;
        do {
            System.out.println("Menu");
            System.out.println("Ingrese que operaciones desea realizar");
            System.out.println("1-Sumar");
            System.out.println("2-Restar");
            System.out.println("3-Multiplicar");
            System.out.println("4-dividir");
            System.out.println("5-Salir");
            System.out.println("6-nuevos numeros");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("la suma es " + os.sumar());
                    break;
                case 2:
                    System.out.println("la resta es " + os.restar());
                    break;
                case 3:
                    System.out.println("la multiplicacion es " + os.multiplicar());
                    break;
                case 4:
                    System.out.println("la divicion es " + os.dividir());
                    break;
                case 5:
                    System.out.println("sistema finalizado");
                    break;
                case 6:
                    os.crearOperaciones();
                    break;

            }
        } while (opcion != 5);
    }

}
