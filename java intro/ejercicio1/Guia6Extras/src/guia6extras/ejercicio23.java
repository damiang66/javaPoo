/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6extras;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Damian
 */
public class ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     /*   23. Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida 
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de 
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que 
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras, 
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima 
por pantalla la sopa de letras creada. 
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones 
de Java substring(), Length() y Math.random().*/
    String [][]matriz= new String[20][20];
    Scanner leer=new Scanner(System.in);
    Random azar=new Random();
   List<Integer> vector = new Vector();
    int numero;
    int contador=0;
    int longitud;    
    for(int i=0;i<20;i++){
        for (int j=0;j<20;j++){
            numero=azar.nextInt(9);
            matriz[i][j]=String.valueOf(numero);
        }
    }
    
    for (int a=0;a<5;a++){
        contador=0;
       int fila=azar.nextInt(9);
      vector.add(fila);
  
      
        System.out.println("ingrese una palabra para la sopa de letra");
        String palabra=leer.next();
        longitud=palabra.length();
        
   
        for (int j=0;j<20;j++){
            if(j<longitud){
             
            matriz[fila][j]=palabra.substring(contador,(contador+1));
            contador++;
          //  System.out.print("("+matriz[i][j]+")");
            }
        }
        // System.out.println("");
     
    }
   
       
        System.out.println("sopa de letra generada");
     for(int i=0;i<20;i++){
        for (int j=0;j<20;j++){
            System.out.print("("+matriz[i][j]+")");
        }
         System.out.println("");
    }
        
    }
    
}
