/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de 
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato 
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser 
X y el último tiene que ser una O. 
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia 
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta 
de FDE, que no respete el formato se considera incorrecta. 
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e 
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las 
siguientes funciones de Java Substring(), Length(), equals().*/
       Scanner leer = new Scanner(System.in);
        
       String frase ="";
       String primero;
       String ultimo;
       int a=0,b=0;
       while(!frase.equals("&&&&&")){
           System.out.println("ingrese una frase");
           frase=leer.next();
           int longitud = frase.length();
           if (longitud>5){
               System.out.println("ingreso una frase incorrecta");
              
           }else{
              primero=frase.substring(0,1);
              ultimo=frase.substring((longitud-1),longitud);
               System.out.println(primero+","+ultimo);
               if (primero.equals("X")&& ultimo.equals("O")){
                   a++;
               } else if(!frase.equals("&&&&&")){
                   
                
                   b++;
               }
               
           }
           
       }
        System.out.println("la cantidad de frase corectas ingresadas es "+a);
        System.out.println("la cantidad de frases incorrectas ingresadas es "+b);
    }
    
}
