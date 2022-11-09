/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2guiarelacion.servicio;

import ejercicio2guiarelacion.entidad.Baraja;
import ejercicio2guiarelacion.entidad.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Servicio {

    Scanner leer = new Scanner(System.in);
    int contador = 0;
    int cantidad = 0;
    List<Carta> listacarta = new ArrayList();

    public Baraja crearCarta() {
        Baraja baraja;
        Carta carta = new Carta();
        List<String> palos = new ArrayList();
        palos.add("Espada");
        palos.add("Basto");
        palos.add("Oro");
        palos.add("Copa");
        for (int i = 1; i < 13; i++) {
            carta.setNumero(i);
            for (int j = 0; j < palos.size(); j++) {
                if (i != 8 && i != 9) {
                    carta.setPalo(palos.get(j));
                    // System.out.println(carta.toString());
                    listacarta.add(new Carta(carta.getNumero(), carta.getPalo()));
                }
            }

        }
        /*
          for (int i = 0; i < listacarta.size(); i++) {
            System.out.println(listacarta.get(i));
        }
         */

        System.out.println("se crearon " + listacarta.size());

        return baraja = new Baraja(listacarta);

    }

    public void barajar(Baraja baraja) {
        System.out.println("----------------------");
        Collections.shuffle(baraja.getCarta());
        System.out.println("carta desordenadas");
        for (int i = 0; i < baraja.getCarta().size(); i++) {
            System.out.println(baraja.getCarta().get(i));
        }
    }

    public void siguienteCarta(Baraja baraja) {
        System.out.println("------------------------");
        System.out.println(baraja.getCarta().get(contador));
        contador++;
        if (contador == baraja.getCarta().size()) {
            System.out.println("no se encuentra mas cartas");
        }

    }

    public int cartaDisponibles(Baraja b) {

        return b.getCarta().size() - contador;
    }

    public int darCartas(Baraja b) {
        System.out.println("----------------------");
        System.out.println("ingrese numero de cartas");
        try {
            cantidad = leer.nextInt();
            if (cantidad > this.cartaDisponibles(b)) {
                System.out.println("no se tiene suficientes cartas");
                return cantidad;
            } else {
                for (int i = cantidad; i < b.getCarta().size(); i++) {
                    System.out.println(b.getCarta().get(i));
                }
                return cantidad;
            }

        } catch (Exception e) {
            System.out.println(e);

            return cantidad;
        }

    }
   public void cartasMonton(Baraja b){
       System.out.println("--------------------");
       System.out.println("las cartas que ya salieron son:");
       if (cantidad==0){
           System.out.println("no se ha dado ninguna carta");   
       }else{
       for (int i = 0; i < cantidad; i++) {
           System.out.println(b.getCarta().get(i));
       }
       }
   }
   public void mostrarBeraja(Baraja b){
       System.out.println("----------------------");
       System.out.println("las cartas disponibles son");
       for (int i = cantidad; i < b.getCarta().size(); i++) {
           System.out.println(b.getCarta().get(i));
           
       }
   }
}
