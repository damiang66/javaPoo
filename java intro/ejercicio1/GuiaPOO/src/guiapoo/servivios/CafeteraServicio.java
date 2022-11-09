/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapoo.servivios;

import guiapoo.entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
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
public class CafeteraServicio {
   Scanner leer = new Scanner(System.in);
   Cafetera c ;
   public Cafetera llenarCafetera(){
       int maxima = 1000;
       int actual=maxima;
       c= new Cafetera(maxima, actual);
       return c;
   }
   public void servirTaza(int taza){
      // 
       if (taza>c.getCapacidadActual()&&c.getCapacidadActual()!=0){
           System.out.println("no tiene suficiente cafe la maquina");
           int sobra=taza-c.getCapacidadActual();
           c.setCapacidadActual(c.getCapacidadActual()-sobra);
           System.out.println("se sirvio de cafe "+ sobra);
       }
       if (taza==c.getCapacidadActual()){
           System.out.println("al llenar la taza se termina el cafe en la maquina");
           c.setCapacidadActual(c.getCapacidadActual()-taza);
       }
       if (taza<c.getCapacidadActual()){
           c.setCapacidadActual(c.getCapacidadActual()-taza);
       }
   }
       public void vaciarCaferera(){
           c.setCapacidadActual(0);
       }
       public void agregarCafe(int agregar){
           int total=c.getCapacidadActual()+agregar;
           if (total<c.getCapacidadMaxima()){
               c.setCapacidadActual(c.getCapacidadActual()+agregar);
           }else{
               System.out.println("no se puede agregar mas cafe que la capacidad maxima que tiene la cafetera");
       }
               
       }
       public void mostrar(){
           System.out.println(c.toString());
       }
   }

