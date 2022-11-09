/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2guiarelacion.servicio;

import ejercicio2guiarelacion.Raza;
import ejercicio2guiarelacion.entidad.Perro;
import ejercicio2guiarelacion.entidad.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class ServicioExtra1 {

    List<Perro> listaPerro = new ArrayList();
    Scanner leer = new Scanner(System.in);

    public Perro crearPerro() {
        Perro p;
       
        System.out.println("-----------------");
        System.out.println("ingrese nombre Perro");
        String nombre = leer.next();
        System.out.println("ingrese edad de la mascota");
        int edad = leer.nextInt();
        System.out.println("Elija entre estas 3 razas\n"
                + "0-Doberman\n"
                + "1-Callejero\n"
                + "2-Otro");
        int raza = leer.nextInt();
        switch (raza) {
            case 0:
                p = new Perro(nombre, Raza.Doberman, edad);
                break;
            case 1:
                p = new Perro(nombre, Raza.callejero, edad);
                break;
            case 2:
                p = new Perro(nombre, Raza.otro, edad);
                break;
            default:
                 p = new Perro(nombre, Raza.otro, edad);
                break;
        }
       
       
        //listaPerro.add(p);
        return p;
    }

    public void mostrarListaPerro(List<Perro> lista) {
        lista.forEach((perro) -> {
            System.out.println(perro.toString());

        });
        
    }
    public Persona crearPersona(List<Perro>perro){
        Persona p=new Persona();
        System.out.println("----------------------");
        System.out.println("ingrese nombre de la persona");
        p.setNombre(leer.next());
        System.out.println("ingrese dni de la persona");
        p.setDni(leer.nextInt());
          System.out.println("Elija un nombre de perro para adoptar");
        String nombrePerro=leer.next();
        List<Perro> agregar = new ArrayList();
        for (int i = 0; i < perro.size(); i++) {
            if(perro.get(i).getNombre().equals(nombrePerro)){
                agregar.add(perro.get(i));
                p.setMascota(agregar);
            }
        }
        
    
       return p;
      
    }
}
