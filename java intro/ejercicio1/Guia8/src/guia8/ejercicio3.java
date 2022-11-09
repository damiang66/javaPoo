/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8;

import guia8.Entidades.Alumno;
import guia8.Servicios.AlumnoServicio;
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
        AlumnoServicio as= new AlumnoServicio();
        Scanner leer = new Scanner(System.in);
        String opcion="";
        do{
        Alumno a=as.crearAlumno();
         
            System.out.println("desea seguir cargando alumno");
            opcion= leer.next();
            opcion=opcion.toUpperCase();
            System.out.println(opcion);
        }while(opcion.equals("SI")); 
        System.out.println("ingrese nombre del alumno a buscar");
        String nombre = leer.next();
        as.notaFinal(nombre);
        double notaFinal=as.notaFinal(nombre);
        System.out.println("la nota final es "+notaFinal);
    }
    
}
