/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2guiarelacion;

import ejercicio2guiarelacion.entidad.Perro;
import ejercicio2guiarelacion.entidad.Persona;
import ejercicio2guiarelacion.servicio.ServicioExtra1;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Damian
 */
public class Ejercicio1Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       ServicioExtra1 serv = new ServicioExtra1();
       Perro p= serv.crearPerro();
       Perro p1=serv.crearPerro();
       List <Perro> listaPerro = new ArrayList();
       listaPerro.add(p);
       listaPerro.add(p1);
       
       serv.mostrarListaPerro(listaPerro);
       Persona persona1 = serv.crearPersona(listaPerro);
       Persona persona2=serv.crearPersona(listaPerro);
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
    }
    
}
