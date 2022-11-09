/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapoo;

import guiapoo.entidades.Cafetera;
import guiapoo.servivios.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        6. Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad 
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos: 
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual 
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el 
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la 
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El 
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en 
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero. 
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo 
recibe y se añade a la cafetera la cantidad de café indicada
         */
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        CafeteraServicio cs = new CafeteraServicio();
        int a = 0;
        do {
            System.out.println("Menu\n"
                    + "1-llenar Cafetera\n"
                    + "2-Servir Taza\n"
                    + "3-Vaciar Cafetera\n"
                    + "4-Agregar Cafe\n"
                    + "5-Mostrar lo que tiene la cafetera\n"
                    + "6-Salir");
            String opcion = leer.next();
            switch (opcion) {
                case "1":
                    Cafetera c = cs.llenarCafetera();
                    System.out.println("llenando cafetera");
                    break;
                case "2":

                    System.out.println("ingrese tamaño de la taza de servir");
                    int taza = leer.nextInt();
                    cs.servirTaza(taza);
                    break;
                case "3":

                    System.out.println("vaciando Cafetera");

                    cs.vaciarCaferera();
                    break;
                case "4":

                    System.out.println("Ingrese la cantidad de cafe para agregar");
                    int agregar = leer.nextInt();
                    cs.agregarCafe(agregar);
                    break;
                case "5":
                    cs.mostrar();
                    break;
                            
                case "6":

                    System.out.println("Saliendo del Sistema");

                    a = 5;
                    break;
                default:
                    System.out.println("ingrese una opcion valida");
                    break;
            }
        } while (a != 5);
    }

}
