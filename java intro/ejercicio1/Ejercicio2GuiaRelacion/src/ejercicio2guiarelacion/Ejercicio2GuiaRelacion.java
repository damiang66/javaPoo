/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2guiarelacion;

import ejercicio2guiarelacion.entidad.Baraja;
import ejercicio2guiarelacion.entidad.Carta;
import ejercicio2guiarelacion.servicio.Servicio;
import java.util.Collections;

/**
 *
 * @author Damian
 */
public class Ejercicio2GuiaRelacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Servicio serv = new Servicio();
        Baraja baraja =serv.crearCarta();
        System.out.println("Cartas Española");
        System.out.println("Cartas creadas");
        for (int i = 0; i < baraja.getCarta().size(); i++) {
            System.out.println(baraja.getCarta().get(i));
        }
        System.out.println("------------------------");
        serv.barajar(baraja);
        System.out.println("----------------------------");
       
         
        serv.siguienteCarta(baraja);
        
        
        System.out.println(serv.cartaDisponibles(baraja));
        serv.darCartas(baraja);
        serv.cartasMonton(baraja);
        serv.mostrarBeraja(baraja);
     
    }
    
}
