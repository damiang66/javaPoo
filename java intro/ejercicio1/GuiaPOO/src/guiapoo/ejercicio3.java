/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapoo;

import guiapoo.entidades.Operacion;
import guiapoo.servivios.OperacionServicio;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        OperacionServicio op = new OperacionServicio();
        Operacion operacion = op.crearOperaciones();
        System.out.println("los numeros con los que vamos a operar");
        System.out.println(operacion);
        String opcion;
        int a = 0;
        do {
            System.out.println("Menu\n1-Sumar\n2-Restar\n3-Multiplicar\n4-Dividir\n5-Salir");
            opcion = leer.next();
            switch (opcion) {
                case "1":
                    System.out.println("la suma es " + op.sumar());
                    break;
                case "2":
                    System.out.println("la resta es " + op.restar());
                    break;
                case "3":
                    if (op.multiplicar()==0){
                        System.out.println("error");
                    }else{
                    System.out.println("la multiplicacion es " + op.multiplicar());
                    
                    }
                    break;
                case "4":
                    if (op.dividir()==0){
                        System.out.println("error");
                        
                    }else{
                    System.out.println("la division es " + op.dividir());
                 
                    }
                   break;
                case "5":
                    System.out.println("salir");
                    a = 1;
                    break;
                default:
                    System.out.println("ingrese una opcion valida");
                    break;

            }
        } while (a == 0);
    }

}
