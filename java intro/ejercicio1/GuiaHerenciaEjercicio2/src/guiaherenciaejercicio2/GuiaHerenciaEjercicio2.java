package guiaherenciaejercicio2;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Damian
 */
public class GuiaHerenciaEjercicio2 {

    public static void main(String[] args) {
        Lavadora lavadora = new Lavadora();
        Televisor televisor = new Televisor();
        List<Electrodomestico> lista = new ArrayList();

        for (int i = 0; i < 2; i++) {
            System.out.println("----------------------");
            System.out.println("ingrese los datos de la Lavadora");
            lavadora.crearLavadora();
            lavadora.precioFinal();
            System.out.println("--------------------------------");
            System.out.println("Ingrese los datos del televisor");
            televisor.crearTelevisor();
            televisor.precioFinal();
            lista.add(televisor);
            lista.add(lavadora);
        }
        for (Electrodomestico aux : lista) {
            System.out.println(aux.getColor());
        }

        System.out.println("El precio final de la Lavadora es " + lavadora.getPrecio() + " el color es " + lavadora.getColor());

        System.out.println("----------------------------------");
        System.out.println("El precio final de la Lavadora es " + lavadora.getPrecio() + " el color es " + lavadora.getColor());
        System.out.println("El precio final del Televisor es " + televisor.getPrecio() + "el color es " + televisor.getColor());
    }

}
