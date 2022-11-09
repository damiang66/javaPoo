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
public class ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*  Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos 
de 2 dígitos, etcétera (hasta 5 dígitos)*/
      Scanner leer = new Scanner(System.in);
        System.out.println("ingrese tamalo del vector");
        int longitud = leer.nextInt();
        String[]vector = new String[longitud];
        int a,b,c,d,e;
        a=0;
        b=0;
        c=0;
        d=0;
        e=0;
  
                
        for (int i=0;i<vector.length;i++){
            System.out.println("ingrese numeros enteros en el vector");
            vector[i]= leer.next();
            
        }
        for (int i=0;i<vector.length;i++){
             if(vector[i].length()==1){
                a++;
            }
             if(vector[i].length()==2){
                b++;
            }
             if(vector[i].length()==3){
                c++;
            }
             if(vector[i].length()==4){
                d++;
            }
             if(vector[i].length()==5){
               e++;
            }
            
         //   System.out.println(b);
          //  System.out.println(c);
           // System.out.println(d);
            //System.out.println(e); 
        }
        
        System.out.println("con un digito son "+a);
        System.out.println("con dos digito son "+b);
        System.out.println("con tres digito son "+c);
        System.out.println("con cuatro digito son "+d);
        System.out.println("con cinco digito son "+e); 
        
        
    }
    
}
