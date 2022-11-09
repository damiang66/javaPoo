/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiarelacionclaseextra3;

import guiarelacionclaseextra3.Entidades.Cliente;
import guiarelacionclaseextra3.Entidades.Cuota;
import guiarelacionclaseextra3.Entidades.Meses;
import guiarelacionclaseextra3.Entidades.Polizas;
import guiarelacionclaseextra3.Entidades.Vehiculo;
import guiarelacionclaseextra3.Servicio.Servicio;
import java.util.Date;

/**
 *
 * @author Damian
 */
public class GuiaRelacionClaseExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Servicio servicio = new Servicio();
        Cliente cliente = servicio.crearCliente();
        Vehiculo vehiculo = servicio.crearVehiculo();
        Polizas poliza = servicio.crearPoliza(cliente, vehiculo);
        Cuota cuota = servicio.crearCuota();
        System.out.println(cliente.toString());
        System.out.println(vehiculo.toString());
        System.out.println(poliza.toString());
        System.out.println(cuota.toString());
    }

}
