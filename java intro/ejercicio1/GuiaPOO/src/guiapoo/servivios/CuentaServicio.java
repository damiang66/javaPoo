/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapoo.servivios;

import guiapoo.entidades.Cuenta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class CuentaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cuenta c;
    List<Cuenta> listaCuenta = new ArrayList();
    public Cuenta crearCuenta() {
        System.out.println("ingrese numero de cuenta");
        int numeroCuenta = leer.nextInt();
        System.out.println("ingrese el dni del cliente");
        int dni = leer.nextInt();
        double saldo = 0;
        
        c = new Cuenta(numeroCuenta, dni, saldo);
        listaCuenta.add(c);
        return c;
    }

    public void ingresarDinero(double ingreso) {

        c.setSaldoActual(ingreso);
    }

    public void retirar(double retirar) {
        if (c.getSaldoActual() < retirar) {
            System.out.println("no tiene saldo suficiente");
            c.setSaldoActual(0);
        } else {
            c.setSaldoActual(c.getSaldoActual() - retirar);
        }

    }

    public void extraccionRapida() {
        System.out.println("ingrese el dinero que quiere retirar");
        double retira = leer.nextDouble();
        double porciento = c.getSaldoActual() * 20 / 100;
        System.out.println("dinero disponible para retirar" + porciento);
        if (retira > porciento) {
            System.out.println("solamente puede retirar un 20% de su saldo actual");
        } else {
            c.setSaldoActual(c.getSaldoActual() - retira);
        }
    }

    public double consultarSaldo() {
        return c.getSaldoActual();
    }

    public void consultarDatos() {
        System.out.println(c.toString());
    }
    public void mostrarLista(){
    
        for (Cuenta cuenta : listaCuenta) {
            
            System.out.println(cuenta);
            
        }
        
    }
    

}
