/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapoo;

import guiapoo.entidades.Cuenta;
import guiapoo.servivios.CuentaServicio;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaServicio cs = new CuentaServicio();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int a = 0;
       
        Cuenta c = cs.crearCuenta();
        /*
        Cuenta c1 = cs.crearCuenta();
        Cuenta c2 = cs.crearCuenta();
        Cuenta c3 = cs.crearCuenta();
        Cuenta c4 = cs.crearCuenta();
*/
        do {
            System.out.println("Menu\n"
                    + "1-Ingrese dinero a la cuenta\n"
                    + "2-Retirar dinero\n"
                    + "3-Extraccion Rapida\n"
                    + "4-Consultar Saldo\n"
                    + "5-Consultar Datos\n"
                    + "6-Salir");
            String opcion = leer.next();
            switch (opcion) {
                case "1":
                    System.out.println("ingrese la cantidad de dinero");
                    double ingresar = leer.nextDouble();
                    cs.ingresarDinero(ingresar);
                    System.out.println("se ingreso en la cuenta " + ingresar);
                    break;
                case "2":
                    System.out.println("Ingrese el dinero a retirar");
                    double retira = leer.nextDouble();
                    cs.retirar(retira);
                    break;
                case "3":
                    cs.extraccionRapida();
                    break;
                case "4":
                    System.out.println("el saldo de su cuenta es " + cs.consultarSaldo());
                    break;
                case "5":
                    cs.consultarDatos();
                    break;
                case "6":
                    a = 1;
                    System.out.println("Saliendo del Sistema");
                    break;
                default:
                    System.out.println("elija una opcion valida");
                    break;
            }
        } while (a == 0);
  
                System.out.println("moestramos la lista generada");
        cs.mostrarLista();
  
       
       
    }

}
