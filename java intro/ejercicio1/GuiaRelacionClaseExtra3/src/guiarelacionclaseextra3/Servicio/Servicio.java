/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiarelacionclaseextra3.Servicio;

import guiarelacionclaseextra3.Entidades.Cliente;
import guiarelacionclaseextra3.Entidades.Cuota;
import guiarelacionclaseextra3.Entidades.Meses;
import guiarelacionclaseextra3.Entidades.Polizas;
import guiarelacionclaseextra3.Entidades.Vehiculo;
import guiarelacionclaseextra3.Enum.FormaPago;
import guiarelacionclaseextra3.Enum.TipoCobertura;
import guiarelacionclaseextra3.Enum.TipoVehiculo;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int numeroPoliza = 1;

    public Cliente crearCliente() {
        Cliente cliente = new Cliente();
        System.out.println("---------------------");
        System.out.println("Ingrese nombre de Cliente");
        cliente.setNombre(leer.next());
        System.out.println("Ingrese Apeliido de cliente");
        cliente.setApellido(leer.next());
        System.out.println("Ingrese dni del cliente");
        cliente.setDni(leer.nextInt());
        System.out.println("Ingrese email del cliente");
        cliente.setEmail(leer.next());
        System.out.println("Ingrese domicilio del cliente");
        cliente.setDomicilio(leer.next());
        System.out.println("Ingrese telefono del Cliente");
        cliente.setTelefono(leer.next());
        System.out.println("----------Cliente creado-------------");
        return cliente;

    }

    public Vehiculo crearVehiculo() {

        System.out.println("-------------------");
        System.out.println("Ingrese Marca del vehiculo");
        String marca = leer.next();
        System.out.println("Ingrese modelo del vehiculo");
        String modelo = leer.next();
        System.out.println("Ingrese año del vehiculo ");
        int año = leer.nextInt();
        System.out.println("Ingrese numero de motor del vehiculo");
        String numeroMotor = leer.next();
        System.out.println("Ingrese chasis del vehiculo");
        String chasis = leer.next();
        System.out.println("Ingrese color del vehiculo");
        String color = leer.next();
        System.out.println("Ingrese tipo de vehiculo\n "
                + "1-Camioneta\n"
                + "2-Sedan\n"
                + "3-Otro");
        int opcion = leer.nextInt();
        TipoVehiculo tipo;
        switch (opcion) {
            case 1:
                tipo = TipoVehiculo.CAMIONETA;
                break;
            case 2:
                tipo = TipoVehiculo.SEDAN;
                break;
            case 3:
                tipo = TipoVehiculo.OTROS;
                break;
            default:
                tipo = TipoVehiculo.OTROS;
                break;

        }
        Vehiculo m = new Vehiculo(marca, modelo, año, numeroMotor, chasis, color, tipo);
        System.out.println("-------------Vehiculo creado-------------");
        return m;

    }

    public Polizas crearPoliza(Cliente cliente, Vehiculo vehiculo) {

        Polizas p = new Polizas();
        System.out.println("Numero de poliza " + numeroPoliza);
        numeroPoliza++;
        p.setNumeroPoliza(numeroPoliza);
        System.out.println("el cliente de esta poliza es \n"
                + "" + cliente.toString());
        p.setCliente(cliente);
        System.out.println("el vehiculo de esta poliza es \n"
                + "" + vehiculo.toString());
        p.setVehiculo(vehiculo);
        System.out.println("ingrese fecha de inicio en este Formato año/mes/dia");
        String fechaInicio = leer.next();
        p.setFechaInicio(new Date(fechaInicio));
        System.out.println("el fin de la poliza es 3 meses despues del inicio de la poliza");
        Integer mes = p.getFechaInicio().getMonth();
        Integer anio = p.getFechaInicio().getYear();
        Meses fechaFinal = new Meses(mes, anio);
        Integer dia = p.getFechaInicio().getDay();
        String vencimiento = fechaFinal.ano.toString() + "/"+fechaFinal.mes.toString() +"/"+ dia.toString();
        System.out.println(vencimiento);
        p.setFechaFinDePoliza(new Date(vencimiento));
        System.out.println("la cantidad de cuotas son 3");
        p.setCantidadDeCuotas(3);
        System.out.println("Ingrese monto total asegurado");
        p.setMontoTotal(leer.nextDouble());
        System.out.println("Ingrese si esta polica Incluye granizo\n"
                + "1-Si\n"
                + "2-No");
        int granizo = leer.nextInt();
        if (granizo == 1) {
            p.setIncluyeGranizo(true);
        } else {
            p.setIncluyeGranizo(false);
        }
        System.out.println("Ingrese tipo de cobertura\n"
                + "1-TOTAL\n"
                + "2-TERCERO");
        int cobertura = leer.nextInt();
        if (cobertura == 1) {
            p.setTipoCobertura(TipoCobertura.TOTAl);
        } else {
            p.setTipoCobertura(TipoCobertura.TERCERO);
        }
        return p;
    }

    public Cuota crearCuota() {
        System.out.println("----------------------");
        Cuota cuotas = new Cuota();
        int c = 0;

        while (c == 0) {
            System.out.println("Ingrese numero de cuota");
            int cuota = leer.nextInt();
            if (cuota > 3) {
                System.out.println("error las cuotas no pueden ser mayor a 3");

            } else {
                cuotas.setNumeroCuota(cuota);
                c = 1;

            }
        }
        System.out.println("Ingrese monto de la cuota");
        cuotas.setMonto(leer.nextDouble());
        System.out.println("Ingrese si esta pagada\n"
                + "1-SI\n"
                + "2-No");
        int opcion = leer.nextInt();
        if (opcion==1){
            cuotas.setSePago(true);
        }else{
            cuotas.setSePago(false);
        }
        System.out.println("Ingrese fecha de vencimiento");
        String vencimiento=leer.next();
        Date fechaVencimiento = new Date(vencimiento);
        cuotas.setFechaVencimiento(fechaVencimiento);
        System.out.println("Ingrese forma de Pago\n"
                + "1-Contado\n"
                + "2-Tarjeta");
        int pago=leer.nextInt();
        
        if (pago==1){
            cuotas.setFormaPago(FormaPago.CONTADO);
        }else{
            cuotas.setFormaPago(FormaPago.TARGETA);
        }
        return cuotas;
    }
}
