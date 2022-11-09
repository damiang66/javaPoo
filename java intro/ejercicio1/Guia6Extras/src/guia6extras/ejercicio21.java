/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6extras;

import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* 21. Los profesores del curso de programación de Egg necesitan llevar un registro de las notas 
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y 
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos 
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del 
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y 
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o 
igual al 7 de sus notas del curso*/
       Scanner leer=new Scanner(System.in);
       double primerTrabajo,segundoTrabajo,primerIntegrador,segundoIntegrador;
       int a=0;
       int d=0;
       double []vector=new double[9];
       for(int i=0;i<9;i++){
           System.out.println("ingrese la nota del primer trabajo del alumno nro "+i);
           primerTrabajo=leer.nextDouble();
           primerTrabajo*=0.1;
           System.out.println("ingrese la nota del segundo trabajo del alumno nro "+i);
           segundoTrabajo=leer.nextDouble();
           segundoTrabajo*=0.15;
           System.out.println("ingrese la nota del primer integrador del alumno nro "+i);
           primerIntegrador=leer.nextDouble();
           primerIntegrador*=0.25;
           System.out.println("ingrese la nota del segundo integrador del alumno nro "+i);
           segundoIntegrador=leer.nextDouble();
           segundoIntegrador*=0.15;
           vector[i]=(primerTrabajo+segundoTrabajo+primerIntegrador+segundoIntegrador)/4;
       }
       for (double notas:vector){
           if(notas>=7){
               a++;
           }else{
               d++;
           }
               System.out.println("la cantidad de alumnos aprobados es "+a);
               System.out.println("la cantidad de alumnos desaprobados es "+d);
       } 
    }
    
}
