/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaherenciaejercicio2;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
        List<Electrodomestico> lista = new ArrayList();
        Lavadora l1 = new Lavadora(25, 0, "rojo", "A", 20d,"L");
        Lavadora l2 = new Lavadora(45, 0, "azul", "B", 60d,"L");
        Lavadora l3 = new Lavadora(85, 0, "blanco", "c", 100d,"L");
        Televisor t1 = new Televisor(30, true, 0, "negro", "F", 20d,"T");
        lista.add(t1);
        lista.add(l2);
        lista.add(l3);
        lista.add(l1);
        int precioTotal=0;
        int precioT=0;
        int precioL=0;
        for (int i = 0; i < lista.size(); i++) {
            
            lista.get(i).precioFinal();
            
            System.out.println("el precio del electrodomestico es "+lista.get(i).getPrecio());
            precioTotal+=lista.get(i).getPrecio();
            if(lista.get(i).getTipo().equals("T")){
                precioT+=lista.get(i).getPrecio();
            }else{
                precioL+=lista.get(i).getPrecio();
            }
                
        }
        System.out.println("-----------------");
        System.out.println("el precio total es "+precioTotal);
        System.out.println("el precio total de lavarropa es "+precioL);
        System.out.println("el precio total de los Televisores es "+precioT);
        
    }

}
