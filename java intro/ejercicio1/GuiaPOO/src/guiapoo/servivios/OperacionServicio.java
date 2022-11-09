/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapoo.servivios;

import guiapoo.entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class OperacionServicio {
    Scanner leer = new Scanner(System.in);
    Operacion o;
    public Operacion crearOperaciones(){
        System.out.println("ingrese el numero 1");
        int numero1 = leer.nextInt();
        System.out.println("ingrese el numero 2");
        int numero2=leer.nextInt();
        o=new Operacion(numero1, numero2);
        return o;
    }        
    public int sumar(){
        return o.getNum1()+o.getNum2();
    }
    public int restar(){
        return o.getNum1()-o.getNum2();
    }
    public int multiplicar(){
        if (o.getNum1()==0 || o.getNum2()==0){
            return 0;
        }else{
            return o.getNum1()*o.getNum2();
        }
    }
    public int dividir(){
        if (o.getNum1()==0 || o.getNum2()==0){
            return 0;
        }else{
            return o.getNum1()/o.getNum2();
        }
    }
}
