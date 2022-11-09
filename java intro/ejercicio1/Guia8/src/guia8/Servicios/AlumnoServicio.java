/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.Servicios;

import guia8.Entidades.Alumno;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class AlumnoServicio {

    List<Alumno> alumno = new ArrayList();

    Alumno a;
    Scanner leer = new Scanner(System.in);

    public Alumno crearAlumno() {
        System.out.println("ingrese el nombre del alumno");
        String nombre=leer.next();
        System.out.println("ingrese la nota nro 1");
       int nota = leer.nextInt();
        System.out.println("ingrese la nota nro 2");
         int nota1 = leer.nextInt();
        System.out.println("ingrese la nota nro 3");
        int nota2 = leer.nextInt();
        a=new Alumno(nombre, nota, nota1, nota2);
        alumno.add(a);
        return a;
    }

    public void motrarAlumno() {
        for (Alumno aux : alumno) {
            System.out.println(aux.toString());
        }
    }
     public double notaFinal(String nombre){
         int notaFinal=0;
         int b=0;
         for (Alumno aux : alumno) {
        if (aux.getNombre().equals(nombre)){
            //System.out.println("el alumno exite");
             notaFinal=(a.getNota()+a.getNota1()+a.getNota2())/3;
        }else{
             b++;
           // System.out.println("el alumno no exite");
        }
            
             
         }
         if (b==alumno.size()){
                System.out.println("el alumno no exite");
            }
         
         return notaFinal;
     }   
    }

