/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guiapoo;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class diferenciaDeAño {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Date fechaActual = new Date();
        System.out.println(fechaActual.toString());
        System.out.println("Ingrese una fecha formato año/mes/dia");
        String fecha= leer.next();
        Date fechaIngresada=new Date(fecha);
        System.out.println(fechaIngresada.toString());
       
        int diferencia;
       
        int dia=fechaIngresada.getDay();
        int diaActual=fechaActual.getDay();
        int mesI=fechaIngresada.getMonth();
        int mesA=fechaActual.getMonth();
       long ingresada=fechaIngresada.getTime();
       long actual=fechaActual.getTime();
        System.out.println((actual-ingresada)/1000/60/24/12/365);
                
      
                        
     /*  if (fechaIngresada.getMonth()<fechaActual.getMonth()){
        diferencia=fechaActual.getYear()-fechaIngresada.getYear();
        }else{
           if(fechaActual.getMonth()==fechaIngresada.getMonth()){
               if(fechaActual.getDay()<fechaIngresada.getDay()){
            diferencia=fechaActual.getYear()-fechaIngresada.getYear();   
                   System.out.println("dia menor");
           }else{
                   System.out.println("dia mayor");
           diferencia=(fechaActual.getYear()-fechaIngresada.getYear()-1); 
           }
       }else{
          diferencia= fechaActual.getYear()- fechaIngresada.getYear()-1;     
           }
       }
        System.out.println(diferencia);
       
    }
*/
    }
}
