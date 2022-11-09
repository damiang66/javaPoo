/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    /*
    2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
se mostrará la lista ordenada
    */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner leer = new Scanner(System.in).useDelimiter("\n");
        List<String>raza= new ArrayList();
        String opcion="";
        while (!opcion.equals("1")){
            System.out.println("ingrese una raza de perro");
            raza.add(leer.next());
            System.out.println("desea salir con el 1 se sale");
            opcion=leer.next();
        }
        System.out.println("la razas que ingreso son");
        for (String aux : raza) {
            System.out.println(aux);
            
        }
        //arranca el ejercicio 2
        System.out.println("ingrese un perro");
        String perro = leer.next();
      Iterator it=raza.iterator();
      int contador=0;
        while (it.hasNext()) {
            if(it.next().equals(perro)){
                contador++;
                it.remove();
            }else{
                //System.out.println("el perro no se encontro");
                     }
            
        }
        if (contador>0){
            System.out.println("el perro se encontro");
        }else{
            System.out.println("el perro no se encontro");
        }
            
            Collections.sort(raza);
            for (String aux : raza) {
                System.out.println(aux);
        }
        
        
    }
    
}
