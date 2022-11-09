/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7.servivios;

import guia_7.clases.Operaciones;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class OperacionesServicios {
    Operaciones o = new Operaciones();
    Scanner leer = new Scanner(System.in);
    public Operaciones crearOperaciones(){
        System.out.println("ingrese el primer numero");
        o.setNumero1(leer.nextInt());
        System.out.println("ingrese el segundo numero");
        o.setNumero2(leer.nextInt());
        System.out.println("los numeros son");
        System.out.println(o);
        return o;
    }
    /**
     * 
     * @return suma 
     */
    public int sumar(){
        int s=o.getNumero1()+o.getNumero2();
        return s;
    }
    /**
     * 
     * @return resta
     */
    
      public int restar(){
        int r=o.getNumero1()-o.getNumero2();
        return r;
    }
      /**
       * 
       * @return multiplicacion 
       */
        public int multiplicar(){
        int m=o.getNumero1()*o.getNumero2();
        return m;
    }
        /**
         * 
         * @return dividir 
         */
        public double dividir(){
            double d=o.getNumero1()/o.getNumero2();
            return d;
        }
}
