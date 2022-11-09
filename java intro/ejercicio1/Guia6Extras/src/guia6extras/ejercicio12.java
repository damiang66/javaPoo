/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6extras;

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
       /* Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. 
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E*/
       String [] vector1=new String[3];
       int n3= 0;int n2=0; int n1=0;
       String letra="E";
       for(int i=0;i<1000;i++){
           for (int j=0;j<3;j++){
               for(int a=0;a<10;a++){
               n3=a;
               if(n3==3){
                   
                 System.out.println(n1+"-"+n2+"-"+letra);  
               }else
               System.out.println(n1+"-"+n2+"-"+n3);;
               
               }
               for(int b=0;b<10;b++){
                   n2=b;
                    if(n2==3){
                   
                 System.out.println(n1+"-"+letra+"-"+n3);  
               }else
                    System.out.println(n1+"-"+n2+"-"+n3);;
                           
               }
                for(int c=0;c<10;c++){
                   n1=c;
                    if(n1==3){
                   
                 System.out.println(letra+"-"+n2+"-"+n3);  
               }else
                    System.out.println(n1+"-"+n2+"-"+n3);;
                           
               }
                   
           }
           System.out.println("");
           
       }
    }
    
}
